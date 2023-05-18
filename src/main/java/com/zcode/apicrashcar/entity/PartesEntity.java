package com.zcode.apicrashcar.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "partes", schema = "public")
public class PartesEntity {
    @Basic
    @Column(name = "dni_usuario", nullable = false, length = 9)
    private String dniUsuario;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_parte", nullable = false)
    private int idParte;
    @Basic
    @Column(name = "ids_vehiculos_parte", nullable = false, length = -1)
    private String idsVehiculosParte;
    @Basic
    @Column(name = "descripcion", nullable = false, length = -1)
    private String descripcion;
    @Basic
    @Column(name = "fecha_accidente", nullable = false, length = -1)
    private String fechaAccidente;
    @Basic
    @Column(name = "direccion", nullable = false, length = -1)
    private String direccion;
    @Basic
    @Column(name = "victimas", nullable = true)
    private Boolean victimas;
    @Basic
    @Column(name = "damage_material", nullable = true)
    private Boolean damageMaterial;
    @Basic
    @Column(name = "intervencion_autoridades", nullable = false)
    private boolean intervencionAutoridades;
    @Basic
    @Column(name = "numero_placa_autoridad", nullable = true, length = -1)
    private String numeroPlacaAutoridad;
    @Basic
    @Column(name = "imagenes", nullable = true, length = -1)
    private String imagenes;
    @Basic
    @Column(name = "testigo", nullable = true, length = -1)
    private String testigo;
    @Basic
    @Column(name = "activo", nullable = false)
    private boolean activo;

    public String getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(String dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    public int getIdParte() {
        return idParte;
    }

    public void setIdParte(int idParte) {
        this.idParte = idParte;
    }

    public String getIdsVehiculosParte() {
        return idsVehiculosParte;
    }

    public void setIdsVehiculosParte(String idsVehiculosParte) {
        this.idsVehiculosParte = idsVehiculosParte;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaAccidente() {
        return fechaAccidente;
    }

    public void setFechaAccidente(String fechaAccidente) {
        this.fechaAccidente = fechaAccidente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getVictimas() {
        return victimas;
    }

    public void setVictimas(Boolean victimas) {
        this.victimas = victimas;
    }

    public Boolean getDamageMaterial() {
        return damageMaterial;
    }

    public void setDamageMaterial(Boolean damageMaterial) {
        this.damageMaterial = damageMaterial;
    }

    public boolean isIntervencionAutoridades() {
        return intervencionAutoridades;
    }

    public void setIntervencionAutoridades(boolean intervencionAutoridades) {
        this.intervencionAutoridades = intervencionAutoridades;
    }

    public String getNumeroPlacaAutoridad() {
        return numeroPlacaAutoridad;
    }

    public void setNumeroPlacaAutoridad(String numeroPlacaAutoridad) {
        this.numeroPlacaAutoridad = numeroPlacaAutoridad;
    }

    public String getImagenes() {
        return imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }

    public String getTestigo() {
        return testigo;
    }

    public void setTestigo(String testigo) {
        this.testigo = testigo;
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

        PartesEntity that = (PartesEntity) o;

        if (idParte != that.idParte) return false;
        if (intervencionAutoridades != that.intervencionAutoridades) return false;
        if (activo != that.activo) return false;
        if (dniUsuario != null ? !dniUsuario.equals(that.dniUsuario) : that.dniUsuario != null) return false;
        if (idsVehiculosParte != null ? !idsVehiculosParte.equals(that.idsVehiculosParte) : that.idsVehiculosParte != null)
            return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (fechaAccidente != null ? !fechaAccidente.equals(that.fechaAccidente) : that.fechaAccidente != null)
            return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;
        if (victimas != null ? !victimas.equals(that.victimas) : that.victimas != null) return false;
        if (damageMaterial != null ? !damageMaterial.equals(that.damageMaterial) : that.damageMaterial != null)
            return false;
        if (numeroPlacaAutoridad != null ? !numeroPlacaAutoridad.equals(that.numeroPlacaAutoridad) : that.numeroPlacaAutoridad != null)
            return false;
        if (imagenes != null ? !imagenes.equals(that.imagenes) : that.imagenes != null) return false;
        if (testigo != null ? !testigo.equals(that.testigo) : that.testigo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dniUsuario != null ? dniUsuario.hashCode() : 0;
        result = 31 * result + idParte;
        result = 31 * result + (idsVehiculosParte != null ? idsVehiculosParte.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (fechaAccidente != null ? fechaAccidente.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (victimas != null ? victimas.hashCode() : 0);
        result = 31 * result + (damageMaterial != null ? damageMaterial.hashCode() : 0);
        result = 31 * result + (intervencionAutoridades ? 1 : 0);
        result = 31 * result + (numeroPlacaAutoridad != null ? numeroPlacaAutoridad.hashCode() : 0);
        result = 31 * result + (imagenes != null ? imagenes.hashCode() : 0);
        result = 31 * result + (testigo != null ? testigo.hashCode() : 0);
        result = 31 * result + (activo ? 1 : 0);
        return result;
    }
}
