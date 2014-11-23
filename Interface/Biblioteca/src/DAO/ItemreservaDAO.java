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
@Table(name = "itemreserva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Itemreserva.findAll", query = "SELECT i FROM Itemreserva i"),
    @NamedQuery(name = "Itemreserva.findByReserva", query = "SELECT i FROM Itemreserva i WHERE i.itemreservaPK.reserva = :reserva"),
    @NamedQuery(name = "Itemreserva.findByTitulo", query = "SELECT i FROM Itemreserva i WHERE i.itemreservaPK.titulo = :titulo"),
    @NamedQuery(name = "Itemreserva.findByRenovacao", query = "SELECT i FROM Itemreserva i WHERE i.renovacao = :renovacao")})
public class ItemreservaDAO implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ItemreservaPK itemreservaPK;
    @Basic(optional = false)
    @Column(name = "renovacao")
    @Temporal(TemporalType.DATE)
    private Date renovacao;
    @JoinColumn(name = "titulo", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TituloDAO titulo1;
    @JoinColumn(name = "reserva", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ReservaDAO reserva1;

    public ItemreservaDAO() {
    }

    public ItemreservaDAO(ItemreservaPK itemreservaPK) {
        this.itemreservaPK = itemreservaPK;
    }

    public ItemreservaDAO(ItemreservaPK itemreservaPK, Date renovacao) {
        this.itemreservaPK = itemreservaPK;
        this.renovacao = renovacao;
    }

    public ItemreservaDAO(int reserva, int titulo) {
        this.itemreservaPK = new ItemreservaPK(reserva, titulo);
    }

    public ItemreservaPK getItemreservaPK() {
        return itemreservaPK;
    }

    public void setItemreservaPK(ItemreservaPK itemreservaPK) {
        this.itemreservaPK = itemreservaPK;
    }

    public Date getRenovacao() {
        return renovacao;
    }

    public void setRenovacao(Date renovacao) {
        this.renovacao = renovacao;
    }

    public TituloDAO getTitulo1() {
        return titulo1;
    }

    public void setTitulo1(TituloDAO titulo1) {
        this.titulo1 = titulo1;
    }

    public ReservaDAO getReserva1() {
        return reserva1;
    }

    public void setReserva1(ReservaDAO reserva1) {
        this.reserva1 = reserva1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemreservaPK != null ? itemreservaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemreservaDAO)) {
            return false;
        }
        ItemreservaDAO other = (ItemreservaDAO) object;
        if ((this.itemreservaPK == null && other.itemreservaPK != null) || (this.itemreservaPK != null && !this.itemreservaPK.equals(other.itemreservaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Itemreserva[ itemreservaPK=" + itemreservaPK + " ]";
    }
    
}
