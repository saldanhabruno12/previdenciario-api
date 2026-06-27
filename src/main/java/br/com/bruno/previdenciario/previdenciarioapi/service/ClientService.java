package br.com.bruno.previdenciario.previdenciarioapi.service;

import br.com.bruno.previdenciario.previdenciarioapi.model.Client;
import jakarta.persistence.OneToMany;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service //lógica de negócio
public class ClientService {

    private final List<Client> clients = new ArrayList<>();

    public List <Client> listClients() {
        return clients;
    }

    public Client createClient(Client client){
        clients.add(client);
        return client;
    }
}
