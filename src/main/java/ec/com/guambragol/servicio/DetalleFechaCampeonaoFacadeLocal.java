/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.DetalleFechaCampeonao;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface DetalleFechaCampeonaoFacadeLocal {

    void create(DetalleFechaCampeonao detalleFechaCampeonao);

    void edit(DetalleFechaCampeonao detalleFechaCampeonao);

    void remove(DetalleFechaCampeonao detalleFechaCampeonao);

    DetalleFechaCampeonao find(Object id);

    List<DetalleFechaCampeonao> findAll();

    List<DetalleFechaCampeonao> findRange(int[] range);

    int count();
    
}
