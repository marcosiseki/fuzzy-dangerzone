/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Marcos
 */
@Embeddable
public class ItememprestimoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "emprestimo")
    private int emprestimo;
    @Basic(optional = false)
    @Column(name = "exemplar")
    private int exemplar;

    public ItememprestimoPK() {
    }

    public ItememprestimoPK(int emprestimo, int exemplar) {
        this.emprestimo = emprestimo;
        this.exemplar = exemplar;
    }

    public int getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(int emprestimo) {
        this.emprestimo = emprestimo;
    }

    public int getExemplar() {
        return exemplar;
    }

    public void setExemplar(int exemplar) {
        this.exemplar = exemplar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) emprestimo;
        hash += (int) exemplar;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItememprestimoPK)) {
            return false;
        }
        ItememprestimoPK other = (ItememprestimoPK) object;
        if (this.emprestimo != other.emprestimo) {
            return false;
        }
        if (this.exemplar != other.exemplar) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.ItememprestimoPK[ emprestimo=" + emprestimo + ", exemplar=" + exemplar + " ]";
    }
    
}
