package com.zcode.apicrashcar.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vehiculo", schema = "public", catalog = "BD_CrashCar")
public class VehiculoEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "matricula", nullable = true, length = -1)
    private String matricula;
    @Basic
    @Column(name = "marca", nullable = true, length = -1)
    private String marca;
    @Basic
    @Column(name = "modelo", nullable = true, length = -1)
    private String modelo;
    @Basic
    @Column(name = "pais_matricula", nullable = true, length = -1)
    private String paisMatricula;
    @Basic
    @Column(name = "tipo_vehiculo", nullable = true, length = -1)
    private String tipoVehiculo;
    @Basic
    @Column(name = "activo", nullable = true)
    private Boolean activo;
    @Basic
    @Column(name = "id_usuario", nullable = false, length = -1)
    private String idUsuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPaisMatricula() {
        return paisMatricula;
    }

    public void setPaisMatricula(String paisMatricula) {
        this.paisMatricula = paisMatricula;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehiculoEntity that = (VehiculoEntity) o;

        if (id != that.id) return false;
        if (matricula != null ? !matricula.equals(that.matricula) : that.matricula != null) return false;
        if (marca != null ? !marca.equals(that.marca) : that.marca != null) return false;
        if (modelo != null ? !modelo.equals(that.modelo) : that.modelo != null) return false;
        if (paisMatricula != null ? !paisMatricula.equals(that.paisMatricula) : that.paisMatricula != null)
            return false;
        if (tipoVehiculo != null ? !tipoVehiculo.equals(that.tipoVehiculo) : that.tipoVehiculo != null) return false;
        if (activo != null ? !activo.equals(that.activo) : that.activo != null) return false;
        if (idUsuario != null ? !idUsuario.equals(that.idUsuario) : that.idUsuario != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (matricula != null ? matricula.hashCode() : 0);
        result = 31 * result + (marca != null ? marca.hashCode() : 0);
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + (paisMatricula != null ? paisMatricula.hashCode() : 0);
        result = 31 * result + (tipoVehiculo != null ? tipoVehiculo.hashCode() : 0);
        result = 31 * result + (activo != null ? activo.hashCode() : 0);
        result = 31 * result + (idUsuario != null ? idUsuario.hashCode() : 0);
        return result;
    }
}
