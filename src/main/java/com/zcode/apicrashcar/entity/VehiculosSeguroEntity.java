package com.zcode.apicrashcar.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vehiculos_seguro", schema = "public")
public class VehiculosSeguroEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_vehiculo_seguro", nullable = false)
    private int idVehiculoSeguro;
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
    @Column(name = "fecha_carta_verde_inicio", nullable = true, length = -1)
    private String fechaCartaVerdeInicio;
    @Basic
    @Column(name = "fecha_carta_verde_fin", nullable = true, length = -1)
    private String fechaCartaVerdeFin;

    public int getIdVehiculoSeguro() {
        return idVehiculoSeguro;
    }

    public void setIdVehiculoSeguro(int idVehiculoSeguro) {
        this.idVehiculoSeguro = idVehiculoSeguro;
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

    public String getFechaCartaVerdeInicio() {
        return fechaCartaVerdeInicio;
    }

    public void setFechaCartaVerdeInicio(String fechaCartaVerdeInicio) {
        this.fechaCartaVerdeInicio = fechaCartaVerdeInicio;
    }

    public String getFechaCartaVerdeFin() {
        return fechaCartaVerdeFin;
    }

    public void setFechaCartaVerdeFin(String fechaCartaVerdeFin) {
        this.fechaCartaVerdeFin = fechaCartaVerdeFin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehiculosSeguroEntity that = (VehiculosSeguroEntity) o;

        if (idVehiculoSeguro != that.idVehiculoSeguro) return false;
        if (idVehiculo != that.idVehiculo) return false;
        if (numeroPoliza != null ? !numeroPoliza.equals(that.numeroPoliza) : that.numeroPoliza != null) return false;
        if (numeroCartaVerde != null ? !numeroCartaVerde.equals(that.numeroCartaVerde) : that.numeroCartaVerde != null)
            return false;
        if (fechaCartaVerdeInicio != null ? !fechaCartaVerdeInicio.equals(that.fechaCartaVerdeInicio) : that.fechaCartaVerdeInicio != null)
            return false;
        if (fechaCartaVerdeFin != null ? !fechaCartaVerdeFin.equals(that.fechaCartaVerdeFin) : that.fechaCartaVerdeFin != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idVehiculoSeguro;
        result = 31 * result + idVehiculo;
        result = 31 * result + (numeroPoliza != null ? numeroPoliza.hashCode() : 0);
        result = 31 * result + (numeroCartaVerde != null ? numeroCartaVerde.hashCode() : 0);
        result = 31 * result + (fechaCartaVerdeInicio != null ? fechaCartaVerdeInicio.hashCode() : 0);
        result = 31 * result + (fechaCartaVerdeFin != null ? fechaCartaVerdeFin.hashCode() : 0);
        return result;
    }
}
