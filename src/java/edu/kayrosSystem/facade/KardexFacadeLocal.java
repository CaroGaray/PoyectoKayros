/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrosSystem.facade;

import edu.kayrosSystem.entidades.Kardex;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author monik
 */
@Local
public interface KardexFacadeLocal {

    void create(Kardex kardex);

    void edit(Kardex kardex);

    void remove(Kardex kardex);

    Kardex find(Object id);

    List<Kardex> findAll();

    List<Kardex> findRange(int[] range);

    int count();
    
}
