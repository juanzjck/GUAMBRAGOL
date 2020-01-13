/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.Cambios;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface CambiosFacadeLocal {

    void create(Cambios cambios);

    void edit(Cambios cambios);

    void remove(Cambios cambios);

    Cambios find(Object id);

    List<Cambios> findAll();

    List<Cambios> findRange(int[] range);

    int count();
    
}
