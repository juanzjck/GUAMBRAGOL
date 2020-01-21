/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.controlador;

import ec.com.guambragol.modelo.Cancha;
import ec.com.guambragol.servicio.CanchaFacade;
import ec.com.guambragol.servicio.CanchaFacadeLocal;
import java.io.Serializable;
import static java.lang.System.console;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author LENOVO
 */
@Named("CanchaController")
@ViewScoped

public class CanchaController implements Serializable{
    @EJB
    private CanchaFacadeLocal canchaEJB;
     Cancha canchan;
    private Cancha cancha;
  
      List<Cancha> canchas;
    
    private  Cancha canchaSelecionada;

    public Cancha getCanchaSelecionada() {
        return canchaSelecionada;
    }

    public void setCanchaSelecionada(Cancha canchaSelecionada) {
        this.canchaSelecionada = canchaSelecionada;
    }

  
public CanchaController(){
    cancha= new Cancha();
        }
    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }
  public Cancha getCancha() {
        return cancha;
    }
    public List<Cancha> getCanchas() {
        return canchas;
    }

    public void setCanchas(List<Cancha> canchas) {
        this.canchas = canchas;
    }
    @PostConstruct
    public void init(){
       
   
        cancha= new Cancha();
        try{
            /*
                el metodo no retorna lo que esta en la base de datos, retorna una Lista pero vacia
            */
        canchas= canchaEJB.findAll();    
        }catch(Exception e){
            
        }
        
        /*
        Se agrego datos quemados para realizar una prueba, funciona
        */
   
    }
    public String Crear(){
          try{
              
             canchaEJB.create(cancha);
             this.init();
          }catch(Exception e){
            
        }
        
         
          return "";
    }
    
    
}
