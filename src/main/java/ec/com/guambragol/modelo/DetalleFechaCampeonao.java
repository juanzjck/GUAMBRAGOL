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
@Table(name = "DetalleFechaCampeonao")
@NamedQueries({
    @NamedQuery(name = "DetalleFechaCampeonao.findAll", query = "SELECT d FROM DetalleFechaCampeonao d"),
    @NamedQuery(name = "DetalleFechaCampeonao.findByIdDetalleFechaCampeonao", query = "SELECT d FROM DetalleFechaCampeonao d WHERE d.idDetalleFechaCampeonao = :idDetalleFechaCampeonao")})
public class DetalleFechaCampeonao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDetalleFechaCampeonao")
    private Integer idDetalleFechaCampeonao;
    @JoinColumn(name = "idCampeonato", referencedColumnName = "idCampeonato")
    @ManyToOne(optional = false)
    private Campeonato idCampeonato;
    @JoinColumn(name = "idFechaPartido", referencedColumnName = "idFechaPartido")
    @ManyToOne(optional = false)
    private FechaPartido idFechaPartido;

    public DetalleFechaCampeonao() {
    }

    public DetalleFechaCampeonao(Integer idDetalleFechaCampeonao) {
        this.idDetalleFechaCampeonao = idDetalleFechaCampeonao;
    }

    public Integer getIdDetalleFechaCampeonao() {
        return idDetalleFechaCampeonao;
    }

    public void setIdDetalleFechaCampeonao(Integer idDetalleFechaCampeonao) {
        this.idDetalleFechaCampeonao = idDetalleFechaCampeonao;
    }

    public Campeonato getIdCampeonato() {
        return idCampeonato;
    }

    public void setIdCampeonato(Campeonato idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

    public FechaPartido getIdFechaPartido() {
        return idFechaPartido;
    }

    public void setIdFechaPartido(FechaPartido idFechaPartido) {
        this.idFechaPartido = idFechaPartido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleFechaCampeonao != null ? idDetalleFechaCampeonao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleFechaCampeonao)) {
            return false;
        }
        DetalleFechaCampeonao other = (DetalleFechaCampeonao) object;
        if ((this.idDetalleFechaCampeonao == null && other.idDetalleFechaCampeonao != null) || (this.idDetalleFechaCampeonao != null && !this.idDetalleFechaCampeonao.equals(other.idDetalleFechaCampeonao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.DetalleFechaCampeonao[ idDetalleFechaCampeonao=" + idDetalleFechaCampeonao + " ]";
    }
    
}
