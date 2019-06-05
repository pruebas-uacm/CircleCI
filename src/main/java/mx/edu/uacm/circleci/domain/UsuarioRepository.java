package mx.edu.uacm.circleci.domain;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	Usuario findByCorreo(String correo);
}
