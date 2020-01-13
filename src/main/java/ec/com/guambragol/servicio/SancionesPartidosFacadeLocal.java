/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.SancionesPartidos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface SancionesPartidosFacadeLocal {

    void create(SancionesPartidos sancionesPartidos);

    void edit(SancionesPartidos sancionesPartidos);

    void remove(SancionesPartidos sancionesPartidos);

    SancionesPartidos find(Object id);

    List<SancionesPartidos> findAll();

    List<SancionesPartidos> findRange(int[] range);

    int count();
    
}
