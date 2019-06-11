/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrossystem.facade;

import edu.kayrossystem.entidades.ZonasDistribucion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author monik
 */
@Local
public interface ZonasDistribucionFacadeLocal {

    void create(ZonasDistribucion zonasDistribucion);

    void edit(ZonasDistribucion zonasDistribucion);

    void remove(ZonasDistribucion zonasDistribucion);

    ZonasDistribucion find(Object id);

    List<ZonasDistribucion> findAll();

    List<ZonasDistribucion> findRange(int[] range);

    int count();
    
}
