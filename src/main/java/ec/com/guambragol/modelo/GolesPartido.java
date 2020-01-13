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
@Table(name = "GolesPartido")
@NamedQueries({
    @NamedQuery(name = "GolesPartido.findAll", query = "SELECT g FROM GolesPartido g"),
    @NamedQuery(name = "GolesPartido.findByIdGolesPartido", query = "SELECT g FROM GolesPartido g WHERE g.idGolesPartido = :idGolesPartido"),
    @NamedQuery(name = "GolesPartido.findByCantidadGoles", query = "SELECT g FROM GolesPartido g WHERE g.cantidadGoles = :cantidadGoles")})
public class GolesPartido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idGolesPartido")
    private Integer idGolesPartido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidadGoles")
    private int cantidadGoles;
    @JoinColumn(name = "idJugador", referencedColumnName = "idJugador")
    @ManyToOne(optional = false)
    private Jugador idJugador;
    @JoinColumn(name = "idPartido", referencedColumnName = "idPartidos")
    @ManyToOne(optional = false)
    private Partidos idPartido;

    public GolesPartido() {
    }

    public GolesPartido(Integer idGolesPartido) {
        this.idGolesPartido = idGolesPartido;
    }

    public GolesPartido(Integer idGolesPartido, int cantidadGoles) {
        this.idGolesPartido = idGolesPartido;
        this.cantidadGoles = cantidadGoles;
    }

    public Integer getIdGolesPartido() {
        return idGolesPartido;
    }

    public void setIdGolesPartido(Integer idGolesPartido) {
        this.idGolesPartido = idGolesPartido;
    }

    public int getCantidadGoles() {
        return cantidadGoles;
    }

    public void setCantidadGoles(int cantidadGoles) {
        this.cantidadGoles = cantidadGoles;
    }

    public Jugador getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Jugador idJugador) {
        this.idJugador = idJugador;
    }

    public Partidos getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(Partidos idPartido) {
        this.idPartido = idPartido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGolesPartido != null ? idGolesPartido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GolesPartido)) {
            return false;
        }
        GolesPartido other = (GolesPartido) object;
        if ((this.idGolesPartido == null && other.idGolesPartido != null) || (this.idGolesPartido != null && !this.idGolesPartido.equals(other.idGolesPartido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.GolesPartido[ idGolesPartido=" + idGolesPartido + " ]";
    }
    
}
