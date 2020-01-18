/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.guambragol.servicio;

import ec.com.guambragol.modelo.Cancha;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author carlosballadares
 */
@Stateless
public class CanchaFacade extends AbstractFacade<Cancha> implements CanchaFacadeLocal {

    @PersistenceContext(unitName = "guambrmaGolPU")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CanchaFacade() {
        super(Cancha.class);
    }
    
}
