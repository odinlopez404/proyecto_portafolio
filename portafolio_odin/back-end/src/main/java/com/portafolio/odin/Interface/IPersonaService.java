
package com.portafolio.odin.Interface;

import com.portafolio.odin.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    public List<Persona> getPersona();
    public void savePersona (Persona persona);
    public void deletePersona (Long id);
    public Persona findPersona(Long id);
}

