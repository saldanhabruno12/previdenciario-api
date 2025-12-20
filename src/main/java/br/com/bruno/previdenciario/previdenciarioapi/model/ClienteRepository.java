package br.com.bruno.previdenciario.previdenciarioapi.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Client, Long> {
    Page<Client> findAllByStatusTrue (Pageable paginacao);
}
