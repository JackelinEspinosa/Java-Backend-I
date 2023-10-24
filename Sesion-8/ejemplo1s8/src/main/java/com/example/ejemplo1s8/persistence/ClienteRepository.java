package com.example.ejemplo1s8.persistence;

import com.example.ejemplo1s8.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository  extends JpaRepository<Cliente, Long> {

}
