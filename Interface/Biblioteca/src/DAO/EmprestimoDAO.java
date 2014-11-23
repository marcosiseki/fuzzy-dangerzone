/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import controller.DB;
import modelo.Emprestimo;
import modelo.Exemplar;

/**
 *
 * @author Marcos
 */

public class EmprestimoDAO {

    public EmprestimoDAO() {
    }
    
    public void salvaEmprestimo(Emprestimo emprestimo){
        DB.getInstance().consult("call addEmprestimo('"+emprestimo.getSecretario().getCPF()+"','"+emprestimo.getLeitor().getCPF()+"'");
        for(Exemplar aux: emprestimo.getItemEmprestimo().getCarrinho()){
            DB.getInstance().consult("call addItemEmprestimo('emprestimo','"+aux.getId()+"'");
        }
    }   
    
}
