/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.TablaPosiciones;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface TablaPosicionesFacadeLocal {

    void create(TablaPosiciones tablaPosiciones);

    void edit(TablaPosiciones tablaPosiciones);

    void remove(TablaPosiciones tablaPosiciones);

    TablaPosiciones find(Object id);

    List<TablaPosiciones> findAll();

    List<TablaPosiciones> findRange(int[] range);

    int count();
    
}
