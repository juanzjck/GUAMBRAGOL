/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.controlador;

import ec.com.guambragol.modelo.Arbitro;
import ec.com.guambragol.modelo.Cancha;
import ec.com.guambragol.modelo.Club;
import ec.com.guambragol.modelo.FechaPartido;
import ec.com.guambragol.modelo.Partidos;
import ec.com.guambragol.servicio.ArbitroFacadeLocal;
import ec.com.guambragol.servicio.CanchaFacadeLocal;
import ec.com.guambragol.servicio.ClubFacadeLocal;
import ec.com.guambragol.servicio.FechaPartidoFacadeLocal;
import ec.com.guambragol.servicio.PartidosFacadeLocal;
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
@Named("PartidoController")
@ViewScoped
public class PartidoController implements Serializable {
     @EJB
     private PartidosFacadeLocal partidoEJB;
     
     @EJB
     private FechaPartidoFacadeLocal fechaEJB;
     
      @EJB
     private CanchaFacadeLocal canchaEJB;
      
      @EJB
     private ClubFacadeLocal clubEJB;
      @EJB
     private ArbitroFacadeLocal arbitroEJB;
     
     List<Partidos> partidos;
     Partidos partido;
     List<FechaPartido>  fechapartidos;
     List<Arbitro>  arbitros;
     List<Club>  clubs;
     List<Cancha>   canchas;
     boolean editable=false;
    int idfecha;
    int idarbitro;
    int idclublocal;
    int idclubvisitante;
    int idcancha;

    public PartidosFacadeLocal getPartidoEJB() {
        return partidoEJB;
    }

    public void setPartidoEJB(PartidosFacadeLocal partidoEJB) {
        this.partidoEJB = partidoEJB;
    }

    public int getIdfecha() {
        return idfecha;
    }

    public void setIdfecha(int idfecha) {
        this.idfecha = idfecha;
    }

    public int getIdarbitro() {
        return idarbitro;
    }

    public void setIdarbitro(int idarbitro) {
        this.idarbitro = idarbitro;
    }

    public int getIdclublocal() {
        return idclublocal;
    }

    public void setIdclublocal(int idclublocal) {
        this.idclublocal = idclublocal;
    }

    public int getIdclubvisitante() {
        return idclubvisitante;
    }

    public void setIdclubvisitante(int idclubvisitante) {
        this.idclubvisitante = idclubvisitante;
    }



    public int getIdcancha() {
        return idcancha;
    }

    public void setIdcancha(int idcancha) {
        this.idcancha = idcancha;
    }
    
    public List<Partidos> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partidos> partidos) {
        this.partidos = partidos;
    }

    public Partidos getPartido() {
        return partido;
    }

    public void setPartido(Partidos partido) {
        this.partido = partido;
    }

    public List<FechaPartido> getFechapartidos() {
        return fechapartidos;
    }

    public void setFechapartidos(List<FechaPartido> fechapartidos) {
        this.fechapartidos = fechapartidos;
    }

    public List<Arbitro> getArbitros() {
        return arbitros;
    }

    public void setArbitros(List<Arbitro> arbitros) {
        this.arbitros = arbitros;
    }

    public List<Club> getClubs() {
        return clubs;
    }

    public void setClubs(List<Club> clubs) {
        this.clubs = clubs;
    }

    public List<Cancha> getCanchas() {
        return canchas;
    }

    public void setCanchas(List<Cancha> canchas) {
        this.canchas = canchas;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
     @PostConstruct
     public void init(){
                partidos=partidoEJB.findAll();
                partido= new Partidos();
                fechapartidos=fechaEJB.findAll();
                arbitros=arbitroEJB.findAll();
                clubs=clubEJB.findAll();
                canchas=canchaEJB.findAll();
     }
     
     /*Guardo los valores editados de una cancha*/
    
     public void editable() {
         
         this.editable =true; 
     
    }
     
      public void cancel() {
         this.editable =false; 
            init();
    }
      public void eliminiar(){
       setAtributs();
      partidoEJB.remove(partido);
      cancel();
      }
     public void crear(){
       setAtributs();
      partidoEJB.create(partido);
      cancel();
      }
       public void edit(){
       setAtributs();
        partidoEJB.edit(partido);
        cancel();
      }
       
       public void setAtributs(){
          
           for(Cancha c : canchaEJB.findAll()){
                if(c.getIdCancha()==idcancha){
                        partido.setIdCancha(c);
                }
       }
           for(Arbitro a : arbitroEJB.findAll()){
                if(a.getIdArbitro()==idarbitro){
                        partido.setIdArbitro(a);
                }
       }
           
           for(Club c : clubEJB.findAll()){
                if(c.getIdClub()==idclublocal){
                        partido.setIdClubLocal(c);
                }
                if(c.getIdClub()==idclubvisitante){
                        partido.setIdClubVisitante(c);
                }
       }
               for(FechaPartido f : fechaEJB.findAll()){
                if(f.getIdFechaPartido()==idfecha){
                        partido.setIdFechaPartido(f);
                }
       }
       }
}
