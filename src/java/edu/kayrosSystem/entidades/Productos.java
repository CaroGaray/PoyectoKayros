/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrosSystem.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author monik
 */
@Entity
@Table(name = "productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p")})
public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 150)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "peso")
    private String peso;
    @Size(max = 45)
    @Column(name = "cantidad")
    private String cantidad;
    @Size(max = 45)
    @Column(name = "fecha_vence")
    private String fechaVence;
    @Size(max = 10)
    @Column(name = "lote")
    private String lote;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProductos", fetch = FetchType.LAZY)
    private Collection<OrdenesProduccion> ordenesProduccionCollection;
    @OneToMany(mappedBy = "idProductos", fetch = FetchType.LAZY)
    private Collection<OrdenesCompra> ordenesCompraCollection;
    @OneToMany(mappedBy = "idProductos", fetch = FetchType.LAZY)
    private Collection<MaestroKardex> maestroKardexCollection;
    @OneToMany(mappedBy = "idProductos", fetch = FetchType.LAZY)
    private Collection<DetalleFacturas> detalleFacturasCollection;
    @JoinColumn(name = "id_salida_producto_terminado", referencedColumnName = "Id")
    @ManyToOne(fetch = FetchType.LAZY)
    private SalidaProductosTerminado idSalidaProductoTerminado;
    @OneToMany(mappedBy = "idproductos", fetch = FetchType.LAZY)
    private Collection<ProductosConsistencia> productosConsistenciaCollection;

    public Productos() {
    }

    public Productos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaVence() {
        return fechaVence;
    }

    public void setFechaVence(String fechaVence) {
        this.fechaVence = fechaVence;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    @XmlTransient
    public Collection<OrdenesProduccion> getOrdenesProduccionCollection() {
        return ordenesProduccionCollection;
    }

    public void setOrdenesProduccionCollection(Collection<OrdenesProduccion> ordenesProduccionCollection) {
        this.ordenesProduccionCollection = ordenesProduccionCollection;
    }

    @XmlTransient
    public Collection<OrdenesCompra> getOrdenesCompraCollection() {
        return ordenesCompraCollection;
    }

    public void setOrdenesCompraCollection(Collection<OrdenesCompra> ordenesCompraCollection) {
        this.ordenesCompraCollection = ordenesCompraCollection;
    }

    @XmlTransient
    public Collection<MaestroKardex> getMaestroKardexCollection() {
        return maestroKardexCollection;
    }

    public void setMaestroKardexCollection(Collection<MaestroKardex> maestroKardexCollection) {
        this.maestroKardexCollection = maestroKardexCollection;
    }

    @XmlTransient
    public Collection<DetalleFacturas> getDetalleFacturasCollection() {
        return detalleFacturasCollection;
    }

    public void setDetalleFacturasCollection(Collection<DetalleFacturas> detalleFacturasCollection) {
        this.detalleFacturasCollection = detalleFacturasCollection;
    }

    public SalidaProductosTerminado getIdSalidaProductoTerminado() {
        return idSalidaProductoTerminado;
    }

    public void setIdSalidaProductoTerminado(SalidaProductosTerminado idSalidaProductoTerminado) {
        this.idSalidaProductoTerminado = idSalidaProductoTerminado;
    }

    @XmlTransient
    public Collection<ProductosConsistencia> getProductosConsistenciaCollection() {
        return productosConsistenciaCollection;
    }

    public void setProductosConsistenciaCollection(Collection<ProductosConsistencia> productosConsistenciaCollection) {
        this.productosConsistenciaCollection = productosConsistenciaCollection;
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
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.kayrosSystem.entidades.Productos[ id=" + id + " ]";
    }
    
}
