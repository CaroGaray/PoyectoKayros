/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrosSystem.facade;

import edu.kayrosSystem.entidades.DespachosMercancia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author monik
 */
@Local
public interface DespachosMercanciaFacadeLocal {

    void create(DespachosMercancia despachosMercancia);

    void edit(DespachosMercancia despachosMercancia);

    void remove(DespachosMercancia despachosMercancia);

    DespachosMercancia find(Object id);

    List<DespachosMercancia> findAll();

    List<DespachosMercancia> findRange(int[] range);

    int count();
    
}
