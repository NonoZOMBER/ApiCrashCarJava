package com.zcode.apicrashcar.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "seguro", schema = "public", catalog = "BD_CrashCar")
public class SeguroEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_seguro", nullable = false)
    private int idSeguro;
    @Basic
    @Column(name = "dni_usuario", nullable = false, length = 9)
    private String dniUsuario;
    @Basic
    @Column(name = "nombre_agencia", nullable = false, length = -1)
    private String nombreAgencia;
    @Basic
    @Column(name = "nombre_aseguradora", nullable = false, length = -1)
    private String nombreAseguradora;
    @Basic
    @Column(name = "ids_vehiculos_seguro", nullable = true, length = -1)
    private String idsVehiculosSeguro;
    @Basic
    @Column(name = "ids_conductores_seguro", nullable = true, length = -1)
    private String idsConductoresSeguro;
    @Basic
    @Column(name = "direccion_agencia", nullable = true, length = -1)
    private String direccionAgencia;
    @Basic
    @Column(name = "email_agencia", nullable = false, length = -1)
    private String emailAgencia;
    @Basic
    @Column(name = "pais_agencia", nullable = true, length = -1)
    private String paisAgencia;
    @Basic
    @Column(name = "phone_agencia", nullable = false, length = -1)
    private String phoneAgencia;
    @Basic
    @Column(name = "activo", nullable = false)
    private boolean activo;

    public int getIdSeguro() {
        return idSeguro;
    }

    public void setIdSeguro(int idSeguro) {
        this.idSeguro = idSeguro;
    }

    public String getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(String dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    public String getNombreAgencia() {
        return nombreAgencia;
    }

    public void setNombreAgencia(String nombreAgencia) {
        this.nombreAgencia = nombreAgencia;
    }

    public String getNombreAseguradora() {
        return nombreAseguradora;
    }

    public void setNombreAseguradora(String nombreAseguradora) {
        this.nombreAseguradora = nombreAseguradora;
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

    public String getDireccionAgencia() {
        return direccionAgencia;
    }

    public void setDireccionAgencia(String direccionAgencia) {
        this.direccionAgencia = direccionAgencia;
    }

    public String getEmailAgencia() {
        return emailAgencia;
    }

    public void setEmailAgencia(String emailAgencia) {
        this.emailAgencia = emailAgencia;
    }

    public String getPaisAgencia() {
        return paisAgencia;
    }

    public void setPaisAgencia(String paisAgencia) {
        this.paisAgencia = paisAgencia;
    }

    public String getPhoneAgencia() {
        return phoneAgencia;
    }

    public void setPhoneAgencia(String phoneAgencia) {
        this.phoneAgencia = phoneAgencia;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SeguroEntity that = (SeguroEntity) o;

        if (idSeguro != that.idSeguro) return false;
        if (activo != that.activo) return false;
        if (dniUsuario != null ? !dniUsuario.equals(that.dniUsuario) : that.dniUsuario != null) return false;
        if (nombreAgencia != null ? !nombreAgencia.equals(that.nombreAgencia) : that.nombreAgencia != null)
            return false;
        if (nombreAseguradora != null ? !nombreAseguradora.equals(that.nombreAseguradora) : that.nombreAseguradora != null)
            return false;
        if (idsVehiculosSeguro != null ? !idsVehiculosSeguro.equals(that.idsVehiculosSeguro) : that.idsVehiculosSeguro != null)
            return false;
        if (idsConductoresSeguro != null ? !idsConductoresSeguro.equals(that.idsConductoresSeguro) : that.idsConductoresSeguro != null)
            return false;
        if (direccionAgencia != null ? !direccionAgencia.equals(that.direccionAgencia) : that.direccionAgencia != null)
            return false;
        if (emailAgencia != null ? !emailAgencia.equals(that.emailAgencia) : that.emailAgencia != null) return false;
        if (paisAgencia != null ? !paisAgencia.equals(that.paisAgencia) : that.paisAgencia != null) return false;
        if (phoneAgencia != null ? !phoneAgencia.equals(that.phoneAgencia) : that.phoneAgencia != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSeguro;
        result = 31 * result + (dniUsuario != null ? dniUsuario.hashCode() : 0);
        result = 31 * result + (nombreAgencia != null ? nombreAgencia.hashCode() : 0);
        result = 31 * result + (nombreAseguradora != null ? nombreAseguradora.hashCode() : 0);
        result = 31 * result + (idsVehiculosSeguro != null ? idsVehiculosSeguro.hashCode() : 0);
        result = 31 * result + (idsConductoresSeguro != null ? idsConductoresSeguro.hashCode() : 0);
        result = 31 * result + (direccionAgencia != null ? direccionAgencia.hashCode() : 0);
        result = 31 * result + (emailAgencia != null ? emailAgencia.hashCode() : 0);
        result = 31 * result + (paisAgencia != null ? paisAgencia.hashCode() : 0);
        result = 31 * result + (phoneAgencia != null ? phoneAgencia.hashCode() : 0);
        result = 31 * result + (activo ? 1 : 0);
        return result;
    }
}
