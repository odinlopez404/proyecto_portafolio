package com.apodin.Odin.AP.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExperiencia;
    private String empresaExperiencia;
    private String cargoExperiencia;
    private String direccionExperiencia;
    private String fechaDesdeExperiencia;
    private String fechaHastaExperiencia;
    private String descripcionExperiencia;
    private String imagenExperiencia;
    

    public Experiencia() {
    }

    public Experiencia(Long idExperiencia, String empresaExperiencia, String cargoExperiencia, String direccionExperiencia, String fechaDesdeExperiencia, String fechaHastaExperiencia, String descripcionExperiencia, String imagenExperiencia) {
        this.idExperiencia = idExperiencia;
        this.empresaExperiencia = empresaExperiencia;
        this.cargoExperiencia = cargoExperiencia;
        this.direccionExperiencia = direccionExperiencia;
        this.fechaDesdeExperiencia = fechaDesdeExperiencia;
        this.fechaHastaExperiencia = fechaHastaExperiencia;
        this.descripcionExperiencia = descripcionExperiencia;
        this.imagenExperiencia = imagenExperiencia;
    }

    public long getIdExperiencia() {
        return idExperiencia;
    }

    public void setIdExperiencia(Long idExperiencia) {
        this.idExperiencia = idExperiencia;
    }

    public String getEmpresaExperiencia() {
        return empresaExperiencia;
    }

    public void setEmpresaExperiencia(String empresaExperiencia) {
        this.empresaExperiencia = empresaExperiencia;
    }

    public String getCargoExperiencia() {
        return cargoExperiencia;
    }

    public void setCargoExperiencia(String cargoExperiencia) {
        this.cargoExperiencia = cargoExperiencia;
    }

    public String getDireccionExperiencia() {
        return direccionExperiencia;
    }

    public void setDireccionExperiencia(String direccionExperiencia) {
        this.direccionExperiencia = direccionExperiencia;
    }

    public String getFechaDesdeExperiencia() {
        return fechaDesdeExperiencia;
    }

    public void setFechaDesdeExperiencia(String fechaDesdeExperiencia) {
        this.fechaDesdeExperiencia = fechaDesdeExperiencia;
    }

    public String getFechaHastaExperiencia() {
        return fechaHastaExperiencia;
    }

    public void setFechaHastaExperiencia(String fechaHastaExperiencia) {
        this.fechaHastaExperiencia = fechaHastaExperiencia;
    }

    public String getDescripcionExperiencia() {
        return descripcionExperiencia;
    }

    public void setDescripcionExperiencia(String descripcionExperiencia) {
        this.descripcionExperiencia = descripcionExperiencia;
    }

    public String getImagenExperiencia() {
        return imagenExperiencia;
    }

    public void setImagenExperiencia(String imagenExperiencia) {
        this.imagenExperiencia = imagenExperiencia;
    }

    
    
 



}
