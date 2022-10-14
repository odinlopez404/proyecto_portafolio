package com.apodin.Odin.AP.controller;

import com.apodin.Odin.AP.models.Cursos;
import com.apodin.Odin.AP.services.CursosService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class CursosController {

    private final CursosService cursosService;
    
    public CursosController (CursosService cursosService){
    this.cursosService = cursosService;
    }
    
  
    @GetMapping("/all")
    public ResponseEntity<List<Cursos>> obtenerCurso(){
        List<Cursos> curso = cursosService.buscarCursos();
        return new ResponseEntity<>(curso, HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Cursos> editarCurso(@RequestBody Cursos cursos){
    Cursos actualizarCurso = cursosService.editarCursos(cursos);
        return new ResponseEntity<>(actualizarCurso, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Cursos> agregarCurso(@RequestBody Cursos cursos){
    Cursos agregarCurso= cursosService.agregarCurso(cursos);
        return new ResponseEntity<>(agregarCurso, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> eliminarCurso(@PathVariable("id")Long id){
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    
    
    
}
