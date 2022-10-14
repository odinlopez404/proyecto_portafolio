package com.apodin.Odin.AP.controller;

import com.apodin.Odin.AP.models.Experiencia;
import com.apodin.Odin.AP.services.ExperienciaService;
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
@RequestMapping("/experiencia")

public class ExperienciaController {

    private final ExperienciaService experienciaService;

    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Experiencia>> obtenerExperiencia() {
        List<Experiencia> experiencias = experienciaService.buscarExperiencia();
        return new ResponseEntity<>(experiencias, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia) {
        Experiencia updateExperiencia = experienciaService.editarExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Experiencia> crearExperiencia(@RequestBody Experiencia experiencia) {
        Experiencia nuevaExperiencia = experienciaService.agregarExperiencia(experiencia);
        return new ResponseEntity<>(nuevaExperiencia, HttpStatus.OK);

    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> borrarExperiencia(@PathVariable("id") Long id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
