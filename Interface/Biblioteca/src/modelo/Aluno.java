/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author guilherme
 */
public class Aluno extends Leitor{
    Date prazoConclusao;

    public Aluno(Date prazoConclusao, int tempoEmprestimo, String nome, String email, String CPF, String telefone, String senha, String ativo) {
        super(tempoEmprestimo, nome, email, CPF, telefone, senha, ativo);
        this.prazoConclusao = prazoConclusao;
    }
    
}
