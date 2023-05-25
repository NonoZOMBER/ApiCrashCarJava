package com.zcode.apicrashcar.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "usuarios", schema = "public", catalog = "BD_CrashCar")
public class UsuariosEntity {

    @Id
    @Column(name = "id", nullable = false, length = -1)
    private String id;
    @Basic
    @Column(name = "nombre", nullable = true, length = -1)
    private String nombre;
    @Basic
    @Column(name = "apellidos", nullable = true, length = -1)
    private String apellidos;
    @Basic
    @Column(name = "password", nullable = true, length = -1)
    private String password;
    @Basic
    @Column(name = "email", nullable = false, length = -1)
    private String email;
    @Basic
    @Column(name = "direccion", nullable = true, length = -1)
    private String direccion;
    @Basic
    @Column(name = "localidad", nullable = true, length = -1)
    private String localidad;
    @Basic
    @Column(name = "provincia", nullable = true, length = -1)
    private String provincia;
    @Basic
    @Column(name = "codpostal", nullable = true, length = -1)
    private String codpostal;
    @Basic
    @Column(name = "pais", nullable = true, length = -1)
    private String pais;
    @Basic
    @Column(name = "telefono", nullable = true, length = -1)
    private String telefono;
    @Basic
    @Column(name = "tipologin", nullable = false)
    private int tipologin;
    @OneToMany(mappedBy = "usuariosByIdUsuario")
    @JsonIgnore
    private Collection<SeguroEntity> segurosById;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
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

    public int getTipologin() {
        return tipologin;
    }

    public void setTipologin(int tipologin) {
        this.tipologin = tipologin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsuariosEntity that = (UsuariosEntity) o;

        if (tipologin != that.tipologin) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (apellidos != null ? !apellidos.equals(that.apellidos) : that.apellidos != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;
        if (localidad != null ? !localidad.equals(that.localidad) : that.localidad != null) return false;
        if (provincia != null ? !provincia.equals(that.provincia) : that.provincia != null) return false;
        if (codpostal != null ? !codpostal.equals(that.codpostal) : that.codpostal != null) return false;
        if (pais != null ? !pais.equals(that.pais) : that.pais != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (localidad != null ? localidad.hashCode() : 0);
        result = 31 * result + (provincia != null ? provincia.hashCode() : 0);
        result = 31 * result + (codpostal != null ? codpostal.hashCode() : 0);
        result = 31 * result + (pais != null ? pais.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + tipologin;
        return result;
    }

    public Collection<SeguroEntity> getSegurosById() {
        return segurosById;
    }

    public void setSegurosById(Collection<SeguroEntity> segurosById) {
        this.segurosById = segurosById;
    }
}
