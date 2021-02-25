package com.arnoldnorabuena.cliente.controller;


import com.arnoldnorabuena.cliente.dto.ClienteWithDeathDTO;
import com.arnoldnorabuena.cliente.dto.ClienteKpi;
import com.arnoldnorabuena.cliente.model.Cliente;
import com.arnoldnorabuena.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping()
@RestController
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping("/kpideclientes")
    public ResponseEntity<ClienteKpi> kpiDeClientes(){
        var cliente = service.findClienteKpi();
        return new ResponseEntity<ClienteKpi>(cliente, HttpStatus.OK);
    }

    @GetMapping("/listclientes")
    public ResponseEntity<List<ClienteWithDeathDTO>> listCientes(){
        var clientes = service.findClientesWithDead();
        return new ResponseEntity<List<ClienteWithDeathDTO>>(clientes, HttpStatus.OK);
    }

    @PostMapping("/creacliente")
    public ResponseEntity<Cliente> creaCliente(@RequestBody Cliente cliente) {
        var cliente0 = service.createCliente(cliente);
        return new ResponseEntity<Cliente>(cliente0, HttpStatus.OK);
    }

}
