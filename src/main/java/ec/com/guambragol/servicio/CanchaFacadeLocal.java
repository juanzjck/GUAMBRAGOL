/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.Cancha;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface CanchaFacadeLocal {

    void create(Cancha cancha);

    void edit(Cancha cancha);

    void remove(Cancha cancha);

    Cancha find(Object id);

    List<Cancha> findAll();

    List<Cancha> findRange(int[] range);

    int count();
    
}
