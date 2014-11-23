/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.AdministradorDAO;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Marcos
 */
@Entity
@Table(name = "secretario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Secretario.findAll", query = "SELECT s FROM Secretario s"),
    @NamedQuery(name = "Secretario.findByCpf", query = "SELECT s FROM Secretario s WHERE s.cpf = :cpf")})
public class SecretarioDAO implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "secretario")
    private Collection<ReservaDAO> reservaCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @JoinColumn(name = "admin", referencedColumnName = "cpf")
    @ManyToOne(optional = false)
    private AdministradorDAO admin;
    @JoinColumn(name = "cpf", referencedColumnName = "cpf", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private PessoaDAO pessoa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "secretario")
    private Collection<EmprestimoDAO> emprestimoCollection;

    public SecretarioDAO() {
    }

    public SecretarioDAO(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public AdministradorDAO getAdmin() {
        return admin;
    }

    public void setAdmin(AdministradorDAO admin) {
        this.admin = admin;
    }

    public PessoaDAO getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaDAO pessoa) {
        this.pessoa = pessoa;
    }

    @XmlTransient
    public Collection<EmprestimoDAO> getEmprestimoCollection() {
        return emprestimoCollection;
    }

    public void setEmprestimoCollection(Collection<EmprestimoDAO> emprestimoCollection) {
        this.emprestimoCollection = emprestimoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpf != null ? cpf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecretarioDAO)) {
            return false;
        }
        SecretarioDAO other = (SecretarioDAO) object;
        if ((this.cpf == null && other.cpf != null) || (this.cpf != null && !this.cpf.equals(other.cpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Secretario[ cpf=" + cpf + " ]";
    }

    @XmlTransient
    public Collection<ReservaDAO> getReservaCollection() {
        return reservaCollection;
    }

    public void setReservaCollection(Collection<ReservaDAO> reservaCollection) {
        this.reservaCollection = reservaCollection;
    }
    
}
