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
import javax.validation.constraints.Size;

/**
 *
 * @author carlosballadares
 */
@Entity
@Table(name = "Club")
@NamedQueries({
    @NamedQuery(name = "Club.findAll", query = "SELECT c FROM Club c"),
    @NamedQuery(name = "Club.findByIdClub", query = "SELECT c FROM Club c WHERE c.idClub = :idClub"),
    @NamedQuery(name = "Club.findByNombreClub", query = "SELECT c FROM Club c WHERE c.nombreClub = :nombreClub"),
    @NamedQuery(name = "Club.findByFechaFundacion", query = "SELECT c FROM Club c WHERE c.fechaFundacion = :fechaFundacion"),
    @NamedQuery(name = "Club.findByColores", query = "SELECT c FROM Club c WHERE c.colores = :colores"),
    @NamedQuery(name = "Club.findByAcuerdoMinist", query = "SELECT c FROM Club c WHERE c.acuerdoMinist = :acuerdoMinist")})
public class Club implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idClub")
    private Integer idClub;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreClub")
    private String nombreClub;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaFundacion")
    @Temporal(TemporalType.DATE)
    private Date fechaFundacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "colores")
    private String colores;
    @Basic(optional = false)
    @NotNull
    @Column(name = "acuerdoMinist")
    private short acuerdoMinist;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClubLocal")
    private List<Partidos> partidosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClubVisitante")
    private List<Partidos> partidosList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClub")
    private List<Jugador> jugadorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEquipo")
    private List<TablaPosiciones> tablaPosicionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClub")
    private List<ClubDisciplina> clubDisciplinaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClub")
    private List<Directiva> directivaList;

    public Club() {
    }

    public Club(Integer idClub) {
        this.idClub = idClub;
    }

    public Club(Integer idClub, String nombreClub, Date fechaFundacion, String colores, short acuerdoMinist) {
        this.idClub = idClub;
        this.nombreClub = nombreClub;
        this.fechaFundacion = fechaFundacion;
        this.colores = colores;
        this.acuerdoMinist = acuerdoMinist;
    }

    public Integer getIdClub() {
        return idClub;
    }

    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public Date getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(Date fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public short getAcuerdoMinist() {
        return acuerdoMinist;
    }

    public void setAcuerdoMinist(short acuerdoMinist) {
        this.acuerdoMinist = acuerdoMinist;
    }

    public List<Partidos> getPartidosList() {
        return partidosList;
    }

    public void setPartidosList(List<Partidos> partidosList) {
        this.partidosList = partidosList;
    }

    public List<Partidos> getPartidosList1() {
        return partidosList1;
    }

    public void setPartidosList1(List<Partidos> partidosList1) {
        this.partidosList1 = partidosList1;
    }

    public List<Jugador> getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(List<Jugador> jugadorList) {
        this.jugadorList = jugadorList;
    }

    public List<TablaPosiciones> getTablaPosicionesList() {
        return tablaPosicionesList;
    }

    public void setTablaPosicionesList(List<TablaPosiciones> tablaPosicionesList) {
        this.tablaPosicionesList = tablaPosicionesList;
    }

    public List<ClubDisciplina> getClubDisciplinaList() {
        return clubDisciplinaList;
    }

    public void setClubDisciplinaList(List<ClubDisciplina> clubDisciplinaList) {
        this.clubDisciplinaList = clubDisciplinaList;
    }

    public List<Directiva> getDirectivaList() {
        return directivaList;
    }

    public void setDirectivaList(List<Directiva> directivaList) {
        this.directivaList = directivaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClub != null ? idClub.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Club)) {
            return false;
        }
        Club other = (Club) object;
        if ((this.idClub == null && other.idClub != null) || (this.idClub != null && !this.idClub.equals(other.idClub))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.Club[ idClub=" + idClub + " ]";
    }
    
}
