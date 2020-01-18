/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.controlador;

import ec.com.guambragol.modelo.Cancha;
import ec.com.guambragol.servicio.CanchaFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
  * Date 1/17/202 
 * Name Daniel Díaz, Edwin Sanabria, Juan Pablo Salazar, Jefferson Sandoval
 * Description
 * Group
 *
 */
@Named("CanchaController")
@ViewScoped

public class CanchaController implements Serializable  {
    @EJB
    private Cancha cancha;
    private List<Cancha> canchas;
    private CanchaFacade canchaEJB;

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }

    public List<Cancha> getCanchas() {
        return canchas;
    }

    public void setCanchas(List<Cancha> canchas) {
        this.canchas = canchas;
    }
    
    
      @PostConstruct
      public void init(){
       cancha = new Cancha(); 
      
      }
      
      public void crear(){
          try{
              canchaEJB.create(cancha);
          }catch(Exception e){
          
          }
      }
}
