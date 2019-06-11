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
@Table(name = "vehiculos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehiculo.findAll", query = "SELECT v FROM Vehiculo v")})
public class Vehiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Placa_Vehiculo")
    private String placaVehiculo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Modelo")
    private String modelo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Marca_vehiculo")
    private String marcavehiculo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Revision_Tecnomecanica")
    @Temporal(TemporalType.DATE)
    private Date revisionTecnomecanica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Soat")
    private String soat;
    @JoinColumn(name = "id_usuario", referencedColumnName = "Id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario idUsuario;

    public Vehiculo() {
    }

    public Vehiculo(Integer id) {
        this.id = id;
    }

    public Vehiculo(Integer id, String placaVehiculo, String modelo, String marcavehiculo, Date revisionTecnomecanica, String soat) {
        this.id = id;
        this.placaVehiculo = placaVehiculo;
        this.modelo = modelo;
        this.marcavehiculo = marcavehiculo;
        this.revisionTecnomecanica = revisionTecnomecanica;
        this.soat = soat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarcavehiculo() {
        return marcavehiculo;
    }

    public void setMarcavehiculo(String marcavehiculo) {
        this.marcavehiculo = marcavehiculo;
    }

    public Date getRevisionTecnomecanica() {
        return revisionTecnomecanica;
    }

    public void setRevisionTecnomecanica(Date revisionTecnomecanica) {
        this.revisionTecnomecanica = revisionTecnomecanica;
    }

    public String getSoat() {
        return soat;
    }

    public void setSoat(String soat) {
        this.soat = soat;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
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
        if (!(object instanceof Vehiculo)) {
            return false;
        }
        Vehiculo other = (Vehiculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.kairossystem.entidades.Vehiculo[ id=" + id + " ]";
    }
    
}
