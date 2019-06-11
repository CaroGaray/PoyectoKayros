/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrossystem.facade;

import edu.kayrossystem.entidades.SalidaProductosTerminado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author monik
 */
@Local
public interface SalidaProductosTerminadoFacadeLocal {

    void create(SalidaProductosTerminado salidaProductosTerminado);

    void edit(SalidaProductosTerminado salidaProductosTerminado);

    void remove(SalidaProductosTerminado salidaProductosTerminado);

    SalidaProductosTerminado find(Object id);

    List<SalidaProductosTerminado> findAll();

    List<SalidaProductosTerminado> findRange(int[] range);

    int count();
    
}
