package br.project.pagamento_servico.application.dto;

public class PagamentoRequestDTO {
    private Double total;
    private String formaPagamento;

    public PagamentoRequestDTO(Double total, String formaPagamento) {
        this.total = total;
        this.formaPagamento = formaPagamento;
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
