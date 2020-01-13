/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.Carnet;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface CarnetFacadeLocal {

    void create(Carnet carnet);

    void edit(Carnet carnet);

    void remove(Carnet carnet);

    Carnet find(Object id);

    List<Carnet> findAll();

    List<Carnet> findRange(int[] range);

    int count();
    
}
