package br.project.entrega_servico.domain.gateway;

import br.project.entrega_servico.domain.entities.Entrega;

import java.util.List;
import java.util.Optional;

public interface EntregaGateway {
    Entrega salvar(Entrega entrega);
    Optional<Entrega> buscaPorId(Long id);
    List<Entrega> listarEntrega();
    void deletarEntrega(Long id);
}
