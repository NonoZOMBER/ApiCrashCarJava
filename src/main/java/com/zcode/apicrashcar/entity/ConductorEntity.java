package com.zcode.apicrashcar.entity;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "conductor", schema = "public", catalog = "BD_CrashCar")
public class ConductorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_conductor", nullable = false)
    private int idConductor;
    @Basic
    @Column(name = "dni_conductor", nullable = false, length = -1)
    private String dniConductor;
    @Basic
    @Column(name = "nombre", nullable = false, length = -1)
    private String nombre;
    @Basic
    @Column(name = "apellidos", nullable = false, length = -1)
    private String apellidos;
    @Basic
    @Column(name = "direccion", nullable = false, length = -1)
    private String direccion;
    @Basic
    @Column(name = "localidad", nullable = false, length = -1)
    private String localidad;
    @Basic
    @Column(name = "codpostal", nullable = false, precision = 0)
    private BigInteger codpostal;
    @Basic
    @Column(name = "pais", nullable = false, length = -1)
    private String pais;
    @Basic
    @Column(name = "phone", nullable = false)
    private int phone;
    @Basic
    @Column(name = "email", nullable = false, length = -1)
    private String email;

    public int getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }

    public String getDniConductor() {
        return dniConductor;
    }

    public void setDniConductor(String dniConductor) {
        this.dniConductor = dniConductor;
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

    public BigInteger getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(BigInteger codpostal) {
        this.codpostal = codpostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConductorEntity that = (ConductorEntity) o;

        if (idConductor != that.idConductor) return false;
        if (phone != that.phone) return false;
        if (dniConductor != null ? !dniConductor.equals(that.dniConductor) : that.dniConductor != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (apellidos != null ? !apellidos.equals(that.apellidos) : that.apellidos != null) return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;
        if (localidad != null ? !localidad.equals(that.localidad) : that.localidad != null) return false;
        if (codpostal != null ? !codpostal.equals(that.codpostal) : that.codpostal != null) return false;
        if (pais != null ? !pais.equals(that.pais) : that.pais != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idConductor;
        result = 31 * result + (dniConductor != null ? dniConductor.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (localidad != null ? localidad.hashCode() : 0);
        result = 31 * result + (codpostal != null ? codpostal.hashCode() : 0);
        result = 31 * result + (pais != null ? pais.hashCode() : 0);
        result = 31 * result + phone;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
