package br.com.lucas.learn.cliente.repository;

import br.com.lucas.learn.cliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
