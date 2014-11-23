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
@Table(name = "professor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Professor.findAll", query = "SELECT p FROM Professor p"),
    @NamedQuery(name = "Professor.findByCpf", query = "SELECT p FROM Professor p WHERE p.cpf = :cpf"),
    @NamedQuery(name = "Professor.findByTitulacao", query = "SELECT p FROM Professor p WHERE p.titulacao = :titulacao")})
public class ProfessorDAO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "titulacao")
    private String titulacao;
    @JoinColumn(name = "cpf", referencedColumnName = "cpf", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private LeitorDAO leitor;

    public ProfessorDAO() {
    }

    public ProfessorDAO(String cpf) {
        this.cpf = cpf;
    }

    public ProfessorDAO(String cpf, String titulacao) {
        this.cpf = cpf;
        this.titulacao = titulacao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
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
        hash += (cpf != null ? cpf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfessorDAO)) {
            return false;
        }
        ProfessorDAO other = (ProfessorDAO) object;
        if ((this.cpf == null && other.cpf != null) || (this.cpf != null && !this.cpf.equals(other.cpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Professor[ cpf=" + cpf + " ]";
    }
    
}
