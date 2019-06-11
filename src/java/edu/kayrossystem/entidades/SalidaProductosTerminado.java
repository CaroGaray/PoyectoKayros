/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrossystem.entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author monik
 */
@Entity
@Table(name = "salida_productos_terminado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalidaProductosTerminado.findAll", query = "SELECT s FROM SalidaProductosTerminado s")})
public class SalidaProductosTerminado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "No_registro_de_salida")
    private int noregistrodesalida;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Lote")
    private String lote;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cantidad")
    private int cantidad;
    @Size(max = 45)
    @Column(name = "No_orden_produccion")
    private String noordenproduccion;
    @OneToMany(mappedBy = "idSalidaProductoTerminado", fetch = FetchType.LAZY)
    private Collection<Producto> productoCollection;

    public SalidaProductosTerminado() {
    }

    public SalidaProductosTerminado(Integer id) {
        this.id = id;
    }

    public SalidaProductosTerminado(Integer id, int noregistrodesalida, String lote, Date fecha, int cantidad) {
        this.id = id;
        this.noregistrodesalida = noregistrodesalida;
        this.lote = lote;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNoregistrodesalida() {
        return noregistrodesalida;
    }

    public void setNoregistrodesalida(int noregistrodesalida) {
        this.noregistrodesalida = noregistrodesalida;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNoordenproduccion() {
        return noordenproduccion;
    }

    public void setNoordenproduccion(String noordenproduccion) {
        this.noordenproduccion = noordenproduccion;
    }

    @XmlTransient
    public Collection<Producto> getProductoCollection() {
        return productoCollection;
    }

    public void setProductoCollection(Collection<Producto> productoCollection) {
        this.productoCollection = productoCollection;
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
        if (!(object instanceof SalidaProductosTerminado)) {
            return false;
        }
        SalidaProductosTerminado other = (SalidaProductosTerminado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.kairossystem.entidades.SalidaProductosTerminado[ id=" + id + " ]";
    }
    
}
