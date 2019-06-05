/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrosSystem.facade;

import edu.kayrosSystem.entidades.SalidaProductosTerminado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author monik
 */
@Stateless
public class SalidaProductosTerminadoFacade extends AbstractFacade<SalidaProductosTerminado> implements SalidaProductosTerminadoFacadeLocal {

    @PersistenceContext(unitName = "KayrosSystemPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SalidaProductosTerminadoFacade() {
        super(SalidaProductosTerminado.class);
    }
    
}
