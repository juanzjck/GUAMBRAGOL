/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "Carnet")
@NamedQueries({
    @NamedQuery(name = "Carnet.findAll", query = "SELECT c FROM Carnet c"),
    @NamedQuery(name = "Carnet.findByIdCarnet", query = "SELECT c FROM Carnet c WHERE c.idCarnet = :idCarnet"),
    @NamedQuery(name = "Carnet.findByFechaExp", query = "SELECT c FROM Carnet c WHERE c.fechaExp = :fechaExp"),
    @NamedQuery(name = "Carnet.findByFechaCad", query = "SELECT c FROM Carnet c WHERE c.fechaCad = :fechaCad"),
    @NamedQuery(name = "Carnet.findByFoto", query = "SELECT c FROM Carnet c WHERE c.foto = :foto")})
public class Carnet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCarnet")
    private Integer idCarnet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaExp")
    @Temporal(TemporalType.DATE)
    private Date fechaExp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaCad")
    @Temporal(TemporalType.DATE)
    private Date fechaCad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "foto")
    private String foto;
    @JoinColumn(name = "idDisciplina", referencedColumnName = "idDisciplina")
    @ManyToOne(optional = false)
    private Disciplina idDisciplina;
    @JoinColumn(name = "idJugador", referencedColumnName = "idJugador")
    @ManyToOne(optional = false)
    private Jugador idJugador;

    public Carnet() {
    }

    public Carnet(Integer idCarnet) {
        this.idCarnet = idCarnet;
    }

    public Carnet(Integer idCarnet, Date fechaExp, Date fechaCad, String foto) {
        this.idCarnet = idCarnet;
        this.fechaExp = fechaExp;
        this.fechaCad = fechaCad;
        this.foto = foto;
    }

    public Integer getIdCarnet() {
        return idCarnet;
    }

    public void setIdCarnet(Integer idCarnet) {
        this.idCarnet = idCarnet;
    }

    public Date getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(Date fechaExp) {
        this.fechaExp = fechaExp;
    }

    public Date getFechaCad() {
        return fechaCad;
    }

    public void setFechaCad(Date fechaCad) {
        this.fechaCad = fechaCad;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Disciplina getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(Disciplina idDisciplina) {
        this.idDisciplina = idDisciplina;
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
        hash += (idCarnet != null ? idCarnet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carnet)) {
            return false;
        }
        Carnet other = (Carnet) object;
        if ((this.idCarnet == null && other.idCarnet != null) || (this.idCarnet != null && !this.idCarnet.equals(other.idCarnet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.Carnet[ idCarnet=" + idCarnet + " ]";
    }
    
}
