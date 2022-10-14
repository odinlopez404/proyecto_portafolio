package com.apodin.Odin.AP.services;

import com.apodin.Odin.AP.models.Skills;
import com.apodin.Odin.AP.repository.SkillsRepo;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillsService {

    private final SkillsRepo skillsRepo;

    @Autowired

    public SkillsService(SkillsRepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }
    
    public Skills agregarSkill(Skills skills){
        return skillsRepo.save(skills);
        
    }
    
    public List<Skills> buscarSkill(){
        return skillsRepo.findAll();
    }
    
    public Skills editarSkill(Skills skills){
        return skillsRepo.save(skills);
        
    }
    
    public void borrarSkill(Long id){
        skillsRepo.deleteById(id);
    }
    

}
