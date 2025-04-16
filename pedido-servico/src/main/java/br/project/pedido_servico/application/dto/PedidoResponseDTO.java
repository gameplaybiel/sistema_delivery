package br.project.pedido_servico.application.dto;

public class PedidoResponseDTO {
    private Long id;
    private String nomePedido;
    private String descricao;
    private int quantidade;

    public PedidoResponseDTO(){}

    public PedidoResponseDTO(Long id, String nomePedido, String descricao, int quantidade) {
        this.id = id;
        this.nomePedido = nomePedido;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
