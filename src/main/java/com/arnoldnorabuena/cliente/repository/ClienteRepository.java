package com.arnoldnorabuena.cliente.repository;

import com.arnoldnorabuena.cliente.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    @Query("SELECT AVG(c.edad), COUNT(c.edad) FROM Cliente c")
    Object findKpi();
}
