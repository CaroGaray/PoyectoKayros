/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrosSystem.facade;

import edu.kayrosSystem.entidades.ReporteProductosNoVendidos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author monik
 */
@Local
public interface ReporteProductosNoVendidosFacadeLocal {

    void create(ReporteProductosNoVendidos reporteProductosNoVendidos);

    void edit(ReporteProductosNoVendidos reporteProductosNoVendidos);

    void remove(ReporteProductosNoVendidos reporteProductosNoVendidos);

    ReporteProductosNoVendidos find(Object id);

    List<ReporteProductosNoVendidos> findAll();

    List<ReporteProductosNoVendidos> findRange(int[] range);

    int count();
    
}
