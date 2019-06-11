/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrossystem.facade;

import edu.kayrossystem.entidades.ReporteProductosNoVendido;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author monik
 */
@Local
public interface ReporteProductosNoVendidoFacadeLocal {

    void create(ReporteProductosNoVendido reporteProductosNoVendido);

    void edit(ReporteProductosNoVendido reporteProductosNoVendido);

    void remove(ReporteProductosNoVendido reporteProductosNoVendido);

    ReporteProductosNoVendido find(Object id);

    List<ReporteProductosNoVendido> findAll();

    List<ReporteProductosNoVendido> findRange(int[] range);

    int count();
    
}
