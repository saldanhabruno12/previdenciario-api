package br.com.bruno.previdenciario.previdenciarioapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record ClienteEndereco (
        @NotBlank
        String logradouro,

        @NotBlank
        String bairro,

        @NotBlank
        String numero,

        @NotBlank @Pattern(regexp = "^\\d{8}$")
        String cep,

        @NotBlank
        String cidade,

        @NotBlank @Pattern(regexp = "^[A-Z]{2}$")
        String estado,

        String complemento
    ) {}
