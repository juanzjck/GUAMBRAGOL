/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.GolesPartido;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface GolesPartidoFacadeLocal {

    void create(GolesPartido golesPartido);

    void edit(GolesPartido golesPartido);

    void remove(GolesPartido golesPartido);

    GolesPartido find(Object id);

    List<GolesPartido> findAll();

    List<GolesPartido> findRange(int[] range);

    int count();
    
}
