/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Marcos
 */
@Entity
@Table(name = "reserva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r"),
    @NamedQuery(name = "Reserva.findById", query = "SELECT r FROM Reserva r WHERE r.id = :id"),
    @NamedQuery(name = "Reserva.findByData", query = "SELECT r FROM Reserva r WHERE r.data = :data")})
public class ReservaDAO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reserva1")
    private Collection<ItemreservaDAO> itemreservaCollection;
    @JoinColumn(name = "secretario", referencedColumnName = "cpf")
    @ManyToOne(optional = false)
    private SecretarioDAO secretario;
    @JoinColumn(name = "leitor", referencedColumnName = "cpf")
    @ManyToOne(optional = false)
    private LeitorDAO leitor;

    public ReservaDAO() {
    }

    public ReservaDAO(Integer id) {
        this.id = id;
    }

    public ReservaDAO(Integer id, Date data) {
        this.id = id;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @XmlTransient
    public Collection<ItemreservaDAO> getItemreservaCollection() {
        return itemreservaCollection;
    }

    public void setItemreservaCollection(Collection<ItemreservaDAO> itemreservaCollection) {
        this.itemreservaCollection = itemreservaCollection;
    }

    public SecretarioDAO getSecretario() {
        return secretario;
    }

    public void setSecretario(SecretarioDAO secretario) {
        this.secretario = secretario;
    }

    public LeitorDAO getLeitor() {
        return leitor;
    }

    public void setLeitor(LeitorDAO leitor) {
        this.leitor = leitor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReservaDAO)) {
            return false;
        }
        ReservaDAO other = (ReservaDAO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Reserva[ id=" + id + " ]";
    }
    
}
