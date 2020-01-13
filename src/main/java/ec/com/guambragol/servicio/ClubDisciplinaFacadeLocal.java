/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.ClubDisciplina;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface ClubDisciplinaFacadeLocal {

    void create(ClubDisciplina clubDisciplina);

    void edit(ClubDisciplina clubDisciplina);

    void remove(ClubDisciplina clubDisciplina);

    ClubDisciplina find(Object id);

    List<ClubDisciplina> findAll();

    List<ClubDisciplina> findRange(int[] range);

    int count();
    
}
