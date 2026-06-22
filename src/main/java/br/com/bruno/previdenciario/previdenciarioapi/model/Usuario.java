package br.com.bruno.previdenciario.previdenciarioapi.model;

import java.util.List;

public class Usuario extends Pessoa{
    private String senha;
    private List<Client> clientes;
    private double saldoRepasse;
}
