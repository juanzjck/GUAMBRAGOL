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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author carlosballadares
 */
@Entity
@Table(name = "FechaPartido")
@NamedQueries({
    @NamedQuery(name = "FechaPartido.findAll", query = "SELECT f FROM FechaPartido f"),
    @NamedQuery(name = "FechaPartido.findByIdFechaPartido", query = "SELECT f FROM FechaPartido f WHERE f.idFechaPartido = :idFechaPartido"),
    @NamedQuery(name = "FechaPartido.findByFechaInicio", query = "SELECT f FROM FechaPartido f WHERE f.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "FechaPartido.findByFechaFin", query = "SELECT f FROM FechaPartido f WHERE f.fechaFin = :fechaFin")})
public class FechaPartido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idFechaPartido")
    private Integer idFechaPartido;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFechaPartido")
    private List<Partidos> partidosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFechaPartido")
    private List<DetalleFechaCampeonao> detalleFechaCampeonaoList;

    public FechaPartido() {
    }

    public FechaPartido(Integer idFechaPartido) {
        this.idFechaPartido = idFechaPartido;
    }

    public FechaPartido(Integer idFechaPartido, Date fechaInicio, Date fechaFin) {
        this.idFechaPartido = idFechaPartido;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Integer getIdFechaPartido() {
        return idFechaPartido;
    }

    public void setIdFechaPartido(Integer idFechaPartido) {
        this.idFechaPartido = idFechaPartido;
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

    public List<Partidos> getPartidosList() {
        return partidosList;
    }

    public void setPartidosList(List<Partidos> partidosList) {
        this.partidosList = partidosList;
    }

    public List<DetalleFechaCampeonao> getDetalleFechaCampeonaoList() {
        return detalleFechaCampeonaoList;
    }

    public void setDetalleFechaCampeonaoList(List<DetalleFechaCampeonao> detalleFechaCampeonaoList) {
        this.detalleFechaCampeonaoList = detalleFechaCampeonaoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFechaPartido != null ? idFechaPartido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FechaPartido)) {
            return false;
        }
        FechaPartido other = (FechaPartido) object;
        if ((this.idFechaPartido == null && other.idFechaPartido != null) || (this.idFechaPartido != null && !this.idFechaPartido.equals(other.idFechaPartido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.FechaPartido[ idFechaPartido=" + idFechaPartido + " ]";
    }
    
}
