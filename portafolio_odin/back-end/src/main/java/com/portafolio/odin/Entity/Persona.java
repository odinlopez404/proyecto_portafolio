
package com.portafolio.odin.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @NotNull
    @Size(min = 1,max = 50, message = "Error de longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1,max = 50, message = "Error de longitud")
    private String apellido;
    
    @NotNull
    @Size(min = 10,max = 156, message = "Error de longitud")
    private String img;

    
}
