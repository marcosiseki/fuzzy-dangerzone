DELIMITER |

#-------------------------------------------
#-- Criação do Banco de dados.
#-------------------------------------------
CREATE DATABASE IF NOT EXISTS `Biblioteca` COLLATE = "utf8_unicode_ci";
|

USE `Biblioteca`;
|

#-------------------------------------------
#-- Criação das Tabelas
#-------------------------------------------
CREATE TABLE IF NOT EXISTS `Pessoa` (
	cpf VARCHAR(11) NOT NULL
,	nome VARCHAR(100) NOT NULL
,	email VARCHAR(60) NOT NULL
,	telefone VARCHAR(25) NOT NULL
,	senha VARCHAR(128) NOT NULL
,	ativo BOOLEAN NOT NULL DEFAULT TRUE
,		PRIMARY KEY(`cpf`)
,		UNIQUE(`email`)
) ENGINE = "InnoDB";
|

CREATE TABLE IF NOT EXISTS `Administrador` (
	cpf VARCHAR(11) NOT NULL
,		PRIMARY KEY(`cpf`)
,		FOREIGN KEY(`cpf`) REFERENCES `Pessoa`(`cpf`) ON UPDATE CASCADE
) ENGINE = "InnoDB";
|

CREATE TABLE IF NOT EXISTS `Secretario` (
	cpf VARCHAR(11) NOT NULL
,	admin VARCHAR(11) NOT NULL
,		PRIMARY KEY(`cpf`)
,		FOREIGN KEY(`cpf`) REFERENCES `Pessoa`(`cpf`) ON UPDATE CASCADE
,		FOREIGN KEY(`admin`) REFERENCES `Administrador`(`cpf`) ON UPDATE CASCADE
) ENGINE = "InnoDB";
|

CREATE TABLE IF NOT EXISTS `Leitor` (
	cpf VARCHAR(11) NOT NULL
,	admin VARCHAR(11) NOT NULL
,	diasemprestimo INT NOT NULL
,		PRIMARY KEY(`cpf`)
,		FOREIGN KEY(`cpf`) REFERENCES `Pessoa`(`cpf`) ON UPDATE CASCADE ON DELETE CASCADE
,		FOREIGN KEY(`admin`) REFERENCES `Administrador`(`cpf`) ON UPDATE CASCADE
) ENGINE = "InnoDB";
|

CREATE TABLE IF NOT EXISTS `Professor` (
	cpf VARCHAR(11) NOT NULL
,	titulacao ENUM('Graduado', 'Mestre', 'Doutor') NOT NULL
,		PRIMARY KEY(`cpf`)
,		FOREIGN KEY(`cpf`) REFERENCES `Leitor`(`cpf`) ON UPDATE CASCADE
) ENGINE = "InnoDB";
|

CREATE TABLE IF NOT EXISTS `Aluno` (
	cpf VARCHAR(11) NOT NULL
,	conclusao DATE NOT NULL
,		PRIMARY KEY(`cpf`)
,		FOREIGN KEY(`cpf`) REFERENCES `Leitor`(`cpf`) ON UPDATE CASCADE ON DELETE CASCADE
) ENGINE = "InnoDB";
|

CREATE TABLE IF NOT EXISTS `Titulo` (
	id INT NOT NULL AUTO_INCREMENT
,	titulo VARCHAR(150) NOT NULL
,	edicao INT NOT NULL
,	volume INT NOT NULL
,	ano YEAR(4) NOT NULL
,	autores TEXT NOT NULL
,	descricao TEXT NOT NULL
,	quantidade INT NOT NULL
,		PRIMARY KEY(`id`)
) ENGINE = "InnoDB";
|

CREATE TABLE IF NOT EXISTS `Livro` (
	titulo INT NOT NULL
,	isbn BIGINT NOT NULL
,	editora VARCHAR(50) NOT NULL
,		PRIMARY KEY(`titulo`)
,		FOREIGN KEY(`titulo`) REFERENCES `Titulo`(`id`) ON UPDATE CASCADE
,		UNIQUE(`isbn`)
) ENGINE = "InnoDB";
|

CREATE TABLE IF NOT EXISTS `Dissertacao` (
	titulo INT NOT NULL
,	orientadores TEXT NOT NULL
,	palavrachave TEXT NOT NULL
,	area TEXT NOT NULL
,		PRIMARY KEY(`titulo`)
,		FOREIGN KEY(`titulo`) REFERENCES `Titulo`(`id`) ON UPDATE CASCADE
) ENGINE = "InnoDB";
|

CREATE TABLE IF NOT EXISTS `Exemplar` (
	id INT NOT NULL AUTO_INCREMENT
,	titulo INT NOT NULL
,	disponivel INT NOT NULL DEFAULT 1
,		PRIMARY KEY(`id`)
,		FOREIGN KEY(`titulo`) REFERENCES `Titulo`(`id`) ON UPDATE CASCADE
) ENGINE = "InnoDB";
|

CREATE TABLE IF NOT EXISTS `Emprestimo` (
	id INT NOT NULL AUTO_INCREMENT
,	leitor VARCHAR(11) NOT NULL
,	secretario VARCHAR(11) NOT NULL
,	retirada TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
,		PRIMARY KEY(`id`)
,		FOREIGN KEY(`leitor`) REFERENCES `Leitor`(`cpf`) ON UPDATE CASCADE
,		FOREIGN KEY(`secretario`) REFERENCES `Secretario`(`cpf`) ON UPDATE CASCADE
) ENGINE = "InnoDB";
|

CREATE TABLE IF NOT EXISTS `ItemEmprestimo` (
	emprestimo INT NOT NULL
, 	exemplar INT NOT NULL
,	devolucao DATE NOT NULL
,		PRIMARY KEY(`emprestimo`, `exemplar`)
,		FOREIGN KEY(`emprestimo`) REFERENCES `Emprestimo`(`id`) ON UPDATE CASCADE ON DELETE CASCADE
,		FOREIGN KEY(`exemplar`) REFERENCES `Exemplar`(`id`) ON UPDATE CASCADE
) ENGINE = "InnoDB";
|

CREATE TABLE IF NOT EXISTS `Reserva` (
	id INT NOT NULL AUTO_INCREMENT
,	leitor VARCHAR(11) NOT NULL
,	secretario VARCHAR(11) NOT NULL
,	data TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
,		PRIMARY KEY(`id`)
,		FOREIGN KEY(`leitor`) REFERENCES `Leitor`(`cpf`) ON UPDATE CASCADE
,		FOREIGN KEY(`secretario`) REFERENCES `Secretario`(`cpf`) ON UPDATE CASCADE
) ENGINE = "InnoDB";
|

CREATE TABLE IF NOT EXISTS `ItemReserva` (
	reserva INT NOT NULL
,	titulo INT NOT NULL
,	renovacao DATE NOT NULL
,		PRIMARY KEY(`reserva`, `titulo`)
,		FOREIGN KEY(`reserva`) REFERENCES `Reserva`(`id`) ON UPDATE CASCADE ON DELETE CASCADE
,		FOREIGN KEY(`titulo`) REFERENCES `Titulo`(`id`) ON UPDATE CASCADE
) ENGINE = "InnoDB";
|

CREATE TABLE IF NOT EXISTS `Log` (
	id INT NOT NULL AUTO_INCREMENT
,	cpf VARCHAR(11) NOT NULL
,	acao INT NOT NULL
,	hora TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
,		PRIMARY KEY(`id`)
,		FOREIGN KEY(`cpf`) REFERENCES `Pessoa`(`cpf`) ON UPDATE CASCADE
) ENGINE = "InnoDB";
|

#-------------------------------------------
#-- Criação de Visões
#-------------------------------------------
CREATE VIEW `UsuarioEmprestimo` AS (
	SELECT E.`id` AS id, L.`cpf` AS cpf, L.`diasemprestimo` AS duracao
		FROM `Emprestimo` E, `Leitor` L
		WHERE E.`leitor` = L.`cpf`
);
|

#-------------------------------------------
#-- Criação de Procedures
#-------------------------------------------
CREATE PROCEDURE `addAdministrador`(
	cpf VARCHAR(11)
,	nome VARCHAR(100)
,	email VARCHAR(60)
,	telefone VARCHAR(25)
,	senha VARCHAR(128)
)
BEGIN
	INSERT INTO `Pessoa`(`cpf`, `nome`, `email`, `telefone`, `senha`) VALUES(cpf, nome, email, telefone, senha);
	INSERT INTO `Administrador`(`cpf`) VALUES(cpf);
END
|

CREATE PROCEDURE `addSecretario`(
	cpf VARCHAR(11)
,	admin VARCHAR(11)
,	nome VARCHAR(100)
,	email VARCHAR(60)
,	telefone VARCHAR(25)
,	senha VARCHAR(128)
)
BEGIN
	INSERT INTO `Pessoa`(`cpf`, `nome`, `email`, `telefone`, `senha`) VALUES(cpf, nome, email, telefone, senha);
	INSERT INTO `Secretario`(`cpf`, `admin`) VALUES(cpf, admin);
END
|

CREATE PROCEDURE `addProfessor`(
	cpf VARCHAR(11)
,	admin VARCHAR(11)
,	nome VARCHAR(100)
,	email VARCHAR(60)
,	telefone VARCHAR(25)
,	senha VARCHAR(128)
,	titulacao ENUM('Graduado', 'Mestre', 'Doutor')
)
BEGIN
	INSERT INTO `Pessoa`(`cpf`, `nome`, `email`, `telefone`, `senha`) VALUES(cpf, nome, email, telefone, senha);
	INSERT INTO `Leitor`(`cpf`, `admin`, `diasemprestimo`) VALUES(cpf, admin, 60);
	INSERT INTO `Professor`(`cpf`, `titulacao`) VALUES(cpf, titulacao);
END
|

CREATE PROCEDURE `addAluno`(
	cpf VARCHAR(11)
,	admin VARCHAR(11)
,	nome VARCHAR(100)
,	email VARCHAR(60)
,	telefone VARCHAR(25)
,	senha VARCHAR(128)
,	conclusao DATE
)
BEGIN
	INSERT INTO `Pessoa`(`cpf`, `nome`, `email`, `telefone`, `senha`) VALUES(cpf, nome, email, telefone, senha);
	INSERT INTO `Leitor`(`cpf`, `admin`, `diasemprestimo`) VALUES(cpf, admin, 30);
	INSERT INTO `Aluno`(`cpf`, `conclusao`) VALUES(cpf, conclusao);
END
|

CREATE PROCEDURE `addLivro`(
	titulo VARCHAR(150)
,	edicao INT
,	volume INT
,	ano YEAR(4)
,	autores TEXT
,	descricao TEXT
,	quantidade INT
,	isbn BIGINT
,	editora VARCHAR(50)
)
BEGIN
	DECLARE id INT;
	INSERT INTO `Titulo`(`titulo`, `edicao`, `volume`, `ano`, `autores`, `descricao`, `quantidade`) VALUES(titulo, edicao, volume, ano, autores, descricao, quantidade);
	SELECT LAST_INSERT_ID() INTO id;
	INSERT INTO `Livro`(`titulo`, `isbn`, `editora`) VALUES(id, isbn, editora);
END
|

CREATE PROCEDURE `addDissertacao`(
	titulo VARCHAR(150)
,	edicao INT
,	volume INT
,	ano YEAR(4)
,	autores TEXT
,	descricao TEXT
,	quantidade INT
,	orientadores TEXT
,	palavrachave TEXT
,	area TEXT
)
BEGIN
	DECLARE id INT;
	INSERT INTO `Titulo`(`titulo`, `edicao`, `volume`, `ano`, `autores`, `descricao`, `quantidade`) VALUES(titulo, edicao, volume, ano, autores, descricao, quantidade);
	SELECT LAST_INSERT_ID() INTO id;
	INSERT INTO `Dissertacao`(`titulo`, `orientadores`, `palavrachave`, `area`) VALUES(id, orientadores, palavrachave, area);
END
|

CREATE PROCEDURE `addExemplar`(
	titulo INT
)
BEGIN
	INSERT INTO `Exemplar`(`titulo`) VALUES(titulo);
END
|

CREATE PROCEDURE `addEmprestimo`(
	leitor VARCHAR(11)
,	secretario VARCHAR(11)
)
BEGIN
	INSERT INTO `Emprestimo`(`leitor`, `secretario`) VALUES(leitor, secretario);
	SELECT LAST_INSERT_ID() as id;
END
|

CREATE PROCEDURE `addItemEmprestimo`(
	emprestimo INT
,	exemplar INT
)
BEGIN
	DECLARE dias INT;
	SELECT `duracao` INTO dias FROM `UsuarioEmprestimo` WHERE `id` = emprestimo;
	INSERT INTO `ItemEmprestimo`(`emprestimo`, `exemplar`, `devolucao`) VALUES(emprestimo, exemplar, CURRENT_DATE + INTERVAL dias DAY);
	UPDATE `Exemplar` SET disponivel = 0 WHERE `id` = exemplar;
END
|

#CREATE PROCEDURE `addReserva`(
#	leitor VARCHAR(11)
#,	secretario VARCHAR(11)
#)
#BEGIN
#	INSERT INTO `Reserva`(`leitor`, `secretario`) VALUES(leitor, secretario);
#	SELECT LAST_INSERT_ID() as id;
#END
#|

#CREATE PROCEDURE `addItemReserva`(
#	reserva INT
#,	exemplar INT
#,	renovacao DATE
#)
#BEGIN
#	INSERT INTO `Reserva`(`leitor`, `secretario`) VALUES(leitor, secretario);
#	SELECT LAST_INSERT_ID() as id;
#END
#|

DELIMITER ;