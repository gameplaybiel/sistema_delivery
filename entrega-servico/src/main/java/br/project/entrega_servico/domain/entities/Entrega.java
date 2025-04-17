package br.project.entrega_servico.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Entrega {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String enderecoEntrega;
    private String rastreamento;
    private String status;
    private LocalDateTime dataEnvio;
    private LocalDateTime dataEntrega;

    public Entrega(){}

    public Entrega(Long id, String enderecoEntrega, String rastreamento, String status, LocalDateTime dataEnvio, LocalDateTime dataEntrega) {
        this.id = id;
        this.enderecoEntrega = enderecoEntrega;
        this.rastreamento = rastreamento;
        this.status = status;
        this.dataEnvio = dataEnvio;
        this.dataEntrega = dataEntrega;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
