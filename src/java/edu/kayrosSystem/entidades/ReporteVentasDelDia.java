/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrosSystem.entidades;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author monik
 */
@Entity
@Table(name = "reporte_ventas_del_dia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReporteVentasDelDia.findAll", query = "SELECT r FROM ReporteVentasDelDia r")})
public class ReporteVentasDelDia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Codigo_producto")
    private String codigoproducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Cantidad_vendida")
    private String cantidadvendida;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Precio")
    private String precio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Valor_venta")
    private String valorventa;
    @JoinColumn(name = "id_zona_distribucion", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ZonasDistribucion idZonaDistribucion;

    public ReporteVentasDelDia() {
    }

    public ReporteVentasDelDia(Integer id) {
        this.id = id;
    }

    public ReporteVentasDelDia(Integer id, String codigoproducto, String cantidadvendida, String precio, String valorventa) {
        this.id = id;
        this.codigoproducto = codigoproducto;
        this.cantidadvendida = cantidadvendida;
        this.precio = precio;
        this.valorventa = valorventa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoproducto() {
        return codigoproducto;
    }

    public void setCodigoproducto(String codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public String getCantidadvendida() {
        return cantidadvendida;
    }

    public void setCantidadvendida(String cantidadvendida) {
        this.cantidadvendida = cantidadvendida;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getValorventa() {
        return valorventa;
    }

    public void setValorventa(String valorventa) {
        this.valorventa = valorventa;
    }

    public ZonasDistribucion getIdZonaDistribucion() {
        return idZonaDistribucion;
    }

    public void setIdZonaDistribucion(ZonasDistribucion idZonaDistribucion) {
        this.idZonaDistribucion = idZonaDistribucion;
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
        if (!(object instanceof ReporteVentasDelDia)) {
            return false;
        }
        ReporteVentasDelDia other = (ReporteVentasDelDia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.kayrosSystem.entidades.ReporteVentasDelDia[ id=" + id + " ]";
    }
    
}
