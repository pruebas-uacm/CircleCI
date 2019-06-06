package mx.edu.uacm.circleci.service.impl;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import mx.edu.uacm.circleci.domain.Usuario;
import mx.edu.uacm.circleci.service.UsuarioService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UsuarioServiceImplTest {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Test
	public void debeAgregarUnUsuario() throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Prueba");
		usuario.setCorreo("ok@ok.org");
		
		usuarioService.guardarUsuario(usuario);
		
		
	}

}
