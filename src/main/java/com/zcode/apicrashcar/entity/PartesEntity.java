package com.zcode.apicrashcar.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "partes", schema = "public")
public class PartesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_usuario", nullable = false, length = -1)
    private String idUsuario;
    @Basic
    @Column(name = "ids_vehiculos_parte", nullable = true, length = -1)
    private String idsVehiculosParte;
    @Basic
    @Column(name = "fecha_accidente", nullable = true, length = -1)
    private String fechaAccidente;
    @Basic
    @Column(name = "direccion", nullable = true, length = -1)
    private String direccion;
    @Basic
    @Column(name = "victimas", nullable = true)
    private Boolean victimas;
    @Basic
    @Column(name = "damage_material", nullable = true)
    private Boolean damageMaterial;
    @Basic
    @Column(name = "imagenes", nullable = true, length = -1)
    private String imagenes;
    @Basic
    @Column(name = "ids_testigos", nullable = true, length = -1)
    private String idsTestigos;
    @Basic
    @Column(name = "activo", nullable = true)
    private Boolean activo;
    @Basic
    @Column(name = "hora_accidente", nullable = true, length = -1)
    private String horaAccidente;
    @Basic
    @Column(name = "pais_accidente", nullable = true, length = -1)
    private String paisAccidente;
    @Basic
    @Column(name = "other_vehicles", nullable = true)
    private Boolean otherVehicles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdsVehiculosParte() {
        return idsVehiculosParte;
    }

    public void setIdsVehiculosParte(String idsVehiculosParte) {
        this.idsVehiculosParte = idsVehiculosParte;
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

    public String getImagenes() {
        return imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }

    public String getIdsTestigos() {
        return idsTestigos;
    }

    public void setIdsTestigos(String idsTestigos) {
        this.idsTestigos = idsTestigos;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getHoraAccidente() {
        return horaAccidente;
    }

    public void setHoraAccidente(String horaAccidente) {
        this.horaAccidente = horaAccidente;
    }

    public String getPaisAccidente() {
        return paisAccidente;
    }

    public void setPaisAccidente(String paisAccidente) {
        this.paisAccidente = paisAccidente;
    }

    public Boolean getOtherVehicles() {
        return otherVehicles;
    }

    public void setOtherVehicles(Boolean otherVehicles) {
        this.otherVehicles = otherVehicles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PartesEntity that = (PartesEntity) o;

        if (id != that.id) return false;
        if (idUsuario != null ? !idUsuario.equals(that.idUsuario) : that.idUsuario != null) return false;
        if (idsVehiculosParte != null ? !idsVehiculosParte.equals(that.idsVehiculosParte) : that.idsVehiculosParte != null)
            return false;
        if (fechaAccidente != null ? !fechaAccidente.equals(that.fechaAccidente) : that.fechaAccidente != null)
            return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;
        if (victimas != null ? !victimas.equals(that.victimas) : that.victimas != null) return false;
        if (damageMaterial != null ? !damageMaterial.equals(that.damageMaterial) : that.damageMaterial != null)
            return false;
        if (imagenes != null ? !imagenes.equals(that.imagenes) : that.imagenes != null) return false;
        if (idsTestigos != null ? !idsTestigos.equals(that.idsTestigos) : that.idsTestigos != null) return false;
        if (activo != null ? !activo.equals(that.activo) : that.activo != null) return false;
        if (horaAccidente != null ? !horaAccidente.equals(that.horaAccidente) : that.horaAccidente != null)
            return false;
        if (paisAccidente != null ? !paisAccidente.equals(that.paisAccidente) : that.paisAccidente != null)
            return false;
        if (otherVehicles != null ? !otherVehicles.equals(that.otherVehicles) : that.otherVehicles != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (idUsuario != null ? idUsuario.hashCode() : 0);
        result = 31 * result + (idsVehiculosParte != null ? idsVehiculosParte.hashCode() : 0);
        result = 31 * result + (fechaAccidente != null ? fechaAccidente.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (victimas != null ? victimas.hashCode() : 0);
        result = 31 * result + (damageMaterial != null ? damageMaterial.hashCode() : 0);
        result = 31 * result + (imagenes != null ? imagenes.hashCode() : 0);
        result = 31 * result + (idsTestigos != null ? idsTestigos.hashCode() : 0);
        result = 31 * result + (activo != null ? activo.hashCode() : 0);
        result = 31 * result + (horaAccidente != null ? horaAccidente.hashCode() : 0);
        result = 31 * result + (paisAccidente != null ? paisAccidente.hashCode() : 0);
        result = 31 * result + (otherVehicles != null ? otherVehicles.hashCode() : 0);
        return result;
    }
}
