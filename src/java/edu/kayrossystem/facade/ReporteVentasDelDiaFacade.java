/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrossystem.facade;

import edu.kayrossystem.entidades.ReporteVentasDelDia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author monik
 */
@Stateless
public class ReporteVentasDelDiaFacade extends AbstractFacade<ReporteVentasDelDia> implements ReporteVentasDelDiaFacadeLocal {

    @PersistenceContext(unitName = "KayrosSystemPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReporteVentasDelDiaFacade() {
        super(ReporteVentasDelDia.class);
    }
    
}
