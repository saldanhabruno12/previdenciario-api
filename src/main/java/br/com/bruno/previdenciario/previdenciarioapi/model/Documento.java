package br.com.bruno.previdenciario.previdenciarioapi.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeOriginal;

    private String nomeArmazenado;

    private String caminhoArquivo;

    private String tipoArquivo;

    private Long tamanho;

    private LocalDateTime dataUpload;

   @ManyToOne
    private Client cliente;
}
