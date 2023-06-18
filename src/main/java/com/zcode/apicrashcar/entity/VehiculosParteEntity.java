package com.zcode.apicrashcar.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vehiculos_parte", schema = "public")
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
    @Column(name = "numero_permiso_conducir", nullable = true, length = -1)
    private String numeroPermisoConducir;
    @Basic
    @Column(name = "categoria_permiso_conducir", nullable = true, length = -1)
    private String categoriaPermisoConducir;
    @Basic
    @Column(name = "fecha_validez_permiso_conducir", nullable = true, length = -1)
    private String fechaValidezPermisoConducir;

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

    public String getNumeroPermisoConducir() {
        return numeroPermisoConducir;
    }

    public void setNumeroPermisoConducir(String numeroPermisoConducir) {
        this.numeroPermisoConducir = numeroPermisoConducir;
    }

    public String getCategoriaPermisoConducir() {
        return categoriaPermisoConducir;
    }

    public void setCategoriaPermisoConducir(String categoriaPermisoConducir) {
        this.categoriaPermisoConducir = categoriaPermisoConducir;
    }

    public String getFechaValidezPermisoConducir() {
        return fechaValidezPermisoConducir;
    }

    public void setFechaValidezPermisoConducir(String fechaValidezPermisoConducir) {
        this.fechaValidezPermisoConducir = fechaValidezPermisoConducir;
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
        if (remolque != null ? !remolque.equals(that.remolque) : that.remolque != null) return false;
        if (matriculaRemolque != null ? !matriculaRemolque.equals(that.matriculaRemolque) : that.matriculaRemolque != null)
            return false;
        if (paisMatriculaRemolque != null ? !paisMatriculaRemolque.equals(that.paisMatriculaRemolque) : that.paisMatriculaRemolque != null)
            return false;
        if (numeroPermisoConducir != null ? !numeroPermisoConducir.equals(that.numeroPermisoConducir) : that.numeroPermisoConducir != null)
            return false;
        if (categoriaPermisoConducir != null ? !categoriaPermisoConducir.equals(that.categoriaPermisoConducir) : that.categoriaPermisoConducir != null)
            return false;
        if (fechaValidezPermisoConducir != null ? !fechaValidezPermisoConducir.equals(that.fechaValidezPermisoConducir) : that.fechaValidezPermisoConducir != null)
            return false;

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
        result = 31 * result + (remolque != null ? remolque.hashCode() : 0);
        result = 31 * result + (matriculaRemolque != null ? matriculaRemolque.hashCode() : 0);
        result = 31 * result + (paisMatriculaRemolque != null ? paisMatriculaRemolque.hashCode() : 0);
        result = 31 * result + (numeroPermisoConducir != null ? numeroPermisoConducir.hashCode() : 0);
        result = 31 * result + (categoriaPermisoConducir != null ? categoriaPermisoConducir.hashCode() : 0);
        result = 31 * result + (fechaValidezPermisoConducir != null ? fechaValidezPermisoConducir.hashCode() : 0);
        return result;
    }
}
