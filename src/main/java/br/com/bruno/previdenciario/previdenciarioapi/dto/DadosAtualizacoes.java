package br.com.bruno.previdenciario.previdenciarioapi.dto;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacoes(
        @NotNull
        Long id,

        String nome,

        String cpf,

        String email,

        ClienteEndereco endereco) {

}
