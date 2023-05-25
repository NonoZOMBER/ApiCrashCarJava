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
    @Column(name = "descripcion", nullable = true, length = -1)
    private String descripcion;
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
    @Column(name = "intervencion_autoridades", nullable = true)
    private Boolean intervencionAutoridades;
    @Basic
    @Column(name = "num_placa_agente", nullable = true, length = -1)
    private String numPlacaAgente;
    @Basic
    @Column(name = "imagenes", nullable = true, length = -1)
    private String imagenes;
    @Basic
    @Column(name = "activo", nullable = true)
    private Boolean activo;
    @Basic
    @Column(name = "ids_vehiculos_parte", nullable = true, length = -1)
    private String idsVehiculosParte;
    @Basic
    @Column(name = "ids_testigos", nullable = true, length = -1)
    private String idsTestigos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdsTestigos() {
        return idsTestigos;
    }

    public void setIdsTestigos(String idsTestigos) {
        this.idsTestigos = idsTestigos;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
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

    public Boolean getIntervencionAutoridades() {
        return intervencionAutoridades;
    }

    public void setIntervencionAutoridades(Boolean intervencionAutoridades) {
        this.intervencionAutoridades = intervencionAutoridades;
    }

    public String getNumPlacaAgente() {
        return numPlacaAgente;
    }

    public void setNumPlacaAgente(String numPlacaAgente) {
        this.numPlacaAgente = numPlacaAgente;
    }

    public String getImagenes() {
        return imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getIdsVehiculosParte() {
        return idsVehiculosParte;
    }

    public void setIdsVehiculosParte(String idsVehiculosParte) {
        this.idsVehiculosParte = idsVehiculosParte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PartesEntity that = (PartesEntity) o;

        if (id != that.id) return false;
        if (idUsuario != null ? !idUsuario.equals(that.idUsuario) : that.idUsuario != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (fechaAccidente != null ? !fechaAccidente.equals(that.fechaAccidente) : that.fechaAccidente != null)
            return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;
        if (victimas != null ? !victimas.equals(that.victimas) : that.victimas != null) return false;
        if (damageMaterial != null ? !damageMaterial.equals(that.damageMaterial) : that.damageMaterial != null)
            return false;
        if (intervencionAutoridades != null ? !intervencionAutoridades.equals(that.intervencionAutoridades) : that.intervencionAutoridades != null)
            return false;
        if (numPlacaAgente != null ? !numPlacaAgente.equals(that.numPlacaAgente) : that.numPlacaAgente != null)
            return false;
        if (imagenes != null ? !imagenes.equals(that.imagenes) : that.imagenes != null) return false;
        if (activo != null ? !activo.equals(that.activo) : that.activo != null) return false;
        if (idsVehiculosParte != null ? !idsVehiculosParte.equals(that.idsVehiculosParte) : that.idsVehiculosParte != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (idUsuario != null ? idUsuario.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (fechaAccidente != null ? fechaAccidente.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (victimas != null ? victimas.hashCode() : 0);
        result = 31 * result + (damageMaterial != null ? damageMaterial.hashCode() : 0);
        result = 31 * result + (intervencionAutoridades != null ? intervencionAutoridades.hashCode() : 0);
        result = 31 * result + (numPlacaAgente != null ? numPlacaAgente.hashCode() : 0);
        result = 31 * result + (imagenes != null ? imagenes.hashCode() : 0);
        result = 31 * result + (activo != null ? activo.hashCode() : 0);
        result = 31 * result + (idsVehiculosParte != null ? idsVehiculosParte.hashCode() : 0);
        return result;
    }
}
