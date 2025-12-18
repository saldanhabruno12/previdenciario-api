package br.com.bruno.previdenciario.previdenciarioapi.controller;

import br.com.bruno.previdenciario.previdenciarioapi.dto.ClienteRequest;
import br.com.bruno.previdenciario.previdenciarioapi.model.Client;
import br.com.bruno.previdenciario.previdenciarioapi.model.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientes")
public class ClientController {

    //injeção de dependencias
    @Autowired
    private ClienteRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody @Valid ClienteRequest cliente){
        repository.save(new Client(cliente));
    }

}
