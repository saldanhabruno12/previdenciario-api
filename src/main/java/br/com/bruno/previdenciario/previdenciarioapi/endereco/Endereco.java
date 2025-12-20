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

    //metodo de atualizacao para evitar troca indevida de atributos para null
    public void atualizarEndereco(ClienteEndereco dados) {
        if(dados.logradouro() != null){
            this.logradouro = dados.logradouro();;
        }

        if(dados.numero() != null){
            this.numero = dados.numero();;
        }

        if(dados.bairro() != null){
            this.bairro = dados.bairro();;
        }

        if(dados.cep() != null){
            this.cep = dados.cep();;
        }

        if(dados.complemento() != null){
            this.complemento = dados.complemento();;
        }

        if(dados.cidade() != null){
            this.cidade = dados.cidade();;
        }

        if(dados.estado() != null){
            this.estado = dados.estado();;
        }
    }
}
