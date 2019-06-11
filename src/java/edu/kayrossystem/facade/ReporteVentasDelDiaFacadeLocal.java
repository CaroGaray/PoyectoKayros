/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrossystem.facade;

import edu.kayrossystem.entidades.ReporteVentasDelDia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author monik
 */
@Local
public interface ReporteVentasDelDiaFacadeLocal {

    void create(ReporteVentasDelDia reporteVentasDelDia);

    void edit(ReporteVentasDelDia reporteVentasDelDia);

    void remove(ReporteVentasDelDia reporteVentasDelDia);

    ReporteVentasDelDia find(Object id);

    List<ReporteVentasDelDia> findAll();

    List<ReporteVentasDelDia> findRange(int[] range);

    int count();
    
}
