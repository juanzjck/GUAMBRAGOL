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
@Table(name = "TablaPosiciones")
@NamedQueries({
    @NamedQuery(name = "TablaPosiciones.findAll", query = "SELECT t FROM TablaPosiciones t"),
    @NamedQuery(name = "TablaPosiciones.findByIdTablaPosiciones", query = "SELECT t FROM TablaPosiciones t WHERE t.idTablaPosiciones = :idTablaPosiciones"),
    @NamedQuery(name = "TablaPosiciones.findByPartidoGanar", query = "SELECT t FROM TablaPosiciones t WHERE t.partidoGanar = :partidoGanar"),
    @NamedQuery(name = "TablaPosiciones.findByPartidosPerdidos", query = "SELECT t FROM TablaPosiciones t WHERE t.partidosPerdidos = :partidosPerdidos"),
    @NamedQuery(name = "TablaPosiciones.findByPartidosEmpatados", query = "SELECT t FROM TablaPosiciones t WHERE t.partidosEmpatados = :partidosEmpatados"),
    @NamedQuery(name = "TablaPosiciones.findByGolesAfavor", query = "SELECT t FROM TablaPosiciones t WHERE t.golesAfavor = :golesAfavor"),
    @NamedQuery(name = "TablaPosiciones.findByGolesContra", query = "SELECT t FROM TablaPosiciones t WHERE t.golesContra = :golesContra")})
public class TablaPosiciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTablaPosiciones")
    private Integer idTablaPosiciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "partidoGanar")
    private int partidoGanar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "partidosPerdidos")
    private int partidosPerdidos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "partidosEmpatados")
    private int partidosEmpatados;
    @Basic(optional = false)
    @NotNull
    @Column(name = "golesAfavor")
    private int golesAfavor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "golesContra")
    private int golesContra;
    @JoinColumn(name = "idEquipo", referencedColumnName = "idClub")
    @ManyToOne(optional = false)
    private Club idEquipo;
    @JoinColumn(name = "idPartido", referencedColumnName = "idPartidos")
    @ManyToOne(optional = false)
    private Partidos idPartido;

    public TablaPosiciones() {
    }

    public TablaPosiciones(Integer idTablaPosiciones) {
        this.idTablaPosiciones = idTablaPosiciones;
    }

    public TablaPosiciones(Integer idTablaPosiciones, int partidoGanar, int partidosPerdidos, int partidosEmpatados, int golesAfavor, int golesContra) {
        this.idTablaPosiciones = idTablaPosiciones;
        this.partidoGanar = partidoGanar;
        this.partidosPerdidos = partidosPerdidos;
        this.partidosEmpatados = partidosEmpatados;
        this.golesAfavor = golesAfavor;
        this.golesContra = golesContra;
    }

    public Integer getIdTablaPosiciones() {
        return idTablaPosiciones;
    }

    public void setIdTablaPosiciones(Integer idTablaPosiciones) {
        this.idTablaPosiciones = idTablaPosiciones;
    }

    public int getPartidoGanar() {
        return partidoGanar;
    }

    public void setPartidoGanar(int partidoGanar) {
        this.partidoGanar = partidoGanar;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getGolesAfavor() {
        return golesAfavor;
    }

    public void setGolesAfavor(int golesAfavor) {
        this.golesAfavor = golesAfavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public Club getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Club idEquipo) {
        this.idEquipo = idEquipo;
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
        hash += (idTablaPosiciones != null ? idTablaPosiciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TablaPosiciones)) {
            return false;
        }
        TablaPosiciones other = (TablaPosiciones) object;
        if ((this.idTablaPosiciones == null && other.idTablaPosiciones != null) || (this.idTablaPosiciones != null && !this.idTablaPosiciones.equals(other.idTablaPosiciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.TablaPosiciones[ idTablaPosiciones=" + idTablaPosiciones + " ]";
    }
    
}
