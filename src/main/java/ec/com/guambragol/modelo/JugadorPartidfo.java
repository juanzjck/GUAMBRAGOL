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
@Table(name = "JugadorPartidfo")
@NamedQueries({
    @NamedQuery(name = "JugadorPartidfo.findAll", query = "SELECT j FROM JugadorPartidfo j"),
    @NamedQuery(name = "JugadorPartidfo.findByIdJugadorPartidfo", query = "SELECT j FROM JugadorPartidfo j WHERE j.idJugadorPartidfo = :idJugadorPartidfo")})
public class JugadorPartidfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idJugadorPartidfo")
    private Integer idJugadorPartidfo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJugadorEntra")
    private List<Cambios> cambiosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJugadorSale")
    private List<Cambios> cambiosList1;
    @JoinColumn(name = "idJugador", referencedColumnName = "idJugador")
    @ManyToOne
    private Jugador idJugador;

    public JugadorPartidfo() {
    }

    public JugadorPartidfo(Integer idJugadorPartidfo) {
        this.idJugadorPartidfo = idJugadorPartidfo;
    }

    public Integer getIdJugadorPartidfo() {
        return idJugadorPartidfo;
    }

    public void setIdJugadorPartidfo(Integer idJugadorPartidfo) {
        this.idJugadorPartidfo = idJugadorPartidfo;
    }

    public List<Cambios> getCambiosList() {
        return cambiosList;
    }

    public void setCambiosList(List<Cambios> cambiosList) {
        this.cambiosList = cambiosList;
    }

    public List<Cambios> getCambiosList1() {
        return cambiosList1;
    }

    public void setCambiosList1(List<Cambios> cambiosList1) {
        this.cambiosList1 = cambiosList1;
    }

    public Jugador getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Jugador idJugador) {
        this.idJugador = idJugador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJugadorPartidfo != null ? idJugadorPartidfo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JugadorPartidfo)) {
            return false;
        }
        JugadorPartidfo other = (JugadorPartidfo) object;
        if ((this.idJugadorPartidfo == null && other.idJugadorPartidfo != null) || (this.idJugadorPartidfo != null && !this.idJugadorPartidfo.equals(other.idJugadorPartidfo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.JugadorPartidfo[ idJugadorPartidfo=" + idJugadorPartidfo + " ]";
    }
    
}
