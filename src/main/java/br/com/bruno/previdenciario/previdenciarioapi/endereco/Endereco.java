package br.com.bruno.previdenciario.previdenciarioapi.endereco;

import br.com.bruno.previdenciario.previdenciarioapi.dto.ClienteEndereco;
import jakarta.persistence.Embeddable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String bairro;
    private String numero;
    private String cep;
    private String cidade;
    private String estado;
    private String complemento;

    //construtor para requisição do endereço
    public Endereco(@NotNull @Valid ClienteEndereco cliente) {
        this.logradouro = cliente.logradouro();
        this.numero = cliente.numero();
        this.bairro = cliente.bairro();
        this.cep = cliente.cep();
        this.complemento = cliente.complemento();
        this.cidade = cliente.cidade();
        this.estado = cliente.estado();

    }
}
