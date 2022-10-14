package com.apodin.Odin.AP.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable=false,updatable=false)
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String descripcion;
    private String imagenUsuario;
    private String urlLinkedin;
    private String urlInstagram;
    
     public Usuario() {
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="idEducacion")
    private List<Educacion> educacionList;
        
    @OneToMany(fetch=FetchType.LAZY, mappedBy="idExperiencia")
    private List<Experiencia> experienciaList;
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy="idCurso")
    private List<Cursos> cursoList;
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy="idProyecto")
    private List<Proyectos> proyectoList;
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy="idSkill")
    private List<Skills> skillList;

   

    public Usuario(Long id, String nombre, String apellido, String titulo, String descripcion, String imagenUsuario, String urlLinkedin, String urlInstagram) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagenUsuario = imagenUsuario;
        this.urlLinkedin = urlLinkedin;
        this.urlInstagram = urlInstagram;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenUsuario() {
        return imagenUsuario;
    }

    public void setImagenUsuario(String imagenUsuario) {
        this.imagenUsuario = imagenUsuario;
    }

    public String getUrlLinkedin() {
        return urlLinkedin;
    }

    public void setUrlLinkedin(String urlLinkedin) {
        this.urlLinkedin = urlLinkedin;
    }

    public String getUrlInstagram() {
        return urlInstagram;
    }

    public void setUrlInstagram(String urlInstagram) {
        this.urlInstagram = urlInstagram;
    }
    
    
    
    
    
}
