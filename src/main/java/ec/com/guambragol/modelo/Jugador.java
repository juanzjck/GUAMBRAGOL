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
@Table(name = "Jugador")
@NamedQueries({
    @NamedQuery(name = "Jugador.findAll", query = "SELECT j FROM Jugador j"),
    @NamedQuery(name = "Jugador.findByIdJugador", query = "SELECT j FROM Jugador j WHERE j.idJugador = :idJugador"),
    @NamedQuery(name = "Jugador.findByDorsal", query = "SELECT j FROM Jugador j WHERE j.dorsal = :dorsal")})
public class Jugador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idJugador")
    private Integer idJugador;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dorsal")
    private int dorsal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJugador")
    private List<Carnet> carnetList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJugador")
    private List<GolesPartido> golesPartidoList;
    @JoinColumn(name = "idPerosna", referencedColumnName = "idPersona")
    @ManyToOne(optional = false)
    private Persona idPerosna;
    @JoinColumn(name = "idposicion", referencedColumnName = "idPosicion")
    @ManyToOne(optional = false)
    private Posicion idposicion;
    @JoinColumn(name = "idTipoJugador", referencedColumnName = "idTipoJugador")
    @ManyToOne(optional = false)
    private TipoJugador idTipoJugador;
    @JoinColumn(name = "idClub", referencedColumnName = "idClub")
    @ManyToOne(optional = false)
    private Club idClub;
    @OneToMany(mappedBy = "idJugador")
    private List<JugadorPartidfo> jugadorPartidfoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJugador")
    private List<SancionesPartidos> sancionesPartidosList;

    public Jugador() {
    }

    public Jugador(Integer idJugador) {
        this.idJugador = idJugador;
    }

    public Jugador(Integer idJugador, int dorsal) {
        this.idJugador = idJugador;
        this.dorsal = dorsal;
    }

    public Integer getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Integer idJugador) {
        this.idJugador = idJugador;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public List<Carnet> getCarnetList() {
        return carnetList;
    }

    public void setCarnetList(List<Carnet> carnetList) {
        this.carnetList = carnetList;
    }

    public List<GolesPartido> getGolesPartidoList() {
        return golesPartidoList;
    }

    public void setGolesPartidoList(List<GolesPartido> golesPartidoList) {
        this.golesPartidoList = golesPartidoList;
    }

    public Persona getIdPerosna() {
        return idPerosna;
    }

    public void setIdPerosna(Persona idPerosna) {
        this.idPerosna = idPerosna;
    }

    public Posicion getIdposicion() {
        return idposicion;
    }

    public void setIdposicion(Posicion idposicion) {
        this.idposicion = idposicion;
    }

    public TipoJugador getIdTipoJugador() {
        return idTipoJugador;
    }

    public void setIdTipoJugador(TipoJugador idTipoJugador) {
        this.idTipoJugador = idTipoJugador;
    }

    public Club getIdClub() {
        return idClub;
    }

    public void setIdClub(Club idClub) {
        this.idClub = idClub;
    }

    public List<JugadorPartidfo> getJugadorPartidfoList() {
        return jugadorPartidfoList;
    }

    public void setJugadorPartidfoList(List<JugadorPartidfo> jugadorPartidfoList) {
        this.jugadorPartidfoList = jugadorPartidfoList;
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
        hash += (idJugador != null ? idJugador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jugador)) {
            return false;
        }
        Jugador other = (Jugador) object;
        if ((this.idJugador == null && other.idJugador != null) || (this.idJugador != null && !this.idJugador.equals(other.idJugador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.Jugador[ idJugador=" + idJugador + " ]";
    }
    
}
