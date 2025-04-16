package br.project.pagamento_servico.infra.messaging;

import java.io.Serializable;

public class PagamentoCriadoEvent implements Serializable {
    private Long id;
    private Double total;
    private String formaPagamento;

    public PagamentoCriadoEvent(Long id, Double total, String formaPagamento) {
        this.id = id;
        this.total = total;
        this.formaPagamento = formaPagamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
