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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author monik
 */
@Entity
@Table(name = "reporte_productos_no_vendidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReporteProductosNoVendido.findAll", query = "SELECT r FROM ReporteProductosNoVendido r")})
public class ReporteProductosNoVendido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Cantidad_regresada")
    private String cantidadregresada;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Consepto")
    private String consepto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Codigo_producto")
    private String codigoproducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Reporte_N\u00b0")
    private String reporteN;
    @JoinColumn(name = "id_zona_distribucio", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ZonasDistribucion idZonaDistribucio;

    public ReporteProductosNoVendido() {
    }

    public ReporteProductosNoVendido(Integer id) {
        this.id = id;
    }

    public ReporteProductosNoVendido(Integer id, String cantidadregresada, String consepto, String codigoproducto, String reporteN) {
        this.id = id;
        this.cantidadregresada = cantidadregresada;
        this.consepto = consepto;
        this.codigoproducto = codigoproducto;
        this.reporteN = reporteN;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCantidadregresada() {
        return cantidadregresada;
    }

    public void setCantidadregresada(String cantidadregresada) {
        this.cantidadregresada = cantidadregresada;
    }

    public String getConsepto() {
        return consepto;
    }

    public void setConsepto(String consepto) {
        this.consepto = consepto;
    }

    public String getCodigoproducto() {
        return codigoproducto;
    }

    public void setCodigoproducto(String codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public String getReporteN() {
        return reporteN;
    }

    public void setReporteN(String reporteN) {
        this.reporteN = reporteN;
    }

    public ZonasDistribucion getIdZonaDistribucio() {
        return idZonaDistribucio;
    }

    public void setIdZonaDistribucio(ZonasDistribucion idZonaDistribucio) {
        this.idZonaDistribucio = idZonaDistribucio;
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
        if (!(object instanceof ReporteProductosNoVendido)) {
            return false;
        }
        ReporteProductosNoVendido other = (ReporteProductosNoVendido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.kairossystem.entidades.ReporteProductosNoVendido[ id=" + id + " ]";
    }
    
}
