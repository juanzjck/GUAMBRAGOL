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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author carlosballadares
 */
@Entity
@Table(name = "Sanciones")
@NamedQueries({
    @NamedQuery(name = "Sanciones.findAll", query = "SELECT s FROM Sanciones s"),
    @NamedQuery(name = "Sanciones.findByIdSanciones", query = "SELECT s FROM Sanciones s WHERE s.idSanciones = :idSanciones"),
    @NamedQuery(name = "Sanciones.findByNombreSancion", query = "SELECT s FROM Sanciones s WHERE s.nombreSancion = :nombreSancion")})
public class Sanciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idSanciones")
    private Integer idSanciones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NombreSancion")
    private String nombreSancion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSanciones")
    private List<SancionesPartidos> sancionesPartidosList;

    public Sanciones() {
    }

    public Sanciones(Integer idSanciones) {
        this.idSanciones = idSanciones;
    }

    public Sanciones(Integer idSanciones, String nombreSancion) {
        this.idSanciones = idSanciones;
        this.nombreSancion = nombreSancion;
    }

    public Integer getIdSanciones() {
        return idSanciones;
    }

    public void setIdSanciones(Integer idSanciones) {
        this.idSanciones = idSanciones;
    }

    public String getNombreSancion() {
        return nombreSancion;
    }

    public void setNombreSancion(String nombreSancion) {
        this.nombreSancion = nombreSancion;
    }

    public List<SancionesPartidos> getSancionesPartidosList() {
        return sancionesPartidosList;
    }

    public void setSancionesPartidosList(List<SancionesPartidos> sancionesPartidosList) {
        this.sancionesPartidosList = sancionesPartidosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSanciones != null ? idSanciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sanciones)) {
            return false;
        }
        Sanciones other = (Sanciones) object;
        if ((this.idSanciones == null && other.idSanciones != null) || (this.idSanciones != null && !this.idSanciones.equals(other.idSanciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.Sanciones[ idSanciones=" + idSanciones + " ]";
    }
    
}
