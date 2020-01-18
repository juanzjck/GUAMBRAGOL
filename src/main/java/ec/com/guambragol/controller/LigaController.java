/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.controlador;

import ec.com.guambragol.modelo.Liga;
import ec.com.guambragol.servicio.LigaFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.graalvm.compiler.lir.CompositeValue.Component;


/**
 *
 * Date 1/17/202 
 * Name Daniel Díaz, Edwin Sanabria, Juan Pablo Salazar
 * Description
 * Group
 */
//@Named
@Named("LigaController")
@ViewScoped

public class LigaController implements Serializable {
  @EJB
  private LigaFacadeLocal  LigaEJB;
  private Liga liga;
  private List<Liga> ligas;
  
    public List getLigas() {
        return ligas;
    }

  

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }
  
  @PostConstruct
  public void init(){
      liga = new Liga();
      
  }
  
  public void Crear(){
  try{
      LigaEJB.create(liga);
  }catch(Exception e){
  }
  }
}
