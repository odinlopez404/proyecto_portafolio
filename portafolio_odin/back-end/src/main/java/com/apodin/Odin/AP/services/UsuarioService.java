package com.apodin.Odin.AP.services;

import com.apodin.Odin.AP.exception.UserNotFoundException;
import com.apodin.Odin.AP.models.Usuario;
import com.apodin.Odin.AP.repository.UsuarioRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {

    private final UsuarioRepo usuarioRepo;

    @Autowired

    public UsuarioService(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    public Usuario agregarUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }
    
    public List<Usuario> buscarUsuario(){
        return usuarioRepo.findAll();
    }
    
    public Usuario buscarUsuarioPorId(Long id){
        return usuarioRepo.findById(id).orElseThrow(() ->  new UserNotFoundException("usuario no encontrado") );
    }
    
    
    public Usuario editarUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    
    public void eliminarUsuario(Long id){
        usuarioRepo.deleteById(id);
    }
}
