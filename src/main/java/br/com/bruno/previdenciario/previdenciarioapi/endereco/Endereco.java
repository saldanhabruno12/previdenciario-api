package br.com.bruno.previdenciario.previdenciarioapi.endereco;

import jakarta.persistence.Embeddable;
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
}
