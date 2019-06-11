/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrossystem.facade;

import edu.kayrossystem.entidades.ProductosConsistencia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author monik
 */
@Local
public interface ProductosConsistenciaFacadeLocal {

    void create(ProductosConsistencia productosConsistencia);

    void edit(ProductosConsistencia productosConsistencia);

    void remove(ProductosConsistencia productosConsistencia);

    ProductosConsistencia find(Object id);

    List<ProductosConsistencia> findAll();

    List<ProductosConsistencia> findRange(int[] range);

    int count();
    
}
