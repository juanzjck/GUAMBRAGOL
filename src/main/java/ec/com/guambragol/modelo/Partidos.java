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
@Table(name = "Partidos")
@NamedQueries({
    @NamedQuery(name = "Partidos.findAll", query = "SELECT p FROM Partidos p"),
    @NamedQuery(name = "Partidos.findByIdPartidos", query = "SELECT p FROM Partidos p WHERE p.idPartidos = :idPartidos"),
    @NamedQuery(name = "Partidos.findByFecha", query = "SELECT p FROM Partidos p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "Partidos.findByHora", query = "SELECT p FROM Partidos p WHERE p.hora = :hora"),
    @NamedQuery(name = "Partidos.findByCategoria", query = "SELECT p FROM Partidos p WHERE p.categoria = :categoria"),
    @NamedQuery(name = "Partidos.findByGolesLocal", query = "SELECT p FROM Partidos p WHERE p.golesLocal = :golesLocal"),
    @NamedQuery(name = "Partidos.findByGolesVisitante", query = "SELECT p FROM Partidos p WHERE p.golesVisitante = :golesVisitante")})
public class Partidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   
    @Column(name = "idPartidos")
    private Integer idPartidos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora")
    private int hora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "categoria")
    private String categoria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "golesLocal")
    private int golesLocal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "golesVisitante")
    private int golesVisitante;
    @JoinColumn(name = "idCancha", referencedColumnName = "idCancha")
    @ManyToOne(optional = false)
    private Cancha idCancha;
    @JoinColumn(name = "idArbitro", referencedColumnName = "idArbitro")
    @ManyToOne(optional = false)
    private Arbitro idArbitro;
    @JoinColumn(name = "idClubLocal", referencedColumnName = "idClub")
    @ManyToOne(optional = false)
    private Club idClubLocal;
    @JoinColumn(name = "idClubVisitante", referencedColumnName = "idClub")
    @ManyToOne(optional = false)
    private Club idClubVisitante;
    @JoinColumn(name = "idFechaPartido", referencedColumnName = "idFechaPartido")
    @ManyToOne(optional = false)
    private FechaPartido idFechaPartido;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPartido")
    private List<GolesPartido> golesPartidoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPartido")
    private List<TablaPosiciones> tablaPosicionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPartido")
    private List<SancionesPartidos> sancionesPartidosList;

    public Partidos() {
    }

    public Partidos(Integer idPartidos) {
        this.idPartidos = idPartidos;
    }

    public Partidos(Integer idPartidos, Date fecha, int hora, String categoria, int golesLocal, int golesVisitante) {
        this.idPartidos = idPartidos;
        this.fecha = fecha;
        this.hora = hora;
        this.categoria = categoria;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public Integer getIdPartidos() {
        return idPartidos;
    }

    public void setIdPartidos(Integer idPartidos) {
        this.idPartidos = idPartidos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public Cancha getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(Cancha idCancha) {
        this.idCancha = idCancha;
    }

    public Arbitro getIdArbitro() {
        return idArbitro;
    }

    public void setIdArbitro(Arbitro idArbitro) {
        this.idArbitro = idArbitro;
    }

    public Club getIdClubLocal() {
        return idClubLocal;
    }

    public void setIdClubLocal(Club idClubLocal) {
        this.idClubLocal = idClubLocal;
    }

    public Club getIdClubVisitante() {
        return idClubVisitante;
    }

    public void setIdClubVisitante(Club idClubVisitante) {
        this.idClubVisitante = idClubVisitante;
    }

    public FechaPartido getIdFechaPartido() {
        return idFechaPartido;
    }

    public void setIdFechaPartido(FechaPartido idFechaPartido) {
        this.idFechaPartido = idFechaPartido;
    }

    public List<GolesPartido> getGolesPartidoList() {
        return golesPartidoList;
    }

    public void setGolesPartidoList(List<GolesPartido> golesPartidoList) {
        this.golesPartidoList = golesPartidoList;
    }

    public List<TablaPosiciones> getTablaPosicionesList() {
        return tablaPosicionesList;
    }

    public void setTablaPosicionesList(List<TablaPosiciones> tablaPosicionesList) {
        this.tablaPosicionesList = tablaPosicionesList;
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
        hash += (idPartidos != null ? idPartidos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partidos)) {
            return false;
        }
        Partidos other = (Partidos) object;
        if ((this.idPartidos == null && other.idPartidos != null) || (this.idPartidos != null && !this.idPartidos.equals(other.idPartidos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.Partidos[ idPartidos=" + idPartidos + " ]";
    }
    
}
