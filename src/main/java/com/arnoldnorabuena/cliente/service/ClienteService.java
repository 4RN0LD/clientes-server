package com.arnoldnorabuena.cliente.service;

import com.arnoldnorabuena.cliente.dto.ClienteWithDeathDTO;
import com.arnoldnorabuena.cliente.dto.ClienteKpi;
import com.arnoldnorabuena.cliente.model.Cliente;

import java.util.List;

public interface ClienteService {

    ClienteKpi findClienteKpi();

    Cliente createCliente(Cliente cliente);

    List<ClienteWithDeathDTO> findClientesWithDead();

}
