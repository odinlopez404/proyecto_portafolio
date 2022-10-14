package com.apodin.Odin.AP.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEducacion;
    private String tituloEducacion;
    private String fechaEducacionDesde;
    private String fechaEducacionHasta;
    private String descripcionEducacion;

    public Educacion() {
    }

    public Educacion(Long idEducacion, String tituloEducacion, String fechaEducacionDesde, String fechaEducacionHasta, String descripcionEducacion) {
        this.idEducacion = idEducacion;
        this.tituloEducacion = tituloEducacion;
        this.fechaEducacionDesde = fechaEducacionDesde;
        this.fechaEducacionHasta = fechaEducacionHasta;
        this.descripcionEducacion = descripcionEducacion;
    }

    public long getIdEducacion() {
        return idEducacion;
    }

    public void setIdEducacion(Long idEducacion) {
        this.idEducacion = idEducacion;
    }

    public String getTituloEducacion() {
        return tituloEducacion;
    }

    public void setTituloEducacion(String tituloEducacion) {
        this.tituloEducacion = tituloEducacion;
    }

    public String getFechaEducacionDesde() {
        return fechaEducacionDesde;
    }

    public void setFechaEducacionDesde(String fechaEducacionDesde) {
        this.fechaEducacionDesde = fechaEducacionDesde;
    }

    public String getFechaEducacionHasta() {
        return fechaEducacionHasta;
    }

    public void setFechaEducacionHasta(String fechaEducacionHasta) {
        this.fechaEducacionHasta = fechaEducacionHasta;
    }

    public String getDescripcionEducacion() {
        return descripcionEducacion;
    }

    public void setDescripcionEducacion(String descripcionEducacion) {
        this.descripcionEducacion = descripcionEducacion;
    }

}
