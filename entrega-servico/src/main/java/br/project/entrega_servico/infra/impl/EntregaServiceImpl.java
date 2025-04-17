package br.project.entrega_servico.infra.impl;

import br.project.entrega_servico.domain.entities.Entrega;
import br.project.entrega_servico.domain.gateway.EntregaGateway;
import br.project.entrega_servico.infra.repository.EntregaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntregaServiceImpl implements EntregaGateway {
    private final EntregaRepository entregaRepository;

    public EntregaServiceImpl(EntregaRepository entregaRepository) {
        this.entregaRepository = entregaRepository;
    }

    @Override
    public Entrega salvar(Entrega entrega) {
        return entregaRepository.save(entrega);
    }

    @Override
    public Optional<Entrega> buscaPorId(Long id) {
        return entregaRepository.findById(id);
    }

    @Override
    public List<Entrega> listarEntrega() {
        return entregaRepository.findAll();
    }

    @Override
    public void deletarEntrega(Long id) {
        entregaRepository.deleteById(id);
    }
}
