/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrossystem.facade;

import edu.kayrossystem.entidades.MaestroKardex;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author monik
 */
@Local
public interface MaestroKardexFacadeLocal {

    void create(MaestroKardex maestroKardex);

    void edit(MaestroKardex maestroKardex);

    void remove(MaestroKardex maestroKardex);

    MaestroKardex find(Object id);

    List<MaestroKardex> findAll();

    List<MaestroKardex> findRange(int[] range);

    int count();
    
}
