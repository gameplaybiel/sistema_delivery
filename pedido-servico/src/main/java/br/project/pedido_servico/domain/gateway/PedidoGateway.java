package br.project.pedido_servico.domain.gateway;

import br.project.pedido_servico.domain.entities.Pedido;

import java.util.List;
import java.util.Optional;

public interface PedidoGateway {
    Pedido salvar(Pedido pedido);
    Optional<Pedido> buscarPorId(Long id);
    List<Pedido> listarPedido();
    void deletarPedido(Long id);
}
