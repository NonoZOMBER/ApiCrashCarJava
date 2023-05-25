package com.zcode.apicrashcar.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vehiculos_parte", schema = "public", catalog = "BD_CrashCar")
public class VehiculosParteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_asegurado", nullable = true)
    private Integer idAsegurado;
    @Basic
    @Column(name = "id_vehiculo", nullable = true)
    private Integer idVehiculo;
    @Basic
    @Column(name = "id_seguro", nullable = true)
    private Integer idSeguro;
    @Basic
    @Column(name = "id_conductor", nullable = true)
    private Integer idConductor;
    @Basic
    @Column(name = "punto_choque", nullable = true, length = -1)
    private String puntoChoque;
    @Basic
    @Column(name = "observaciones", nullable = true, length = -1)
    private String observaciones;
    @Basic
    @Column(name = "circunstancias", nullable = true, length = -1)
    private String circunstancias;
    @Basic
    @Column(name = "firma", nullable = true, length = -1)
    private String firma;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdAsegurado() {
        return idAsegurado;
    }

    public void setIdAsegurado(Integer idAsegurado) {
        this.idAsegurado = idAsegurado;
    }

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Integer getIdSeguro() {
        return idSeguro;
    }

    public void setIdSeguro(Integer idSeguro) {
        this.idSeguro = idSeguro;
    }

    public Integer getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(Integer idConductor) {
        this.idConductor = idConductor;
    }

    public String getPuntoChoque() {
        return puntoChoque;
    }

    public void setPuntoChoque(String puntoChoque) {
        this.puntoChoque = puntoChoque;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getCircunstancias() {
        return circunstancias;
    }

    public void setCircunstancias(String circunstancias) {
        this.circunstancias = circunstancias;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehiculosParteEntity that = (VehiculosParteEntity) o;

        if (id != that.id) return false;
        if (idAsegurado != null ? !idAsegurado.equals(that.idAsegurado) : that.idAsegurado != null) return false;
        if (idVehiculo != null ? !idVehiculo.equals(that.idVehiculo) : that.idVehiculo != null) return false;
        if (idSeguro != null ? !idSeguro.equals(that.idSeguro) : that.idSeguro != null) return false;
        if (idConductor != null ? !idConductor.equals(that.idConductor) : that.idConductor != null) return false;
        if (puntoChoque != null ? !puntoChoque.equals(that.puntoChoque) : that.puntoChoque != null) return false;
        if (observaciones != null ? !observaciones.equals(that.observaciones) : that.observaciones != null)
            return false;
        if (circunstancias != null ? !circunstancias.equals(that.circunstancias) : that.circunstancias != null)
            return false;
        if (firma != null ? !firma.equals(that.firma) : that.firma != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (idAsegurado != null ? idAsegurado.hashCode() : 0);
        result = 31 * result + (idVehiculo != null ? idVehiculo.hashCode() : 0);
        result = 31 * result + (idSeguro != null ? idSeguro.hashCode() : 0);
        result = 31 * result + (idConductor != null ? idConductor.hashCode() : 0);
        result = 31 * result + (puntoChoque != null ? puntoChoque.hashCode() : 0);
        result = 31 * result + (observaciones != null ? observaciones.hashCode() : 0);
        result = 31 * result + (circunstancias != null ? circunstancias.hashCode() : 0);
        result = 31 * result + (firma != null ? firma.hashCode() : 0);
        return result;
    }
}
