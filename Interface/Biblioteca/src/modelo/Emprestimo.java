/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;
import java.util.Calendar;

/**
 *
 * @author guilherme
 */
public class Emprestimo {
    private Date dataEmprestimo;
    private ItemEmprestimo itemEmprestimo;
    private Leitor leitor;
    private Secretario secretario;
    public Emprestimo(){
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    
    public void setItemEmprestimo(ItemEmprestimo itemEmprestimo) {
        this.itemEmprestimo = itemEmprestimo;
    }

    public void setDataDevolucao(Leitor leitor,ItemEmprestimo itemEmprestimo) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE,leitor.getTempoEmprestimo());
        
        itemEmprestimo.setDataDevolucao((Date) c.getTime());
    }
    public void setSituacao(ItemEmprestimo itemEmprestimo,int i){
        if(i ==1){
            itemEmprestimo.setCarrinhoEmprestado();
        }
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public ItemEmprestimo getItemEmprestimo() {
        return itemEmprestimo;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public Secretario getSecretario() {
        return secretario;
    }
    
    
    
}
