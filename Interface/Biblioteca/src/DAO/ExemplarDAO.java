/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Marcos
 */
@Entity
@Table(name = "exemplar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Exemplar.findAll", query = "SELECT e FROM Exemplar e"),
    @NamedQuery(name = "Exemplar.findById", query = "SELECT e FROM Exemplar e WHERE e.id = :id"),
    @NamedQuery(name = "Exemplar.findByDisponivel", query = "SELECT e FROM Exemplar e WHERE e.disponivel = :disponivel")})
public class ExemplarDAO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "disponivel")
    private int disponivel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "exemplar1")
    private Collection<ItememprestimoDAO> itememprestimoCollection;
    @JoinColumn(name = "titulo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TituloDAO titulo;

    public ExemplarDAO() {
    }

    public ExemplarDAO(Integer id) {
        this.id = id;
    }

    public ExemplarDAO(Integer id, int disponivel) {
        this.id = id;
        this.disponivel = disponivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(int disponivel) {
        this.disponivel = disponivel;
    }

    @XmlTransient
    public Collection<ItememprestimoDAO> getItememprestimoCollection() {
        return itememprestimoCollection;
    }

    public void setItememprestimoCollection(Collection<ItememprestimoDAO> itememprestimoCollection) {
        this.itememprestimoCollection = itememprestimoCollection;
    }

    public TituloDAO getTitulo() {
        return titulo;
    }

    public void setTitulo(TituloDAO titulo) {
        this.titulo = titulo;
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
        if (!(object instanceof ExemplarDAO)) {
            return false;
        }
        ExemplarDAO other = (ExemplarDAO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Exemplar[ id=" + id + " ]";
    }
    
}
