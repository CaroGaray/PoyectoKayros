/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kayrosSystem.entidades;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author monik
 */
@Entity
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Telefono")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Celular")
    private String celular;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Direccion")
    private String direccion;
    @JoinColumn(name = "id_perfiles", referencedColumnName = "Id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Perfiles idPerfiles;
    @JoinColumn(name = "id_tipo_documento", referencedColumnName = "Id")
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoDocumentos idTipoDocumento;
    @OneToMany(mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private Collection<Vehiculos> vehiculosCollection;
    @OneToMany(mappedBy = "idUsuarios", fetch = FetchType.LAZY)
    private Collection<DespachosMercancia> despachosMercanciaCollection;
    @OneToMany(mappedBy = "idUsuarios", fetch = FetchType.LAZY)
    private Collection<DetalleFacturas> detalleFacturasCollection;

    public Usuarios() {
    }

    public Usuarios(Integer id) {
        this.id = id;
    }

    public Usuarios(Integer id, String nombre, String telefono, String celular, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Perfiles getIdPerfiles() {
        return idPerfiles;
    }

    public void setIdPerfiles(Perfiles idPerfiles) {
        this.idPerfiles = idPerfiles;
    }

    public TipoDocumentos getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(TipoDocumentos idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    @XmlTransient
    public Collection<Vehiculos> getVehiculosCollection() {
        return vehiculosCollection;
    }

    public void setVehiculosCollection(Collection<Vehiculos> vehiculosCollection) {
        this.vehiculosCollection = vehiculosCollection;
    }

    @XmlTransient
    public Collection<DespachosMercancia> getDespachosMercanciaCollection() {
        return despachosMercanciaCollection;
    }

    public void setDespachosMercanciaCollection(Collection<DespachosMercancia> despachosMercanciaCollection) {
        this.despachosMercanciaCollection = despachosMercanciaCollection;
    }

    @XmlTransient
    public Collection<DetalleFacturas> getDetalleFacturasCollection() {
        return detalleFacturasCollection;
    }

    public void setDetalleFacturasCollection(Collection<DetalleFacturas> detalleFacturasCollection) {
        this.detalleFacturasCollection = detalleFacturasCollection;
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
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.kayrosSystem.entidades.Usuarios[ id=" + id + " ]";
    }
    
}
