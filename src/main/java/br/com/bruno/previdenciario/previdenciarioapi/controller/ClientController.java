package br.com.bruno.previdenciario.previdenciarioapi.controller;

import br.com.bruno.previdenciario.previdenciarioapi.dto.ClienteRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientes")
public class ClientController {

    @PostMapping
    public void cadastrar(@RequestBody @Valid ClienteRequest cliente){
        System.out.println(cliente.endereco().cep());
    }

}
