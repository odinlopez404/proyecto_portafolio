package com.apodin.Odin.AP.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills implements Serializable{

     @Id
     @GeneratedValue (strategy = GenerationType.AUTO)
     
     private Long idSkill;
     private String nombreSkill;
     private int porcentajeSkill;

    public Skills() {
    }

    public Skills(Long idSkill, String nombreSkill, int porcentajeSkill) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.porcentajeSkill = porcentajeSkill;
    }

    public long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public int getPorcentajeSkill() {
        return porcentajeSkill;
    }

    public void setPorcentajeSkill(int porcentajeSkill) {
        this.porcentajeSkill = porcentajeSkill;
    }
     
     
    
    

    
    
    
    
}
