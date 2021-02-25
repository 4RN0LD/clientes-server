package com.arnoldnorabuena.cliente.service.impl;

import com.arnoldnorabuena.cliente.dto.ClienteWithDeathDTO;
import com.arnoldnorabuena.cliente.dto.ClienteKpi;
import com.arnoldnorabuena.cliente.model.Cliente;
import com.arnoldnorabuena.cliente.repository.ClienteRepository;
import com.arnoldnorabuena.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repo;

    @Override
    public ClienteKpi findClienteKpi() {
        var res = (Object[]) repo.findKpi();
        var promedio = Double.parseDouble(res[0].toString());
        var cantidad = Double.parseDouble(res[1].toString());
        var clientes = repo.findAll();
        var sumatoriaDeCuadrados = clientes.stream().mapToDouble(cliente -> Math.pow(cliente.getEdad() - promedio, 2)).sum();
        var desviacion = Math.sqrt(sumatoriaDeCuadrados / (cantidad - 1));
        var clienteKPI = new ClienteKpi(promedio, desviacion);
        return clienteKPI;
    }

    @Override
    public Cliente createCliente(Cliente cliente) {
        return repo.save(cliente);
    }

    @Override
    public List<ClienteWithDeathDTO> findClientesWithDead() {
        return repo.findAll().stream()
                .map(o -> new ClienteWithDeathDTO(o, o.getNacimiento().plusYears(80)))
                .collect(Collectors.toList());
    }


}
