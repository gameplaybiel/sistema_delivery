package br.project.pedido_servico.application.usecase;

import br.project.pedido_servico.domain.entities.Pedido;
import br.project.pedido_servico.domain.gateway.PedidoGateway;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PedidoUseCase {
    private final PedidoGateway pedidoGateway;

    public PedidoUseCase(PedidoGateway pedidoGateway) {
        this.pedidoGateway = pedidoGateway;
    }

    public Pedido criarPedido(Pedido pedido){
        return pedidoGateway.salvar(pedido);
    }

    public Optional<Pedido> buscarId(Long id){
        return pedidoGateway.buscarPorId(id);
    }

    public List<Pedido> listar(){
        return pedidoGateway.listarPedido();
    }

    public void deletar(Long id){
        pedidoGateway.deletarPedido(id);
    }
}
