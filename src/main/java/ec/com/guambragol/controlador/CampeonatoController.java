/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.controlador;

import ec.com.guambragol.modelo.Campeonato;
import ec.com.guambragol.modelo.Liga;
import ec.com.guambragol.servicio.CampeonatoFacadeLocal;
import ec.com.guambragol.servicio.LigaFacadeLocal;
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
@Named("CampeonatoController")
@ViewScoped

public class CampeonatoController implements Serializable {
    @EJB
    private CampeonatoFacadeLocal campionatoEJB;
    @EJB
    private LigaFacadeLocal ligaEJB;
    private Campeonato campeonato;
    List<Campeonato> campeonatos;
    boolean editable=false;
    List<Liga> ligas;
    int iDliga;

    public int getiDliga() {
        return iDliga;
    }

    public void setiDliga(int iDliga) {
        this.iDliga = iDliga;
    }

  
    public boolean isEditable() {
        return editable;
    }

    public List<Liga> getLigas() {
        return ligas;
    }

    public void setLigas(List<Liga> ligas) {
        this.ligas = ligas;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    public List<Campeonato> getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(List<Campeonato> campeonatos) {
        this.campeonatos = campeonatos;
    }
    
      @PostConstruct
      public void init(){
          campeonato= new Campeonato();
          try{
           
            ligas=ligaEJB.findAll();
             campeonatos=campionatoEJB.findAll();
             
          }catch(Exception e){
          
          }
       
      }
      public void eliminar(){
      campionatoEJB.remove(this.campeonato);
        cancel();
        init();
         
      }
       public void crear(){
           setIdLiga();
      campionatoEJB.create(campeonato);
       
        this.init();
      }
       public void setIdLiga(){
        for (Liga l :ligas){
            if(l.getIdLiga()== this.iDliga){
             this.campeonato.setIdLiga(l);
            }
        }
       
       }
      public void edit(){
         setIdLiga();
      campionatoEJB.edit(this.campeonato);
     cancel();
        init();
      }
      public void editable(){
          
          this.editable=true;
    
      }
       public void cancel(){
        setEditable(false);
   
      }
      
}
