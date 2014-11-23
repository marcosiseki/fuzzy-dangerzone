/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author guilherme
 */
public class Professor extends Leitor{
    private String titulacao;

    public Professor(String titulacao, int tempoEmprestimo, String nome, String email, String CPF, String telefone, String senha, String ativo) {
        super(tempoEmprestimo, nome, email, CPF, telefone, senha, ativo);
        this.titulacao = titulacao;
    }

    
}
