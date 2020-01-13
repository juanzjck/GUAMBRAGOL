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
@Table(name = "Posicion")
@NamedQueries({
    @NamedQuery(name = "Posicion.findAll", query = "SELECT p FROM Posicion p"),
    @NamedQuery(name = "Posicion.findByIdPosicion", query = "SELECT p FROM Posicion p WHERE p.idPosicion = :idPosicion"),
    @NamedQuery(name = "Posicion.findByPosicion", query = "SELECT p FROM Posicion p WHERE p.posicion = :posicion")})
public class Posicion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPosicion")
    private Integer idPosicion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "posicion")
    private String posicion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idposicion")
    private List<Jugador> jugadorList;

    public Posicion() {
    }

    public Posicion(Integer idPosicion) {
        this.idPosicion = idPosicion;
    }

    public Posicion(Integer idPosicion, String posicion) {
        this.idPosicion = idPosicion;
        this.posicion = posicion;
    }

    public Integer getIdPosicion() {
        return idPosicion;
    }

    public void setIdPosicion(Integer idPosicion) {
        this.idPosicion = idPosicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public List<Jugador> getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(List<Jugador> jugadorList) {
        this.jugadorList = jugadorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPosicion != null ? idPosicion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Posicion)) {
            return false;
        }
        Posicion other = (Posicion) object;
        if ((this.idPosicion == null && other.idPosicion != null) || (this.idPosicion != null && !this.idPosicion.equals(other.idPosicion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.Posicion[ idPosicion=" + idPosicion + " ]";
    }
    
}
