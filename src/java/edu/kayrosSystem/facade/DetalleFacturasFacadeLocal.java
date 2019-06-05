/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrosSystem.facade;

import edu.kayrosSystem.entidades.DetalleFacturas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author monik
 */
@Local
public interface DetalleFacturasFacadeLocal {

    void create(DetalleFacturas detalleFacturas);

    void edit(DetalleFacturas detalleFacturas);

    void remove(DetalleFacturas detalleFacturas);

    DetalleFacturas find(Object id);

    List<DetalleFacturas> findAll();

    List<DetalleFacturas> findRange(int[] range);

    int count();
    
}
