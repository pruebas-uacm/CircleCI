package mx.edu.uacm.circleci.service.impl;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;
import mx.edu.uacm.circleci.domain.Usuario;
import mx.edu.uacm.circleci.service.UsuarioService;


@Slf4j
@SpringBootTest
public class UsuarioServiceImplTest {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Test
	public void debeAgregarUnUsuario() throws Exception {
		log.debug("Entrando a debeAgregarUnUsuario");
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Prueba");
		usuario.setCorreo("ok@ok.org");
		
		usuarioService.guardarUsuario(usuario);
		
		
	}

}
