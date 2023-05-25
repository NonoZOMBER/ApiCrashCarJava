package com.zcode.apicrashcar.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "seguro", schema = "public")
public class SeguroEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nombre", nullable = true, length = -1)
    private String nombre;
    @Basic
    @Column(name = "email", nullable = true, length = -1)
    private String email;
    @Basic
    @Column(name = "direccion", nullable = true, length = -1)
    private String direccion;
    @Basic
    @Column(name = "pais", nullable = true, length = -1)
    private String pais;
    @Basic
    @Column(name = "telefono", nullable = true, length = -1)
    private String telefono;
    @Basic
    @Column(name = "activo", nullable = true)
    private Boolean activo;
    @Basic
    @Column(name = "id_usuario", nullable = true, length = -1)
    private String idUsuario;
    @Basic
    @Column(name = "ids_vehiculos_seguro", nullable = true, length = -1)
    private String idsVehiculosSeguro;
    @Basic
    @Column(name = "ids_conductores_seguro", nullable = true, length = -1)
    private String idsConductoresSeguro;
    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    @JsonIgnore
    private UsuariosEntity usuariosByIdUsuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdsVehiculosSeguro() {
        return idsVehiculosSeguro;
    }

    public void setIdsVehiculosSeguro(String idsVehiculosSeguro) {
        this.idsVehiculosSeguro = idsVehiculosSeguro;
    }

    public String getIdsConductoresSeguro() {
        return idsConductoresSeguro;
    }

    public void setIdsConductoresSeguro(String idsConductoresSeguro) {
        this.idsConductoresSeguro = idsConductoresSeguro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SeguroEntity that = (SeguroEntity) o;

        if (id != that.id) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;
        if (pais != null ? !pais.equals(that.pais) : that.pais != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (activo != null ? !activo.equals(that.activo) : that.activo != null) return false;
        if (idUsuario != null ? !idUsuario.equals(that.idUsuario) : that.idUsuario != null) return false;
        if (idsVehiculosSeguro != null ? !idsVehiculosSeguro.equals(that.idsVehiculosSeguro) : that.idsVehiculosSeguro != null)
            return false;
        if (idsConductoresSeguro != null ? !idsConductoresSeguro.equals(that.idsConductoresSeguro) : that.idsConductoresSeguro != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (pais != null ? pais.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (activo != null ? activo.hashCode() : 0);
        result = 31 * result + (idUsuario != null ? idUsuario.hashCode() : 0);
        result = 31 * result + (idsVehiculosSeguro != null ? idsVehiculosSeguro.hashCode() : 0);
        result = 31 * result + (idsConductoresSeguro != null ? idsConductoresSeguro.hashCode() : 0);
        return result;
    }

    public UsuariosEntity getUsuariosByIdUsuario() {
        return usuariosByIdUsuario;
    }

    public void setUsuariosByIdUsuario(UsuariosEntity usuariosByIdUsuario) {
        this.usuariosByIdUsuario = usuariosByIdUsuario;
    }
}
