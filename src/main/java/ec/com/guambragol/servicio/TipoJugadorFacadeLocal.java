/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.TipoJugador;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface TipoJugadorFacadeLocal {

    void create(TipoJugador tipoJugador);

    void edit(TipoJugador tipoJugador);

    void remove(TipoJugador tipoJugador);

    TipoJugador find(Object id);

    List<TipoJugador> findAll();

    List<TipoJugador> findRange(int[] range);

    int count();
    
}
