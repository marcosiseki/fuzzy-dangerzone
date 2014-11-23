/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Marcos
 */
@Entity
@Table(name = "itememprestimo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Itememprestimo.findAll", query = "SELECT i FROM Itememprestimo i"),
    @NamedQuery(name = "Itememprestimo.findByEmprestimo", query = "SELECT i FROM Itememprestimo i WHERE i.itememprestimoPK.emprestimo = :emprestimo"),
    @NamedQuery(name = "Itememprestimo.findByExemplar", query = "SELECT i FROM Itememprestimo i WHERE i.itememprestimoPK.exemplar = :exemplar"),
    @NamedQuery(name = "Itememprestimo.findByDevolucao", query = "SELECT i FROM Itememprestimo i WHERE i.devolucao = :devolucao")})
public class ItememprestimoDAO implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ItememprestimoPK itememprestimoPK;
    @Basic(optional = false)
    @Column(name = "devolucao")
    @Temporal(TemporalType.DATE)
    private Date devolucao;
    @JoinColumn(name = "exemplar", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ExemplarDAO exemplar1;
    @JoinColumn(name = "emprestimo", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EmprestimoDAO emprestimo1;

    public ItememprestimoDAO() {
    }

    public ItememprestimoDAO(ItememprestimoPK itememprestimoPK) {
        this.itememprestimoPK = itememprestimoPK;
    }

    public ItememprestimoDAO(ItememprestimoPK itememprestimoPK, Date devolucao) {
        this.itememprestimoPK = itememprestimoPK;
        this.devolucao = devolucao;
    }

    public ItememprestimoDAO(int emprestimo, int exemplar) {
        this.itememprestimoPK = new ItememprestimoPK(emprestimo, exemplar);
    }

    public ItememprestimoPK getItememprestimoPK() {
        return itememprestimoPK;
    }

    public void setItememprestimoPK(ItememprestimoPK itememprestimoPK) {
        this.itememprestimoPK = itememprestimoPK;
    }

    public Date getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Date devolucao) {
        this.devolucao = devolucao;
    }

    public ExemplarDAO getExemplar1() {
        return exemplar1;
    }

    public void setExemplar1(ExemplarDAO exemplar1) {
        this.exemplar1 = exemplar1;
    }

    public EmprestimoDAO getEmprestimo1() {
        return emprestimo1;
    }

    public void setEmprestimo1(EmprestimoDAO emprestimo1) {
        this.emprestimo1 = emprestimo1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itememprestimoPK != null ? itememprestimoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItememprestimoDAO)) {
            return false;
        }
        ItememprestimoDAO other = (ItememprestimoDAO) object;
        if ((this.itememprestimoPK == null && other.itememprestimoPK != null) || (this.itememprestimoPK != null && !this.itememprestimoPK.equals(other.itememprestimoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Itememprestimo[ itememprestimoPK=" + itememprestimoPK + " ]";
    }
    
}
