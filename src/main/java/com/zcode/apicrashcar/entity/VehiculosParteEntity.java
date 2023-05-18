package com.zcode.apicrashcar.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vehiculos_parte", schema = "public")
public class VehiculosParteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_vehiculo_parte", nullable = false)
    private int idVehiculoParte;
    @Basic
    @Column(name = "circunstancias", nullable = true, length = -1)
    private String circunstancias;
    @Basic
    @Column(name = "punto_choque", nullable = true, length = -1)
    private String puntoChoque;
    @Basic
    @Column(name = "asegurado", nullable = true, length = -1)
    private String asegurado;
    @Basic
    @Column(name = "aseguradora", nullable = true, length = -1)
    private String aseguradora;
    @Basic
    @Column(name = "vehiculo", nullable = true, length = -1)
    private String vehiculo;
    @Basic
    @Column(name = "observaciones", nullable = true, length = -1)
    private String observaciones;

    public int getIdVehiculoParte() {
        return idVehiculoParte;
    }

    public void setIdVehiculoParte(int idVehiculoParte) {
        this.idVehiculoParte = idVehiculoParte;
    }

    public String getCircunstancias() {
        return circunstancias;
    }

    public void setCircunstancias(String circunstancias) {
        this.circunstancias = circunstancias;
    }

    public String getPuntoChoque() {
        return puntoChoque;
    }

    public void setPuntoChoque(String puntoChoque) {
        this.puntoChoque = puntoChoque;
    }

    public String getAsegurado() {
        return asegurado;
    }

    public void setAsegurado(String asegurado) {
        this.asegurado = asegurado;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehiculosParteEntity that = (VehiculosParteEntity) o;

        if (idVehiculoParte != that.idVehiculoParte) return false;
        if (circunstancias != null ? !circunstancias.equals(that.circunstancias) : that.circunstancias != null)
            return false;
        if (puntoChoque != null ? !puntoChoque.equals(that.puntoChoque) : that.puntoChoque != null) return false;
        if (asegurado != null ? !asegurado.equals(that.asegurado) : that.asegurado != null) return false;
        if (aseguradora != null ? !aseguradora.equals(that.aseguradora) : that.aseguradora != null) return false;
        if (vehiculo != null ? !vehiculo.equals(that.vehiculo) : that.vehiculo != null) return false;
        if (observaciones != null ? !observaciones.equals(that.observaciones) : that.observaciones != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idVehiculoParte;
        result = 31 * result + (circunstancias != null ? circunstancias.hashCode() : 0);
        result = 31 * result + (puntoChoque != null ? puntoChoque.hashCode() : 0);
        result = 31 * result + (asegurado != null ? asegurado.hashCode() : 0);
        result = 31 * result + (aseguradora != null ? aseguradora.hashCode() : 0);
        result = 31 * result + (vehiculo != null ? vehiculo.hashCode() : 0);
        result = 31 * result + (observaciones != null ? observaciones.hashCode() : 0);
        return result;
    }
}
