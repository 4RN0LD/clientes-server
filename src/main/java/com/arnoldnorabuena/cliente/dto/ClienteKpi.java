package com.arnoldnorabuena.cliente.dto;

import java.io.Serializable;

public class ClienteKpi implements Serializable {
    private Double promedio;
    private Double desviacion;

    public ClienteKpi(Double promedio, Double desviacion) {
        this.promedio = promedio;
        this.desviacion = desviacion;
    }

    public ClienteKpi() {
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public Double getDesviacion() {
        return desviacion;
    }

    public void setDesviacion(Double desviacion) {
        this.desviacion = desviacion;
    }
}
