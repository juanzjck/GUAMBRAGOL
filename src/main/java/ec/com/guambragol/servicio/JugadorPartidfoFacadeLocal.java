/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.JugadorPartidfo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface JugadorPartidfoFacadeLocal {

    void create(JugadorPartidfo jugadorPartidfo);

    void edit(JugadorPartidfo jugadorPartidfo);

    void remove(JugadorPartidfo jugadorPartidfo);

    JugadorPartidfo find(Object id);

    List<JugadorPartidfo> findAll();

    List<JugadorPartidfo> findRange(int[] range);

    int count();
    
}
