/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.modelo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author carlosballadares
 */
@Entity
@Table(name = "Campeonato")
@NamedQueries({
    @NamedQuery(name = "Campeonato.findAll", query = "SELECT c FROM Campeonato c"),
    @NamedQuery(name = "Campeonato.findByIdCampeonato", query = "SELECT c FROM Campeonato c WHERE c.idCampeonato = :idCampeonato"),
    @NamedQuery(name = "Campeonato.findByNombre", query = "SELECT c FROM Campeonato c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Campeonato.findByFechaInicio", query = "SELECT c FROM Campeonato c WHERE c.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Campeonato.findByFechaFin", query = "SELECT c FROM Campeonato c WHERE c.fechaFin = :fechaFin")})
public class Campeonato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
 
    @Column(name = "idCampeonato")
    private Integer idCampeonato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaFin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCampeonato")
    private List<DetalleFechaCampeonao> detalleFechaCampeonaoList;
    @JoinColumn(name = "idLiga", referencedColumnName = "idLiga")
    @ManyToOne(optional = false)
    private Liga idLiga;

    public Campeonato() {
    }

    public Campeonato(Integer idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

    public Campeonato(Integer idCampeonato, String nombre, Date fechaInicio, Date fechaFin) {
        this.idCampeonato = idCampeonato;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Integer getIdCampeonato() {
        return idCampeonato;
    }

    public void setIdCampeonato(Integer idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<DetalleFechaCampeonao> getDetalleFechaCampeonaoList() {
        return detalleFechaCampeonaoList;
    }

    public void setDetalleFechaCampeonaoList(List<DetalleFechaCampeonao> detalleFechaCampeonaoList) {
        this.detalleFechaCampeonaoList = detalleFechaCampeonaoList;
    }

    public Liga getIdLiga() {
        return idLiga;
    }

    public void setIdLiga(Liga idLiga) {
        this.idLiga = idLiga;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCampeonato != null ? idCampeonato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Campeonato)) {
            return false;
        }
        Campeonato other = (Campeonato) object;
        if ((this.idCampeonato == null && other.idCampeonato != null) || (this.idCampeonato != null && !this.idCampeonato.equals(other.idCampeonato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.Campeonato[ idCampeonato=" + idCampeonato + " ]";
    }
    
}
