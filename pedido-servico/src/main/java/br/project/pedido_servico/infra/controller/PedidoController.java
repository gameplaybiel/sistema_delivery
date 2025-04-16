package br.project.pedido_servico.infra.controller;

import br.project.pedido_servico.application.dto.PedidoRequestDTO;
import br.project.pedido_servico.application.usecase.PedidoUseCase;
import br.project.pedido_servico.domain.entities.Pedido;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    private final PedidoUseCase pedidoUseCase;

    public PedidoController(PedidoUseCase pedidoUseCase) {
        this.pedidoUseCase = pedidoUseCase;
    }

    @PostMapping
    public Pedido criar(@RequestBody PedidoRequestDTO dto){
        Pedido pedido = new Pedido(null, dto.getNomePedido(), dto.getDescricao(), dto.getQuantidade());
        return pedidoUseCase.criarPedido(pedido);
    }

    @GetMapping("/{id}")
    public Pedido buscarPorId(@PathVariable Long id){
        return pedidoUseCase.buscarId(id).orElse(null);
    }

    @GetMapping
    public List<Pedido> listar(){
        return pedidoUseCase.listar();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        pedidoUseCase.deletar(id);
    }
}
