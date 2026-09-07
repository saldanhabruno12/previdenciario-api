package br.com.bruno.previdenciario.previdenciarioapi.dto;

import br.com.bruno.previdenciario.previdenciarioapi.model.user.UsuarioRole;

public record RegisterDTO(String login, String password, UsuarioRole role) {
}
