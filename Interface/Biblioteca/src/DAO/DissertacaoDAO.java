/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Marcos
 */
@Entity
@Table(name = "dissertacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dissertacao.findAll", query = "SELECT d FROM Dissertacao d"),
    @NamedQuery(name = "Dissertacao.findByTitulo", query = "SELECT d FROM Dissertacao d WHERE d.titulo = :titulo")})
public class DissertacaoDAO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "titulo")
    private Integer titulo;
    @Basic(optional = false)
    @Lob
    @Column(name = "orientadores")
    private String orientadores;
    @Basic(optional = false)
    @Lob
    @Column(name = "palavrachave")
    private String palavrachave;
    @Basic(optional = false)
    @Lob
    @Column(name = "area")
    private String area;
    @JoinColumn(name = "titulo", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private TituloDAO titulo1;

    public DissertacaoDAO() {
    }

    public DissertacaoDAO(Integer titulo) {
        this.titulo = titulo;
    }

    public DissertacaoDAO(Integer titulo, String orientadores, String palavrachave, String area) {
        this.titulo = titulo;
        this.orientadores = orientadores;
        this.palavrachave = palavrachave;
        this.area = area;
    }

    public Integer getTitulo() {
        return titulo;
    }

    public void setTitulo(Integer titulo) {
        this.titulo = titulo;
    }

    public String getOrientadores() {
        return orientadores;
    }

    public void setOrientadores(String orientadores) {
        this.orientadores = orientadores;
    }

    public String getPalavrachave() {
        return palavrachave;
    }

    public void setPalavrachave(String palavrachave) {
        this.palavrachave = palavrachave;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public TituloDAO getTitulo1() {
        return titulo1;
    }

    public void setTitulo1(TituloDAO titulo1) {
        this.titulo1 = titulo1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (titulo != null ? titulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DissertacaoDAO)) {
            return false;
        }
        DissertacaoDAO other = (DissertacaoDAO) object;
        if ((this.titulo == null && other.titulo != null) || (this.titulo != null && !this.titulo.equals(other.titulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Dissertacao[ titulo=" + titulo + " ]";
    }
    
}
