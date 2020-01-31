/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.controlador;

import ec.com.guambragol.modelo.Genero;
import ec.com.guambragol.servicio.GeneroFacadeLocal;
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
@Named("generocontroller")
@ViewScoped
public class generocontroller implements Serializable{
    @EJB
    private GeneroFacadeLocal generoEJB;
    
    private Genero genero;
    private List<Genero> generos;
    boolean editable= false;

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
    
      @PostConstruct
      public void init(){
          genero= new Genero();
          generos= generoEJB.findAll();
      }
      public void crear(){
          generoEJB.create(genero);
          cancel();
      }
      public void edit(){
          generoEJB.edit(genero);
          cancel();
      }
      public void eliminar(){
          generoEJB.remove(genero);
          cancel();
      }
      
      public void editable(){
          this.editable= true;
      }
     public void cancel(){
          this.editable= false;
          init();
      }
}
