package com.arnoldnorabuena.cliente.dto;

import com.arnoldnorabuena.cliente.model.Cliente;

import java.time.LocalDate;

public class ClienteWithDeathDTO extends Cliente {

    private LocalDate probaleMuerte;

    public ClienteWithDeathDTO() {
        super();
    }

    public ClienteWithDeathDTO(Cliente cliente, LocalDate probaleMuerte) {
        super(cliente.getId(), cliente.getNombre(), cliente.getApellido(), cliente.getEdad(), cliente.getNacimiento());
        this.probaleMuerte = probaleMuerte;
    }

    public LocalDate getProbaleMuerte() {
        return probaleMuerte;
    }

    public void setProbaleMuerte(LocalDate probaleMuerte) {
        this.probaleMuerte = probaleMuerte;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClienteDTO{");
        sb.append("probaleMuerte=").append(probaleMuerte);
        sb.append('}');
        return sb.toString();
    }
}
