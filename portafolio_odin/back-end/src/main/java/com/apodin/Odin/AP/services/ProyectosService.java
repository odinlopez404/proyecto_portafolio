package com.apodin.Odin.AP.services;

import com.apodin.Odin.AP.models.Proyectos;
import com.apodin.Odin.AP.repository.ProyectosRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectosService {

    private final ProyectosRepo proyectosRepo;
    
    @Autowired

    public ProyectosService(ProyectosRepo proyectosRepo) {
        this.proyectosRepo = proyectosRepo;
    }
    
    public Proyectos agregarProyecto(Proyectos proyectos){
        return proyectosRepo.save(proyectos);
    }
    
    public List<Proyectos> buscarProyecto(){
        return proyectosRepo.findAll();
    }
    
    public Proyectos editarProyecto(Proyectos proyectos){
        return proyectosRepo.save(proyectos);
    }
    
    public void borrarProyecto(Long id){
        proyectosRepo.deleteById(id);
    }
}
