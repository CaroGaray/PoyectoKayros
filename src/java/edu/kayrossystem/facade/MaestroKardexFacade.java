/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrossystem.facade;

import edu.kayrossystem.entidades.MaestroKardex;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author monik
 */
@Stateless
public class MaestroKardexFacade extends AbstractFacade<MaestroKardex> implements MaestroKardexFacadeLocal {

    @PersistenceContext(unitName = "KayrosSystemPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MaestroKardexFacade() {
        super(MaestroKardex.class);
    }
    
}
