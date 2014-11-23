/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Marcos
 */
@Entity
@Table(name = "usuarioemprestimo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarioemprestimo.findAll", query = "SELECT u FROM Usuarioemprestimo u"),
    @NamedQuery(name = "Usuarioemprestimo.findById", query = "SELECT u FROM Usuarioemprestimo u WHERE u.id = :id"),
    @NamedQuery(name = "Usuarioemprestimo.findByCpf", query = "SELECT u FROM Usuarioemprestimo u WHERE u.cpf = :cpf"),
    @NamedQuery(name = "Usuarioemprestimo.findByDuracao", query = "SELECT u FROM Usuarioemprestimo u WHERE u.duracao = :duracao")})
public class Usuarioemprestimo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "duracao")
    private int duracao;

    public Usuarioemprestimo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
}
