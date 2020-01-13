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
@Table(name = "SancionesPartidos")
@NamedQueries({
    @NamedQuery(name = "SancionesPartidos.findAll", query = "SELECT s FROM SancionesPartidos s"),
    @NamedQuery(name = "SancionesPartidos.findByIdSancionesPartidos", query = "SELECT s FROM SancionesPartidos s WHERE s.idSancionesPartidos = :idSancionesPartidos")})
public class SancionesPartidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idSancionesPartidos")
    private Integer idSancionesPartidos;
    @JoinColumn(name = "idPartido", referencedColumnName = "idPartidos")
    @ManyToOne(optional = false)
    private Partidos idPartido;
    @JoinColumn(name = "idJugador", referencedColumnName = "idJugador")
    @ManyToOne(optional = false)
    private Jugador idJugador;
    @JoinColumn(name = "idSanciones", referencedColumnName = "idSanciones")
    @ManyToOne(optional = false)
    private Sanciones idSanciones;

    public SancionesPartidos() {
    }

    public SancionesPartidos(Integer idSancionesPartidos) {
        this.idSancionesPartidos = idSancionesPartidos;
    }

    public Integer getIdSancionesPartidos() {
        return idSancionesPartidos;
    }

    public void setIdSancionesPartidos(Integer idSancionesPartidos) {
        this.idSancionesPartidos = idSancionesPartidos;
    }

    public Partidos getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(Partidos idPartido) {
        this.idPartido = idPartido;
    }

    public Jugador getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Jugador idJugador) {
        this.idJugador = idJugador;
    }

    public Sanciones getIdSanciones() {
        return idSanciones;
    }

    public void setIdSanciones(Sanciones idSanciones) {
        this.idSanciones = idSanciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSancionesPartidos != null ? idSancionesPartidos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SancionesPartidos)) {
            return false;
        }
        SancionesPartidos other = (SancionesPartidos) object;
        if ((this.idSancionesPartidos == null && other.idSancionesPartidos != null) || (this.idSancionesPartidos != null && !this.idSancionesPartidos.equals(other.idSancionesPartidos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.SancionesPartidos[ idSancionesPartidos=" + idSancionesPartidos + " ]";
    }
    
}
