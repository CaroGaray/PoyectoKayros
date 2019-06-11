/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrossystem.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author monik
 */
@Entity
@Table(name = "productos_consistencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductosConsistencia.findAll", query = "SELECT p FROM ProductosConsistencia p")})
public class ProductosConsistencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Size(max = 100)
    @Column(name = "concepto_devolucion")
    private String conceptoDevolucion;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "Id_productos", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Producto idproductos;

    public ProductosConsistencia() {
    }

    public ProductosConsistencia(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getConceptoDevolucion() {
        return conceptoDevolucion;
    }

    public void setConceptoDevolucion(String conceptoDevolucion) {
        this.conceptoDevolucion = conceptoDevolucion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Producto getIdproductos() {
        return idproductos;
    }

    public void setIdproductos(Producto idproductos) {
        this.idproductos = idproductos;
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
        if (!(object instanceof ProductosConsistencia)) {
            return false;
        }
        ProductosConsistencia other = (ProductosConsistencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.kairossystem.entidades.ProductosConsistencia[ id=" + id + " ]";
    }
    
}
