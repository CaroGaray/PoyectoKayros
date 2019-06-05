/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrosSystem.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author monik
 */
@Entity
@Table(name = "detalle_facturas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleFacturas.findAll", query = "SELECT d FROM DetalleFacturas d")})
public class DetalleFacturas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "cantidad")
    private Integer cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "iva")
    private BigDecimal iva;
    @Column(name = "descuento")
    private BigDecimal descuento;
    @OneToMany(mappedBy = "idDetalleFacturas", fetch = FetchType.LAZY)
    private Collection<Facturas> facturasCollection;
    @JoinColumn(name = "id_productos", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Productos idProductos;
    @JoinColumn(name = "id_usuarios", referencedColumnName = "Id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuarios idUsuarios;
    @JoinColumn(name = "id_zonas_distribucion", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ZonasDistribucion idZonasDistribucion;

    public DetalleFacturas() {
    }

    public DetalleFacturas(Integer id) {
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

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    @XmlTransient
    public Collection<Facturas> getFacturasCollection() {
        return facturasCollection;
    }

    public void setFacturasCollection(Collection<Facturas> facturasCollection) {
        this.facturasCollection = facturasCollection;
    }

    public Productos getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(Productos idProductos) {
        this.idProductos = idProductos;
    }

    public Usuarios getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(Usuarios idUsuarios) {
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
        if (!(object instanceof DetalleFacturas)) {
            return false;
        }
        DetalleFacturas other = (DetalleFacturas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.kayrosSystem.entidades.DetalleFacturas[ id=" + id + " ]";
    }
    
}
