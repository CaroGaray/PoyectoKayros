/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrosSystem.facade;

import edu.kayrosSystem.entidades.OrdenesCompra;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author monik
 */
@Local
public interface OrdenesCompraFacadeLocal {

    void create(OrdenesCompra ordenesCompra);

    void edit(OrdenesCompra ordenesCompra);

    void remove(OrdenesCompra ordenesCompra);

    OrdenesCompra find(Object id);

    List<OrdenesCompra> findAll();

    List<OrdenesCompra> findRange(int[] range);

    int count();
    
}
