/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrossystem.facade;

import edu.kayrossystem.entidades.Insumo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author monik
 */
@Stateless
public class InsumoFacade extends AbstractFacade<Insumo> implements InsumoFacadeLocal {

    @PersistenceContext(unitName = "KayrosSystemPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InsumoFacade() {
        super(Insumo.class);
    }
    
}
