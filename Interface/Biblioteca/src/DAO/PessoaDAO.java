/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.AdministradorDAO;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Marcos
 */
@Entity
@Table(name = "pessoa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pessoa.findAll", query = "SELECT p FROM Pessoa p"),
    @NamedQuery(name = "Pessoa.findByCpf", query = "SELECT p FROM Pessoa p WHERE p.cpf = :cpf"),
    @NamedQuery(name = "Pessoa.findByNome", query = "SELECT p FROM Pessoa p WHERE p.nome = :nome"),
    @NamedQuery(name = "Pessoa.findByEmail", query = "SELECT p FROM Pessoa p WHERE p.email = :email"),
    @NamedQuery(name = "Pessoa.findByTelefone", query = "SELECT p FROM Pessoa p WHERE p.telefone = :telefone"),
    @NamedQuery(name = "Pessoa.findBySenha", query = "SELECT p FROM Pessoa p WHERE p.senha = :senha"),
    @NamedQuery(name = "Pessoa.findByAtivo", query = "SELECT p FROM Pessoa p WHERE p.ativo = :ativo")})
public class PessoaDAO implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cpf")
    private Collection<LogDAO> logCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;
    @Basic(optional = false)
    @Column(name = "ativo")
    private boolean ativo;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pessoa")
    private SecretarioDAO secretario;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pessoa")
    private AdministradorDAO administrador;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pessoa")
    private LeitorDAO leitor;

    public PessoaDAO() {
    }

    public PessoaDAO(String cpf) {
        this.cpf = cpf;
    }

    public PessoaDAO(String cpf, String nome, String email, String telefone, String senha, boolean ativo) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.ativo = ativo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public SecretarioDAO getSecretario() {
        return secretario;
    }

    public void setSecretario(SecretarioDAO secretario) {
        this.secretario = secretario;
    }

    public AdministradorDAO getAdministrador() {
        return administrador;
    }

    public void setAdministrador(AdministradorDAO administrador) {
        this.administrador = administrador;
    }

    public LeitorDAO getLeitor() {
        return leitor;
    }

    public void setLeitor(LeitorDAO leitor) {
        this.leitor = leitor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpf != null ? cpf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoaDAO)) {
            return false;
        }
        PessoaDAO other = (PessoaDAO) object;
        if ((this.cpf == null && other.cpf != null) || (this.cpf != null && !this.cpf.equals(other.cpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Pessoa[ cpf=" + cpf + " ]";
    }

    @XmlTransient
    public Collection<LogDAO> getLogCollection() {
        return logCollection;
    }

    public void setLogCollection(Collection<LogDAO> logCollection) {
        this.logCollection = logCollection;
    }
    
}
