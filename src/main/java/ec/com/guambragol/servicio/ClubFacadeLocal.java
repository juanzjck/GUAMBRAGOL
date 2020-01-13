/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.Club;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface ClubFacadeLocal {

    void create(Club club);

    void edit(Club club);

    void remove(Club club);

    Club find(Object id);

    List<Club> findAll();

    List<Club> findRange(int[] range);

    int count();
    
}
