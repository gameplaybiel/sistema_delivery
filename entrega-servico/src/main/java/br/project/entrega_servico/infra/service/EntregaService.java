package br.project.entrega_servico.infra.service;

import br.project.entrega_servico.domain.entities.Entrega;

import java.util.List;
import java.util.Optional;

public interface EntregaService {
    Entrega salvar(Entrega entrega);
    Optional<Entrega> buscaPorId(Long id);
    List<Entrega> listar();
    void deletar(Long id);
}
