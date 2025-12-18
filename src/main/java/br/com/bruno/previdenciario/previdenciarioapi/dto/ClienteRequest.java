package br.com.bruno.previdenciario.previdenciarioapi.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public record ClienteRequest (
        @NotBlank (message = "Insira o CPF")
        @Pattern(regexp = "^\\d{11}$")
        String cpf,

        @NotBlank (message = "Insira o nome completo")
        String nome,

        @NotBlank @Email
        String email,

        @NotNull @Valid
        ClienteEndereco endereco
    ){}
