package com.apodin.Odin.AP.services;

import com.apodin.Odin.AP.models.Experiencia;
import com.apodin.Odin.AP.repository.ExperienciaRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class ExperienciaService {

    private final ExperienciaRepo experienciaRepo;

    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }

    public Experiencia agregarExperiencia(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }

    public List<Experiencia> buscarExperiencia() {
        return experienciaRepo.findAll();
    }

    public Experiencia editarExperiencia(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }

    public void borrarExperiencia(Long id) {

        experienciaRepo.deleteById(id);
    }

}
