package mx.edu.uacm.circleci.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.uacm.circleci.domain.Usuario;
import mx.edu.uacm.circleci.domain.UsuarioRepository;
import mx.edu.uacm.circleci.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario guardarUsuario(Usuario usuario) throws Exception {
		
		Usuario usuarioEncontrado = usuarioRepository.findByCorreo(usuario.getCorreo());
		
		if(usuarioEncontrado != null) {
			throw new Exception("Usuario encontrado");
		}
		
		return usuarioRepository.save(usuario);
	}

	
	

}
