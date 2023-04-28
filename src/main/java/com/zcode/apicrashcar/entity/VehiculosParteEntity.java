package com.zcode.apicrashcar.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vehiculos_parte", schema = "public", catalog = "BD_CrashCar")
public class VehiculosParteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_vehiculo_parte", nullable = false)
    private int idVehiculoParte;
    @Basic
    @Column(name = "id_vehiculo", nullable = false)
    private int idVehiculo;
    @Basic
    @Column(name = "id_seguro", nullable = false)
    private int idSeguro;
    @Basic
    @Column(name = "circunstancias", nullable = false, length = -1)
    private String circunstancias;
    @Basic
    @Column(name = "remolque", nullable = true)
    private Boolean remolque;
    @Basic
    @Column(name = "matricula_remolque", nullable = true, length = -1)
    private String matriculaRemolque;
    @Basic
    @Column(name = "pais_matricula_remolque", nullable = true, length = -1)
    private String paisMatriculaRemolque;
    @Basic
    @Column(name = "punto_choque", nullable = false, length = -1)
    private String puntoChoque;

    public int getIdVehiculoParte() {
        return idVehiculoParte;
    }

    public void setIdVehiculoParte(int idVehiculoParte) {
        this.idVehiculoParte = idVehiculoParte;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getIdSeguro() {
        return idSeguro;
    }

    public void setIdSeguro(int idSeguro) {
        this.idSeguro = idSeguro;
    }

    public String getCircunstancias() {
        return circunstancias;
    }

    public void setCircunstancias(String circunstancias) {
        this.circunstancias = circunstancias;
    }

    public Boolean getRemolque() {
        return remolque;
    }

    public void setRemolque(Boolean remolque) {
        this.remolque = remolque;
    }

    public String getMatriculaRemolque() {
        return matriculaRemolque;
    }

    public void setMatriculaRemolque(String matriculaRemolque) {
        this.matriculaRemolque = matriculaRemolque;
    }

    public String getPaisMatriculaRemolque() {
        return paisMatriculaRemolque;
    }

    public void setPaisMatriculaRemolque(String paisMatriculaRemolque) {
        this.paisMatriculaRemolque = paisMatriculaRemolque;
    }

    public String getPuntoChoque() {
        return puntoChoque;
    }

    public void setPuntoChoque(String puntoChoque) {
        this.puntoChoque = puntoChoque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehiculosParteEntity that = (VehiculosParteEntity) o;

        if (idVehiculoParte != that.idVehiculoParte) return false;
        if (idVehiculo != that.idVehiculo) return false;
        if (idSeguro != that.idSeguro) return false;
        if (circunstancias != null ? !circunstancias.equals(that.circunstancias) : that.circunstancias != null)
            return false;
        if (remolque != null ? !remolque.equals(that.remolque) : that.remolque != null) return false;
        if (matriculaRemolque != null ? !matriculaRemolque.equals(that.matriculaRemolque) : that.matriculaRemolque != null)
            return false;
        if (paisMatriculaRemolque != null ? !paisMatriculaRemolque.equals(that.paisMatriculaRemolque) : that.paisMatriculaRemolque != null)
            return false;
        if (puntoChoque != null ? !puntoChoque.equals(that.puntoChoque) : that.puntoChoque != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idVehiculoParte;
        result = 31 * result + idVehiculo;
        result = 31 * result + idSeguro;
        result = 31 * result + (circunstancias != null ? circunstancias.hashCode() : 0);
        result = 31 * result + (remolque != null ? remolque.hashCode() : 0);
        result = 31 * result + (matriculaRemolque != null ? matriculaRemolque.hashCode() : 0);
        result = 31 * result + (paisMatriculaRemolque != null ? paisMatriculaRemolque.hashCode() : 0);
        result = 31 * result + (puntoChoque != null ? puntoChoque.hashCode() : 0);
        return result;
    }
}
