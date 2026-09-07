package br.com.bruno.previdenciario.previdenciarioapi.model;

import br.com.bruno.previdenciario.previdenciarioapi.dto.ClienteEndereco;
import br.com.bruno.previdenciario.previdenciarioapi.dto.ClienteRequest;
import br.com.bruno.previdenciario.previdenciarioapi.dto.DadosAtualizacoes;
import br.com.bruno.previdenciario.previdenciarioapi.endereco.Endereco;
import br.com.bruno.previdenciario.previdenciarioapi.model.user.Usuario;
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    protected String nome;

    protected String email;

    private Boolean status;

    private String cpf;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    @Embedded
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "procurador_id")
    private Usuario procurador;

    //construtor para requisição dos dados pessoais
    public Client(@Valid ClienteRequest request) {
        this.nome = request.nome();
        this.email = request.email();
        this.cpf = request.cpf();
        this.status = true;
        this.endereco = new Endereco(request.endereco());
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
