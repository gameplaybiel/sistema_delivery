package br.project.pedido_servico.application.dto;

public class PedidoRequestDTO {
    private String nomePedido;
    private String descricao;
    private int quantidade;

    public PedidoRequestDTO(){}

    public PedidoRequestDTO(String nomePedido, String descricao, int quantidade) {
        this.nomePedido = nomePedido;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public String getNomePedido() {
        return nomePedido;
    }

    public void setNomePedido(String nomePedido) {
        this.nomePedido = nomePedido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
