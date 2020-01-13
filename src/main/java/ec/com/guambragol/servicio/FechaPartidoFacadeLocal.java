/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.FechaPartido;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface FechaPartidoFacadeLocal {

    void create(FechaPartido fechaPartido);

    void edit(FechaPartido fechaPartido);

    void remove(FechaPartido fechaPartido);

    FechaPartido find(Object id);

    List<FechaPartido> findAll();

    List<FechaPartido> findRange(int[] range);

    int count();
    
}
