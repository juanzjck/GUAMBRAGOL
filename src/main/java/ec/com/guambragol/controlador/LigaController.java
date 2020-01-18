/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.controlador;

import ec.com.guambragol.modelo.Liga;
import ec.com.guambragol.servicio.LigaFacadeLocal;
import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.graalvm.compiler.lir.CompositeValue.Component;


/**
 *
 * @author LENOVO
 */
//@Named
@Named("LigaController")
@ViewScoped

public class LigaController implements Serializable {
  @EJB
  private LigaFacadeLocal  LigaEJB;
  private Liga liga;
  private Liga ligas;
  
    public Liga getLigas() {
        return ligas;
    }

    public void setLigas(Liga ligas) {
        this.ligas = ligas;
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
