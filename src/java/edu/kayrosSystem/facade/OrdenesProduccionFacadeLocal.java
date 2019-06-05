/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrosSystem.facade;

import edu.kayrosSystem.entidades.OrdenesProduccion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author monik
 */
@Local
public interface OrdenesProduccionFacadeLocal {

    void create(OrdenesProduccion ordenesProduccion);

    void edit(OrdenesProduccion ordenesProduccion);

    void remove(OrdenesProduccion ordenesProduccion);

    OrdenesProduccion find(Object id);

    List<OrdenesProduccion> findAll();

    List<OrdenesProduccion> findRange(int[] range);

    int count();
    
}
