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
public class ItemreservaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "reserva")
    private int reserva;
    @Basic(optional = false)
    @Column(name = "titulo")
    private int titulo;

    public ItemreservaPK() {
    }

    public ItemreservaPK(int reserva, int titulo) {
        this.reserva = reserva;
        this.titulo = titulo;
    }

    public int getReserva() {
        return reserva;
    }

    public void setReserva(int reserva) {
        this.reserva = reserva;
    }

    public int getTitulo() {
        return titulo;
    }

    public void setTitulo(int titulo) {
        this.titulo = titulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) reserva;
        hash += (int) titulo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemreservaPK)) {
            return false;
        }
        ItemreservaPK other = (ItemreservaPK) object;
        if (this.reserva != other.reserva) {
            return false;
        }
        if (this.titulo != other.titulo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.ItemreservaPK[ reserva=" + reserva + ", titulo=" + titulo + " ]";
    }
    
}
