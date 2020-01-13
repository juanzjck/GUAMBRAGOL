/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.Liga;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface LigaFacadeLocal {

    void create(Liga liga);

    void edit(Liga liga);

    void remove(Liga liga);

    Liga find(Object id);

    List<Liga> findAll();

    List<Liga> findRange(int[] range);

    int count();
    
}
