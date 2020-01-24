/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.controlador;

import ec.com.guambragol.modelo.FechaPartido;
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
    private FechaPartido fechapartido;
    List<FechaPartido> fechas;
    boolean editable=false;

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
        }catch(Exception e){
        }
       
    }
    public void eliminar(){
        fechapartidoEJB.remove(fechapartido);
        init();
    }
    public void edit(){
        fechapartidoEJB.edit(fechapartido);
        init();
    }
    
    public void crear(){
        this.fechapartidoEJB.create(fechapartido);
        init();
    }
     public void editable(){
         this.editable=true;
    }
      public void cancel(){
         this.editable=false;
    }
}
