/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.Sanciones;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface SancionesFacadeLocal {

    void create(Sanciones sanciones);

    void edit(Sanciones sanciones);

    void remove(Sanciones sanciones);

    Sanciones find(Object id);

    List<Sanciones> findAll();

    List<Sanciones> findRange(int[] range);

    int count();
    
}
