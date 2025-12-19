package br.com.bruno.previdenciario.previdenciarioapi.dto;

import br.com.bruno.previdenciario.previdenciarioapi.endereco.Endereco;
import br.com.bruno.previdenciario.previdenciarioapi.model.Client;

public record DadosListagemCliente(String nome, String cpf, String email) {

    //construtor para evitar a devolução de todos os atributos na requisição get
    public DadosListagemCliente(Client cliente){
        this(cliente.getNome(), cliente.getCpf(), cliente.getEmail());
    }
}
