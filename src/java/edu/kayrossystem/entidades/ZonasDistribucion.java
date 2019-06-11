/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrossystem.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "zonas_distribucion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ZonasDistribucion.findAll", query = "SELECT z FROM ZonasDistribucion z")})
public class ZonasDistribucion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Departamento")
    private String departamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ciudad")
    private String ciudad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "barrio")
    private String barrio;
    @Size(max = 100)
    @Column(name = "localidad")
    private String localidad;
    @OneToMany(mappedBy = "idZonasDistribucion", fetch = FetchType.LAZY)
    private Collection<DespachosMercancia> despachosMercanciaCollection;
    @OneToMany(mappedBy = "idZonasDistribucion", fetch = FetchType.LAZY)
    private Collection<DetalleFactura> detalleFacturaCollection;
    @OneToMany(mappedBy = "idZonaDistribucion", fetch = FetchType.LAZY)
    private Collection<ReporteVentasDelDia> reporteVentasDelDiaCollection;
    @OneToMany(mappedBy = "idZonaDistribucio", fetch = FetchType.LAZY)
    private Collection<ReporteProductosNoVendido> reporteProductosNoVendidoCollection;

    public ZonasDistribucion() {
    }

    public ZonasDistribucion(Integer id) {
        this.id = id;
    }

    public ZonasDistribucion(Integer id, String departamento, String ciudad, String barrio) {
        this.id = id;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.barrio = barrio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @XmlTransient
    public Collection<DespachosMercancia> getDespachosMercanciaCollection() {
        return despachosMercanciaCollection;
    }

    public void setDespachosMercanciaCollection(Collection<DespachosMercancia> despachosMercanciaCollection) {
        this.despachosMercanciaCollection = despachosMercanciaCollection;
    }

    @XmlTransient
    public Collection<DetalleFactura> getDetalleFacturaCollection() {
        return detalleFacturaCollection;
    }

    public void setDetalleFacturaCollection(Collection<DetalleFactura> detalleFacturaCollection) {
        this.detalleFacturaCollection = detalleFacturaCollection;
    }

    @XmlTransient
    public Collection<ReporteVentasDelDia> getReporteVentasDelDiaCollection() {
        return reporteVentasDelDiaCollection;
    }

    public void setReporteVentasDelDiaCollection(Collection<ReporteVentasDelDia> reporteVentasDelDiaCollection) {
        this.reporteVentasDelDiaCollection = reporteVentasDelDiaCollection;
    }

    @XmlTransient
    public Collection<ReporteProductosNoVendido> getReporteProductosNoVendidoCollection() {
        return reporteProductosNoVendidoCollection;
    }

    public void setReporteProductosNoVendidoCollection(Collection<ReporteProductosNoVendido> reporteProductosNoVendidoCollection) {
        this.reporteProductosNoVendidoCollection = reporteProductosNoVendidoCollection;
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
        if (!(object instanceof ZonasDistribucion)) {
            return false;
        }
        ZonasDistribucion other = (ZonasDistribucion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.kairossystem.entidades.ZonasDistribucion[ id=" + id + " ]";
    }
    
}
