package br.project.pedido_servico.infra.service;

import br.project.pedido_servico.domain.entities.Pedido;

import java.util.List;
import java.util.Optional;

public interface PedidoService {
    Pedido salvar(Pedido pedido);
    Optional<Pedido> buscarId(Long id);
    List<Pedido> listar();
    void deletar(Long id);
}
