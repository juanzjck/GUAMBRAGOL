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
import javax.validation.constraints.Size;

/**
 *
 * @author carlosballadares
 */
@Entity
@Table(name = "Liga")
@NamedQueries({
    @NamedQuery(name = "Liga.findAll", query = "SELECT l FROM Liga l"),
    @NamedQuery(name = "Liga.findByIdLiga", query = "SELECT l FROM Liga l WHERE l.idLiga = :idLiga"),
    @NamedQuery(name = "Liga.findByNombre", query = "SELECT l FROM Liga l WHERE l.nombre = :nombre")})
public class Liga implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idLiga")
    private Integer idLiga;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLiga")
    private List<Campeonato> campeonatoList;
    @JoinColumn(name = "idDirectiva", referencedColumnName = "idDirectiva")
    @ManyToOne(optional = false)
    private Directiva idDirectiva;

    public Liga() {
    }

    public Liga(Integer idLiga) {
        this.idLiga = idLiga;
    }

    public Liga(Integer idLiga, String nombre) {
        this.idLiga = idLiga;
        this.nombre = nombre;
    }

    public Integer getIdLiga() {
        return idLiga;
    }

    public void setIdLiga(Integer idLiga) {
        this.idLiga = idLiga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Campeonato> getCampeonatoList() {
        return campeonatoList;
    }

    public void setCampeonatoList(List<Campeonato> campeonatoList) {
        this.campeonatoList = campeonatoList;
    }

    public Directiva getIdDirectiva() {
        return idDirectiva;
    }

    public void setIdDirectiva(Directiva idDirectiva) {
        this.idDirectiva = idDirectiva;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLiga != null ? idLiga.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Liga)) {
            return false;
        }
        Liga other = (Liga) object;
        if ((this.idLiga == null && other.idLiga != null) || (this.idLiga != null && !this.idLiga.equals(other.idLiga))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.Liga[ idLiga=" + idLiga + " ]";
    }
    
}
