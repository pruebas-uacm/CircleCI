package mx.edu.uacm.circleci.service.impl;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import mx.edu.uacm.circleci.domain.Usuario;
import mx.edu.uacm.circleci.service.UsuarioService;


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
