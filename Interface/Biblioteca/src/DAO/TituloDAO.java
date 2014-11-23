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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "titulo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Titulo.findAll", query = "SELECT t FROM Titulo t"),
    @NamedQuery(name = "Titulo.findById", query = "SELECT t FROM Titulo t WHERE t.id = :id"),
    @NamedQuery(name = "Titulo.findByTitulo", query = "SELECT t FROM Titulo t WHERE t.titulo = :titulo"),
    @NamedQuery(name = "Titulo.findByEdicao", query = "SELECT t FROM Titulo t WHERE t.edicao = :edicao"),
    @NamedQuery(name = "Titulo.findByVolume", query = "SELECT t FROM Titulo t WHERE t.volume = :volume"),
    @NamedQuery(name = "Titulo.findByAno", query = "SELECT t FROM Titulo t WHERE t.ano = :ano"),
    @NamedQuery(name = "Titulo.findByQuantidade", query = "SELECT t FROM Titulo t WHERE t.quantidade = :quantidade")})
public class TituloDAO implements Serializable {
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "titulo1")
    private LivroDAO livro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "titulo1")
    private Collection<ItemreservaDAO> itemreservaCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "titulo1")
    private DissertacaoDAO dissertacao;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @Column(name = "edicao")
    private int edicao;
    @Basic(optional = false)
    @Column(name = "volume")
    private int volume;
    @Basic(optional = false)
    @Column(name = "ano")
    @Temporal(TemporalType.DATE)
    private Date ano;
    @Basic(optional = false)
    @Lob
    @Column(name = "autores")
    private String autores;
    @Basic(optional = false)
    @Lob
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "quantidade")
    private int quantidade;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "titulo")
    private Collection<ExemplarDAO> exemplarCollection;

    public TituloDAO() {
    }

    public TituloDAO(Integer id) {
        this.id = id;
    }

    public TituloDAO(Integer id, String titulo, int edicao, int volume, Date ano, String autores, String descricao, int quantidade) {
        this.id = id;
        this.titulo = titulo;
        this.edicao = edicao;
        this.volume = volume;
        this.ano = ano;
        this.autores = autores;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @XmlTransient
    public Collection<ExemplarDAO> getExemplarCollection() {
        return exemplarCollection;
    }

    public void setExemplarCollection(Collection<ExemplarDAO> exemplarCollection) {
        this.exemplarCollection = exemplarCollection;
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
        if (!(object instanceof TituloDAO)) {
            return false;
        }
        TituloDAO other = (TituloDAO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Titulo[ id=" + id + " ]";
    }

    public LivroDAO getLivro() {
        return livro;
    }

    public void setLivro(LivroDAO livro) {
        this.livro = livro;
    }

    @XmlTransient
    public Collection<ItemreservaDAO> getItemreservaCollection() {
        return itemreservaCollection;
    }

    public void setItemreservaCollection(Collection<ItemreservaDAO> itemreservaCollection) {
        this.itemreservaCollection = itemreservaCollection;
    }

    public DissertacaoDAO getDissertacao() {
        return dissertacao;
    }

    public void setDissertacao(DissertacaoDAO dissertacao) {
        this.dissertacao = dissertacao;
    }
    
}
