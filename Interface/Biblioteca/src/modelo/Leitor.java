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
public class Leitor extends Pessoa {
    private int tempoEmprestimo;
    public Leitor(int tempoEmprestimo, String nome, String email, String CPF, String telefone, String senha, String ativo) {
        super(nome, email, CPF, telefone, senha, ativo);
        this.tempoEmprestimo = tempoEmprestimo;
    }

    public int getTempoEmprestimo() {
        return tempoEmprestimo;
    }
}
