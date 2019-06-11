/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrossystem.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "insumos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Insumo.findAll", query = "SELECT i FROM Insumo i")})
public class Insumo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 45)
    @Column(name = "unidad_medida")
    private String unidadMedida;
    @OneToMany(mappedBy = "idInsumos", fetch = FetchType.LAZY)
    private Collection<OrdenesProduccion> ordenesProduccionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idInsumos", fetch = FetchType.LAZY)
    private Collection<OrdenesCompra> ordenesCompraCollection;

    public Insumo() {
    }

    public Insumo(Integer id) {
        this.id = id;
    }

    public Insumo(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Insumo)) {
            return false;
        }
        Insumo other = (Insumo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.kairossystem.entidades.Insumo[ id=" + id + " ]";
    }
    
}
