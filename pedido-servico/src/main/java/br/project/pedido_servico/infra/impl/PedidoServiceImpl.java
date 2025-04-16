package br.project.pedido_servico.infra.impl;

import br.project.pedido_servico.domain.entities.Pedido;
import br.project.pedido_servico.domain.gateway.PedidoGateway;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServiceImpl implements PedidoGateway {


    @Override
    public Pedido salvar(Pedido pedido) {
        return null;
    }

    @Override
    public Optional<Pedido> buscarPorId(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Pedido> listarPedido() {
        return List.of();
    }

    @Override
    public void deletarPedido(Long id) {

    }
}
