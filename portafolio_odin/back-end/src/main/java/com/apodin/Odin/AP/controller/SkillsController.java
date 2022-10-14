package com.apodin.Odin.AP.controller;

import com.apodin.Odin.AP.models.Skills;
import com.apodin.Odin.AP.services.SkillsService;
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
@RequestMapping("/skills")

public class SkillsController {

    private final SkillsService skillsService;

    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Skills>> obtenerSkill() {
        List<Skills> skill = skillsService.buscarSkill();
        return new ResponseEntity<>(skill, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Skills> editarSkill(@RequestBody Skills skills) {
        Skills actualizarSkill = skillsService.editarSkill(skills);
        return new ResponseEntity<>(actualizarSkill, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Skills> agregarSkill(@RequestBody Skills skills) {
        Skills agregarSkill = skillsService.agregarSkill(skills);
        return new ResponseEntity<>(agregarSkill, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> eliminarSkill(@PathVariable("id") Long id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
