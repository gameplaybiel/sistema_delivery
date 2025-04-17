package br.project.entrega_servico.application.dto;

import java.time.LocalDateTime;

public class EntregaRequestDTO {
    private String enderecoEntrega;
    private String rastreamento;
    private String status;
    private LocalDateTime dataEnvio;
    private LocalDateTime dataEntrega;

    public EntregaRequestDTO(String enderecoEntrega, String rastreamento, String status, LocalDateTime dataEnvio, LocalDateTime dataEntrega) {
        this.enderecoEntrega = enderecoEntrega;
        this.rastreamento = rastreamento;
        this.status = status;
        this.dataEnvio = dataEnvio;
        this.dataEntrega = dataEntrega;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getRastreamento() {
        return rastreamento;
    }

    public void setRastreamento(String rastreamento) {
        this.rastreamento = rastreamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(LocalDateTime dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public LocalDateTime getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDateTime dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}
