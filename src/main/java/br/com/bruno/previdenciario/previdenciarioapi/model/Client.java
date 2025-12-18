package br.com.bruno.previdenciario.previdenciarioapi.model;

import br.com.bruno.previdenciario.previdenciarioapi.dto.ClienteEndereco;
import br.com.bruno.previdenciario.previdenciarioapi.endereco.Endereco;
import jakarta.persistence.*;
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

    @Embedded
    private Endereco endereco;

}
