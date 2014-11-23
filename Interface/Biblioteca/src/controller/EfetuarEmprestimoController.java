/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.EmprestimoDAO;
import java.sql.Date;
import java.util.Calendar;
import modelo.Emprestimo;
import modelo.ItemEmprestimo;
import modelo.Leitor;
import modelo.Secretario;

/**
 *
 * @author guilherme
 */
public class EfetuarEmprestimoController {
    public void  RegistrarEmprestimo(Secretario secretario,Leitor leitor,ItemEmprestimo listaItemEmprestimo){
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setItemEmprestimo(listaItemEmprestimo);
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE,leitor.getTempoEmprestimo());
        emprestimo.setDataEmprestimo((Date) c.getTime());
        emprestimo.setDataDevolucao(leitor, listaItemEmprestimo);
        emprestimo.setSituacao(listaItemEmprestimo,1);
        emprestimo.setLeitor(leitor);
        emprestimo.setSecretario(secretario);
        
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        emprestimoDAO.salvaEmprestimo(emprestimo);
    }
    public void cancelarEmprestimo(){
    }
}
