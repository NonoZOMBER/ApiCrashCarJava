package com.zcode.apicrashcar.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vehiculos_seguro", schema = "public", catalog = "BD_CrashCar")
public class VehiculosSeguroEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_vehiculo", nullable = false)
    private int idVehiculo;
    @Basic
    @Column(name = "numero_poliza", nullable = false, length = -1)
    private String numeroPoliza;
    @Basic
    @Column(name = "numero_carta_verde", nullable = true, length = -1)
    private String numeroCartaVerde;
    @Basic
    @Column(name = "fecha_inicio_cv", nullable = true, length = -1)
    private String fechaInicioCv;
    @Basic
    @Column(name = "fecha_fin_cv", nullable = true, length = -1)
    private String fechaFinCv;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public String getNumeroCartaVerde() {
        return numeroCartaVerde;
    }

    public void setNumeroCartaVerde(String numeroCartaVerde) {
        this.numeroCartaVerde = numeroCartaVerde;
    }

    public String getFechaInicioCv() {
        return fechaInicioCv;
    }

    public void setFechaInicioCv(String fechaInicioCv) {
        this.fechaInicioCv = fechaInicioCv;
    }

    public String getFechaFinCv() {
        return fechaFinCv;
    }

    public void setFechaFinCv(String fechaFinCv) {
        this.fechaFinCv = fechaFinCv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehiculosSeguroEntity that = (VehiculosSeguroEntity) o;

        if (id != that.id) return false;
        if (idVehiculo != that.idVehiculo) return false;
        if (numeroPoliza != null ? !numeroPoliza.equals(that.numeroPoliza) : that.numeroPoliza != null) return false;
        if (numeroCartaVerde != null ? !numeroCartaVerde.equals(that.numeroCartaVerde) : that.numeroCartaVerde != null)
            return false;
        if (fechaInicioCv != null ? !fechaInicioCv.equals(that.fechaInicioCv) : that.fechaInicioCv != null)
            return false;
        if (fechaFinCv != null ? !fechaFinCv.equals(that.fechaFinCv) : that.fechaFinCv != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idVehiculo;
        result = 31 * result + (numeroPoliza != null ? numeroPoliza.hashCode() : 0);
        result = 31 * result + (numeroCartaVerde != null ? numeroCartaVerde.hashCode() : 0);
        result = 31 * result + (fechaInicioCv != null ? fechaInicioCv.hashCode() : 0);
        result = 31 * result + (fechaFinCv != null ? fechaFinCv.hashCode() : 0);
        return result;
    }
}
