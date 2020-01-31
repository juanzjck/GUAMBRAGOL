/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.controlador;

import ec.com.guambragol.modelo.Campeonato;
import ec.com.guambragol.modelo.DetalleFechaCampeonao;
import ec.com.guambragol.modelo.FechaPartido;
import ec.com.guambragol.servicio.CampeonatoFacadeLocal;
import ec.com.guambragol.servicio.DetalleFechaCampeonaoFacadeLocal;
import ec.com.guambragol.servicio.FechaPartidoFacadeLocal;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author LENOVO
 */
@Named("FechaPartidoController")
@ViewScoped
public class FechaPartidoController implements Serializable {
    @EJB
    private FechaPartidoFacadeLocal fechapartidoEJB;
     @EJB
    private CampeonatoFacadeLocal campeonatoEJB;
    @EJB
    private DetalleFechaCampeonaoFacadeLocal detalleEJB;
    private FechaPartido fechapartido;
    List<FechaPartido> fechas;
     List<Campeonato> campeonatos;
    boolean editable=false;
    int idCampeonato;
    
    public List<Campeonato> getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(List<Campeonato> campeonatos) {
        this.campeonatos = campeonatos;
    }

    public int getIdCampeonato() {
        return idCampeonato;
    }

    public void setIdCampeonato(int idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
    
    public void setFechas(List<FechaPartido> fechas) {
        this.fechas = fechas;
    }

    public List<FechaPartido> getFechas() {
        return fechas;
    }
    
    public FechaPartido getfechapartido() {
        return fechapartido;
    }

    public void setFechapartido(FechaPartido fechapartido) {
        this.fechapartido = fechapartido;
    }
    
    @PostConstruct
    public void init(){
        try{
        fechapartido = new FechaPartido();
        fechas = fechapartidoEJB.findAll();
        campeonatos=campeonatoEJB.findAll();
        }catch(Exception e){
        }
       
    }
    public void eliminar(){
        fechapartidoEJB.remove(fechapartido);
     cancel();
    }
    public void edit(){
      
        fechapartidoEJB.edit(fechapartido);
         
        cancel();
    }
    
    public void crear(){
      
        this.fechapartidoEJB.create(fechapartido);
       
        cancel();
    }
     public void editable(){
         this.editable=true;
    }
      public void cancel(){
         this.editable=false;
         init();
    }
     
      
}
