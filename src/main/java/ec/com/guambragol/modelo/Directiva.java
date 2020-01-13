/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.modelo;

import java.io.Serializable;
import java.util.List;
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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author carlosballadares
 */
@Entity
@Table(name = "Directiva")
@NamedQueries({
    @NamedQuery(name = "Directiva.findAll", query = "SELECT d FROM Directiva d"),
    @NamedQuery(name = "Directiva.findByIdDirectiva", query = "SELECT d FROM Directiva d WHERE d.idDirectiva = :idDirectiva")})
public class Directiva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDirectiva")
    private Integer idDirectiva;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDirectiva")
    private List<Liga> ligaList;
    @JoinColumn(name = "idCargo", referencedColumnName = "idCargo")
    @ManyToOne(optional = false)
    private Cargo idCargo;
    @JoinColumn(name = "idPersona", referencedColumnName = "idPersona")
    @ManyToOne(optional = false)
    private Persona idPersona;
    @JoinColumn(name = "idClub", referencedColumnName = "idClub")
    @ManyToOne(optional = false)
    private Club idClub;

    public Directiva() {
    }

    public Directiva(Integer idDirectiva) {
        this.idDirectiva = idDirectiva;
    }

    public Integer getIdDirectiva() {
        return idDirectiva;
    }

    public void setIdDirectiva(Integer idDirectiva) {
        this.idDirectiva = idDirectiva;
    }

    public List<Liga> getLigaList() {
        return ligaList;
    }

    public void setLigaList(List<Liga> ligaList) {
        this.ligaList = ligaList;
    }

    public Cargo getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Cargo idCargo) {
        this.idCargo = idCargo;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    public Club getIdClub() {
        return idClub;
    }

    public void setIdClub(Club idClub) {
        this.idClub = idClub;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDirectiva != null ? idDirectiva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Directiva)) {
            return false;
        }
        Directiva other = (Directiva) object;
        if ((this.idDirectiva == null && other.idDirectiva != null) || (this.idDirectiva != null && !this.idDirectiva.equals(other.idDirectiva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.Directiva[ idDirectiva=" + idDirectiva + " ]";
    }
    
}
