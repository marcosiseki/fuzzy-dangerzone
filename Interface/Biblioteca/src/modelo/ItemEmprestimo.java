/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;
import java.util.List;
import java.util.ArrayList;
import static java.util.Collections.list;

/**
 *
 * @author guilherme
 */
public class ItemEmprestimo {
    Date dataDevolucao;
    List<Exemplar> carrinho;
    public ItemEmprestimo(){
        //TODO Resolver problema com a data
        carrinho = new ArrayList<Exemplar>();
    }
    public void adicAoCarrinho(Exemplar exemplar){
        carrinho.add(exemplar);
    }
    public void removerCarrinho(Exemplar exemplar){
        carrinho.remove(exemplar);
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    void setCarrinhoEmprestado() {
        for(Exemplar aux:carrinho){
            aux.setSituacao(1);
        }
    }

    public List<Exemplar> getCarrinho() {
        return carrinho;
    }
    
    
    
}
