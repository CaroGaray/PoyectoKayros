/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrossystem.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author monik
 */
@Entity
@Table(name = "despachos_mercancia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DespachosMercancia.findAll", query = "SELECT d FROM DespachosMercancia d")})
public class DespachosMercancia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "numero")
    private Integer numero;
    @Size(max = 45)
    @Column(name = "cantidad")
    private String cantidad;
    @JoinColumn(name = "id_usuarios", referencedColumnName = "Id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario idUsuarios;
    @JoinColumn(name = "id_zonas_distribucion", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ZonasDistribucion idZonasDistribucion;

    public DespachosMercancia() {
    }

    public DespachosMercancia(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Usuario getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(Usuario idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public ZonasDistribucion getIdZonasDistribucion() {
        return idZonasDistribucion;
    }

    public void setIdZonasDistribucion(ZonasDistribucion idZonasDistribucion) {
        this.idZonasDistribucion = idZonasDistribucion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DespachosMercancia)) {
            return false;
        }
        DespachosMercancia other = (DespachosMercancia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.kairossystem.entidades.DespachosMercancia[ id=" + id + " ]";
    }
    
}
