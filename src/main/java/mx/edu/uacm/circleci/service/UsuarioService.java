package mx.edu.uacm.circleci.service;

import mx.edu.uacm.circleci.domain.Usuario;

public interface UsuarioService {
	
	/**
	 * Metodo utilizado para guardar un usuario
	 * @param usuario
	 * @return usuario + id generado
	 */
	Usuario guardarUsuario(Usuario usuario) throws Exception;

}
