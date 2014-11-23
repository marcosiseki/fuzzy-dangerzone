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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "administrador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administrador.findAll", query = "SELECT a FROM Administrador a"),
    @NamedQuery(name = "Administrador.findByCpf", query = "SELECT a FROM Administrador a WHERE a.cpf = :cpf")})
public class AdministradorDAO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "admin")
    private Collection<SecretarioDAO> secretarioCollection;
    @JoinColumn(name = "cpf", referencedColumnName = "cpf", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private PessoaDAO pessoa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "admin")
    private Collection<LeitorDAO> leitorCollection;

    public AdministradorDAO() {
    }

    public AdministradorDAO(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @XmlTransient
    public Collection<SecretarioDAO> getSecretarioCollection() {
        return secretarioCollection;
    }

    public void setSecretarioCollection(Collection<SecretarioDAO> secretarioCollection) {
        this.secretarioCollection = secretarioCollection;
    }

    public PessoaDAO getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaDAO pessoa) {
        this.pessoa = pessoa;
    }

    @XmlTransient
    public Collection<LeitorDAO> getLeitorCollection() {
        return leitorCollection;
    }

    public void setLeitorCollection(Collection<LeitorDAO> leitorCollection) {
        this.leitorCollection = leitorCollection;
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
        if (!(object instanceof AdministradorDAO)) {
            return false;
        }
        AdministradorDAO other = (AdministradorDAO) object;
        if ((this.cpf == null && other.cpf != null) || (this.cpf != null && !this.cpf.equals(other.cpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Administrador[ cpf=" + cpf + " ]";
    }
    
}
