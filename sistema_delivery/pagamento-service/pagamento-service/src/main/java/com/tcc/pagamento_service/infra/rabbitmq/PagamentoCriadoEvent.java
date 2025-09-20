package com.tcc.pagamento_service.infra.rabbitmq;

import com.tcc.pagamento_service.domain.model.MetodoPagamento;
import com.tcc.pagamento_service.domain.model.StatusPagamento;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class PagamentoCriadoEvent implements Serializable {
    private Long id;
    private Long pedidoId;
    private MetodoPagamento metodoPagamento;
    private StatusPagamento statusPagamento;
    private LocalDate dataCriacao;
    private LocalDateTime dataAtualizacao;

    public PagamentoCriadoEvent(){}

    public PagamentoCriadoEvent(Long id, Long pedidoId, MetodoPagamento metodoPagamento, StatusPagamento statusPagamento, LocalDate dataCriacao, LocalDateTime dataAtualizacao) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.metodoPagamento = metodoPagamento;
        this.statusPagamento = statusPagamento;
        this.dataCriacao = dataCriacao;
        this.dataAtualizacao = dataAtualizacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public MetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
}
