package br.com.bruno.previdenciario.previdenciarioapi.repositories;

import br.com.bruno.previdenciario.previdenciarioapi.model.user.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    UserDetails findByLogin(String login);
}
