package com.apodin.Odin.AP.services;

import com.apodin.Odin.AP.models.Cursos;
import com.apodin.Odin.AP.repository.CursosRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class CursosService {

    private final CursosRepo cursosRepo;

    @Autowired
    public CursosService(CursosRepo cursosRepo) {
        this.cursosRepo = cursosRepo;
    }

    public Cursos agregarCurso(Cursos cursos) {
        return cursosRepo.save(cursos);

    }

    public List<Cursos> buscarCursos() {
        return cursosRepo.findAll();
    }

    public Cursos editarCursos(Cursos cursos) {
        return cursosRepo.save(cursos);
    }
    
    public void borrarCursos(Long id){
        cursosRepo.deleteById(id);
        
    }

}
