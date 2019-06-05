/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrosSystem.facade;

import edu.kayrosSystem.entidades.TipoDocumentos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author monik
 */
@Local
public interface TipoDocumentosFacadeLocal {

    void create(TipoDocumentos tipoDocumentos);

    void edit(TipoDocumentos tipoDocumentos);

    void remove(TipoDocumentos tipoDocumentos);

    TipoDocumentos find(Object id);

    List<TipoDocumentos> findAll();

    List<TipoDocumentos> findRange(int[] range);

    int count();
    
}
