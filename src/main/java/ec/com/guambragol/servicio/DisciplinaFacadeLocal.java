/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.Disciplina;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author carlosballadares
 */
@Local
public interface DisciplinaFacadeLocal {

    void create(Disciplina disciplina);

    void edit(Disciplina disciplina);

    void remove(Disciplina disciplina);

    Disciplina find(Object id);

    List<Disciplina> findAll();

    List<Disciplina> findRange(int[] range);

    int count();
    
}
