package br.project.pedido_servico.infra.impl;

import br.project.pedido_servico.domain.entities.Pedido;
import br.project.pedido_servico.domain.gateway.PedidoGateway;
import br.project.pedido_servico.infra.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServiceImpl implements PedidoGateway {

    private final PedidoRepository pedidoRepository;

    public PedidoServiceImpl(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public Pedido salvar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    public Optional<Pedido> buscarPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    @Override
    public List<Pedido> listarPedido() {
        return pedidoRepository.findAll();
    }

    @Override
    public void deletarPedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}
