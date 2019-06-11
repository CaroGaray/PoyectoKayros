/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrossystem.controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author monik
 */
@Named(value = "usuarioSesion")
@SessionScoped
public class usuarioSesion implements Serializable {

    /**
     * Creates a new instance of usuarioSesion
     */
    public usuarioSesion() {
    }
    
}
