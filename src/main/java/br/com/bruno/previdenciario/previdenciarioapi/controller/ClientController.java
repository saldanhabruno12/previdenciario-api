package br.com.bruno.previdenciario.previdenciarioapi.controller;

import br.com.bruno.previdenciario.previdenciarioapi.dto.ClienteRequest;
import br.com.bruno.previdenciario.previdenciarioapi.dto.DadosListagemCliente;
import br.com.bruno.previdenciario.previdenciarioapi.model.Client;
import br.com.bruno.previdenciario.previdenciarioapi.model.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClientController {

    //Acesso e persistência dos dados de clientes no banco de dados
    @Autowired
    private ClienteRepository repository;

    @PostMapping
    @Transactional
    //verifica se os campos da requisição são válidos e os guarda no banco de dados
    public void cadastrar(@RequestBody @Valid ClienteRequest cliente){

        repository.save(new Client(cliente));
    }

    @GetMapping
    public Page<DadosListagemCliente> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){

        return repository.findAll(paginacao).map(DadosListagemCliente::new);
    }



}
