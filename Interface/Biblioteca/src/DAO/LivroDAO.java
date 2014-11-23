/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.TituloDAO;
import controller.DB;
import java.io.Serializable;
import java.sql.ResultSet;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "livro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Livro.findAll", query = "SELECT l FROM Livro l"),
    @NamedQuery(name = "Livro.findByTitulo", query = "SELECT l FROM Livro l WHERE l.titulo = :titulo"),
    @NamedQuery(name = "Livro.findByIsbn", query = "SELECT l FROM Livro l WHERE l.isbn = :isbn"),
    @NamedQuery(name = "Livro.findByEditora", query = "SELECT l FROM Livro l WHERE l.editora = :editora")})
public class LivroDAO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "titulo")
    private Integer titulo;
    @Basic(optional = false)
    @Column(name = "isbn")
    private long isbn;
    @Basic(optional = false)
    @Column(name = "editora")
    private String editora;
    @JoinColumn(name = "titulo", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private TituloDAO titulo1;

    public LivroDAO() {
    }
    
    public ResultSet busca(String pesquisa){
        return DB.getInstance().consult("SELECT * FROM titulo AS T, livro AS L WHERE T.id = L.titulo AND T.titulo LIKE `%" + pesquisa + "%` OR T.autores LIKE `%" + pesquisa + "%` OR T.descricao LIKE `%" + pesquisa + "%` OR L.editora LIKE &`" + pesquisa + "%`");
    }

    public LivroDAO(Integer titulo) {
        this.titulo = titulo;
    }

    public LivroDAO(Integer titulo, long isbn, String editora) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editora = editora;
    }

    public Integer getTitulo() {
        return titulo;
    }

    public void setTitulo(Integer titulo) {
        this.titulo = titulo;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
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
        if (!(object instanceof LivroDAO)) {
            return false;
        }
        LivroDAO other = (LivroDAO) object;
        if ((this.titulo == null && other.titulo != null) || (this.titulo != null && !this.titulo.equals(other.titulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Livro[ titulo=" + titulo + " ]";
    }
    
}
