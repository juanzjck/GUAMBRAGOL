/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author carlosballadares
 */
@Entity
@Table(name = "Club+Disciplina")
@NamedQueries({
    @NamedQuery(name = "ClubDisciplina.findAll", query = "SELECT c FROM ClubDisciplina c"),
    @NamedQuery(name = "ClubDisciplina.findByIdClubDisciplina", query = "SELECT c FROM ClubDisciplina c WHERE c.idClubDisciplina = :idClubDisciplina")})
public class ClubDisciplina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idClub+Disciplina")
    private Integer idClubDisciplina;
    @JoinColumn(name = "idClub", referencedColumnName = "idClub")
    @ManyToOne(optional = false)
    private Club idClub;
    @JoinColumn(name = "idDisciplina", referencedColumnName = "idDisciplina")
    @ManyToOne(optional = false)
    private Disciplina idDisciplina;

    public ClubDisciplina() {
    }

    public ClubDisciplina(Integer idClubDisciplina) {
        this.idClubDisciplina = idClubDisciplina;
    }

    public Integer getIdClubDisciplina() {
        return idClubDisciplina;
    }

    public void setIdClubDisciplina(Integer idClubDisciplina) {
        this.idClubDisciplina = idClubDisciplina;
    }

    public Club getIdClub() {
        return idClub;
    }

    public void setIdClub(Club idClub) {
        this.idClub = idClub;
    }

    public Disciplina getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(Disciplina idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClubDisciplina != null ? idClubDisciplina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClubDisciplina)) {
            return false;
        }
        ClubDisciplina other = (ClubDisciplina) object;
        if ((this.idClubDisciplina == null && other.idClubDisciplina != null) || (this.idClubDisciplina != null && !this.idClubDisciplina.equals(other.idClubDisciplina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.ClubDisciplina[ idClubDisciplina=" + idClubDisciplina + " ]";
    }
    
}
