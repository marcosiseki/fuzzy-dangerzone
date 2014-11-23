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
@Table(name = "leitor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Leitor.findAll", query = "SELECT l FROM Leitor l"),
    @NamedQuery(name = "Leitor.findByCpf", query = "SELECT l FROM Leitor l WHERE l.cpf = :cpf"),
    @NamedQuery(name = "Leitor.findByDiasemprestimo", query = "SELECT l FROM Leitor l WHERE l.diasemprestimo = :diasemprestimo")})
public class LeitorDAO implements Serializable {
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "leitor")
    private AlunoDAO aluno;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "leitor")
    private ProfessorDAO professor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "leitor")
    private Collection<ReservaDAO> reservaCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "diasemprestimo")
    private int diasemprestimo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "leitor")
    private Collection<EmprestimoDAO> emprestimoCollection;
    @JoinColumn(name = "admin", referencedColumnName = "cpf")
    @ManyToOne(optional = false)
    private AdministradorDAO admin;
    @JoinColumn(name = "cpf", referencedColumnName = "cpf", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private PessoaDAO pessoa;

    public LeitorDAO() {
    }

    public LeitorDAO(String cpf) {
        this.cpf = cpf;
    }

    public LeitorDAO(String cpf, int diasemprestimo) {
        this.cpf = cpf;
        this.diasemprestimo = diasemprestimo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getDiasemprestimo() {
        return diasemprestimo;
    }

    public void setDiasemprestimo(int diasemprestimo) {
        this.diasemprestimo = diasemprestimo;
    }

    @XmlTransient
    public Collection<EmprestimoDAO> getEmprestimoCollection() {
        return emprestimoCollection;
    }

    public void setEmprestimoCollection(Collection<EmprestimoDAO> emprestimoCollection) {
        this.emprestimoCollection = emprestimoCollection;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpf != null ? cpf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LeitorDAO)) {
            return false;
        }
        LeitorDAO other = (LeitorDAO) object;
        if ((this.cpf == null && other.cpf != null) || (this.cpf != null && !this.cpf.equals(other.cpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Leitor[ cpf=" + cpf + " ]";
    }

    public AlunoDAO getAluno() {
        return aluno;
    }

    public void setAluno(AlunoDAO aluno) {
        this.aluno = aluno;
    }

    public ProfessorDAO getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorDAO professor) {
        this.professor = professor;
    }

    @XmlTransient
    public Collection<ReservaDAO> getReservaCollection() {
        return reservaCollection;
    }

    public void setReservaCollection(Collection<ReservaDAO> reservaCollection) {
        this.reservaCollection = reservaCollection;
    }
    
}
