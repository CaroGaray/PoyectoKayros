/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrossystem.facade;

import edu.kayrossystem.entidades.TipoDocumento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author monik
 */
@Local
public interface TipoDocumentoFacadeLocal {

    void create(TipoDocumento tipoDocumento);

    void edit(TipoDocumento tipoDocumento);

    void remove(TipoDocumento tipoDocumento);

    TipoDocumento find(Object id);

    List<TipoDocumento> findAll();

    List<TipoDocumento> findRange(int[] range);

    int count();
    
}
