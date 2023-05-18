package com.zcode.apicrashcar.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vehiculo", schema = "public")
public class VehiculoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_vehiculo", nullable = false)
    private int idVehiculo;
    @Basic
    @Column(name = "matricula", nullable = false, length = -1)
    private String matricula;
    @Basic
    @Column(name = "marca", nullable = false, length = -1)
    private String marca;
    @Basic
    @Column(name = "modelo", nullable = false, length = -1)
    private String modelo;
    @Basic
    @Column(name = "numero_bastidor", nullable = true, length = -1)
    private String numeroBastidor;
    @Basic
    @Column(name = "pais_matricula", nullable = false, length = -1)
    private String paisMatricula;
    @Basic
    @Column(name = "tipo_vehiculo", nullable = false, length = -1)
    private String tipoVehiculo;
    @Basic
    @Column(name = "activo", nullable = false)
    private boolean activo;
    @Basic
    @Column(name = "dni_usuario", nullable = false, length = 9)
    private String dniUsuario;

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
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

    public String getNumeroBastidor() {
        return numeroBastidor;
    }

    public void setNumeroBastidor(String numeroBastidor) {
        this.numeroBastidor = numeroBastidor;
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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(String dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehiculoEntity that = (VehiculoEntity) o;

        if (idVehiculo != that.idVehiculo) return false;
        if (activo != that.activo) return false;
        if (matricula != null ? !matricula.equals(that.matricula) : that.matricula != null) return false;
        if (marca != null ? !marca.equals(that.marca) : that.marca != null) return false;
        if (modelo != null ? !modelo.equals(that.modelo) : that.modelo != null) return false;
        if (numeroBastidor != null ? !numeroBastidor.equals(that.numeroBastidor) : that.numeroBastidor != null)
            return false;
        if (paisMatricula != null ? !paisMatricula.equals(that.paisMatricula) : that.paisMatricula != null)
            return false;
        if (tipoVehiculo != null ? !tipoVehiculo.equals(that.tipoVehiculo) : that.tipoVehiculo != null) return false;
        if (dniUsuario != null ? !dniUsuario.equals(that.dniUsuario) : that.dniUsuario != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idVehiculo;
        result = 31 * result + (matricula != null ? matricula.hashCode() : 0);
        result = 31 * result + (marca != null ? marca.hashCode() : 0);
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + (numeroBastidor != null ? numeroBastidor.hashCode() : 0);
        result = 31 * result + (paisMatricula != null ? paisMatricula.hashCode() : 0);
        result = 31 * result + (tipoVehiculo != null ? tipoVehiculo.hashCode() : 0);
        result = 31 * result + (activo ? 1 : 0);
        result = 31 * result + (dniUsuario != null ? dniUsuario.hashCode() : 0);
        return result;
    }
}
