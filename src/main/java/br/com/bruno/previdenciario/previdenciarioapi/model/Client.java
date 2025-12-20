package br.com.bruno.previdenciario.previdenciarioapi.model;

import br.com.bruno.previdenciario.previdenciarioapi.dto.ClienteEndereco;
import br.com.bruno.previdenciario.previdenciarioapi.dto.ClienteRequest;
import br.com.bruno.previdenciario.previdenciarioapi.dto.DadosAtualizacoes;
import br.com.bruno.previdenciario.previdenciarioapi.endereco.Endereco;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "clientes")
@Entity(name = "Client")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Client {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private Boolean status;

    @Embedded
    private Endereco endereco;

    //construtor para requisição dos dados pessoais
    public Client(@Valid ClienteRequest cliente) {
        this.status = true;
        this.nome = cliente.nome();
        this.cpf = cliente.cpf();
        this.email = cliente.email();
        this.endereco = new Endereco(cliente.endereco());
    }

    //metodo de atualizacao para evitar troca indevida de atributos para null
    public void atualizarDados(@Valid DadosAtualizacoes dados) {
        if(dados.cpf() != null){
            this.cpf = dados.cpf();
        }

        if(dados.nome() != null){
            this.nome = dados.nome();
        }

        if(dados.email() != null){
            this.email = dados.email();
        }

        if(dados.endereco() != null){
            this.endereco.atualizarEndereco(dados.endereco());
        }
    }

    public void desativarDados() {
        this.status = false;
    }
}
