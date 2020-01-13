/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.Posicion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface PosicionFacadeLocal {

    void create(Posicion posicion);

    void edit(Posicion posicion);

    void remove(Posicion posicion);

    Posicion find(Object id);

    List<Posicion> findAll();

    List<Posicion> findRange(int[] range);

    int count();
    
}
