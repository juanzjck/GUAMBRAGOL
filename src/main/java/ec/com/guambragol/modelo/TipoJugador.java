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
@Table(name = "TipoJugador")
@NamedQueries({
    @NamedQuery(name = "TipoJugador.findAll", query = "SELECT t FROM TipoJugador t"),
    @NamedQuery(name = "TipoJugador.findByIdTipoJugador", query = "SELECT t FROM TipoJugador t WHERE t.idTipoJugador = :idTipoJugador"),
    @NamedQuery(name = "TipoJugador.findByTipo", query = "SELECT t FROM TipoJugador t WHERE t.tipo = :tipo")})
public class TipoJugador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTipoJugador")
    private Integer idTipoJugador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tipo")
    private String tipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoJugador")
    private List<Jugador> jugadorList;

    public TipoJugador() {
    }

    public TipoJugador(Integer idTipoJugador) {
        this.idTipoJugador = idTipoJugador;
    }

    public TipoJugador(Integer idTipoJugador, String tipo) {
        this.idTipoJugador = idTipoJugador;
        this.tipo = tipo;
    }

    public Integer getIdTipoJugador() {
        return idTipoJugador;
    }

    public void setIdTipoJugador(Integer idTipoJugador) {
        this.idTipoJugador = idTipoJugador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        hash += (idTipoJugador != null ? idTipoJugador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoJugador)) {
            return false;
        }
        TipoJugador other = (TipoJugador) object;
        if ((this.idTipoJugador == null && other.idTipoJugador != null) || (this.idTipoJugador != null && !this.idTipoJugador.equals(other.idTipoJugador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.TipoJugador[ idTipoJugador=" + idTipoJugador + " ]";
    }
    
}
