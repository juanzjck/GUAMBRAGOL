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
@Table(name = "Persona")
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findByIdPersona", query = "SELECT p FROM Persona p WHERE p.idPersona = :idPersona"),
    @NamedQuery(name = "Persona.findByPrimerNom", query = "SELECT p FROM Persona p WHERE p.primerNom = :primerNom"),
    @NamedQuery(name = "Persona.findBySegundoNum", query = "SELECT p FROM Persona p WHERE p.segundoNum = :segundoNum"),
    @NamedQuery(name = "Persona.findByApellidoPat", query = "SELECT p FROM Persona p WHERE p.apellidoPat = :apellidoPat"),
    @NamedQuery(name = "Persona.findByApellidoMat", query = "SELECT p FROM Persona p WHERE p.apellidoMat = :apellidoMat"),
    @NamedQuery(name = "Persona.findByCedula", query = "SELECT p FROM Persona p WHERE p.cedula = :cedula"),
    @NamedQuery(name = "Persona.findByFechaNac", query = "SELECT p FROM Persona p WHERE p.fechaNac = :fechaNac"),
    @NamedQuery(name = "Persona.findByTelefono", query = "SELECT p FROM Persona p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Persona.findByDomicilio", query = "SELECT p FROM Persona p WHERE p.domicilio = :domicilio"),
    @NamedQuery(name = "Persona.findByProfesion", query = "SELECT p FROM Persona p WHERE p.profesion = :profesion")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPersona")
    private Integer idPersona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "primerNom")
    private String primerNom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "segundoNum")
    private String segundoNum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellidoPat")
    private String apellidoPat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellidoMat")
    private String apellidoMat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cedula")
    private String cedula;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaNac")
    @Temporal(TemporalType.DATE)
    private Date fechaNac;
    @Size(max = 45)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 45)
    @Column(name = "domicilio")
    private String domicilio;
    @Size(max = 45)
    @Column(name = "profesion")
    private String profesion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPersona")
    private List<Arbitro> arbitroList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPerosna")
    private List<Jugador> jugadorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPersona")
    private List<Directiva> directivaList;

    public Persona() {
    }

    public Persona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Persona(Integer idPersona, String primerNom, String segundoNum, String apellidoPat, String apellidoMat, String cedula, Date fechaNac) {
        this.idPersona = idPersona;
        this.primerNom = primerNom;
        this.segundoNum = segundoNum;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.cedula = cedula;
        this.fechaNac = fechaNac;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getPrimerNom() {
        return primerNom;
    }

    public void setPrimerNom(String primerNom) {
        this.primerNom = primerNom;
    }

    public String getSegundoNum() {
        return segundoNum;
    }

    public void setSegundoNum(String segundoNum) {
        this.segundoNum = segundoNum;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public List<Arbitro> getArbitroList() {
        return arbitroList;
    }

    public void setArbitroList(List<Arbitro> arbitroList) {
        this.arbitroList = arbitroList;
    }

    public List<Jugador> getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(List<Jugador> jugadorList) {
        this.jugadorList = jugadorList;
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
        hash += (idPersona != null ? idPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.guambragol.modelo.Persona[ idPersona=" + idPersona + " ]";
    }
    
}
