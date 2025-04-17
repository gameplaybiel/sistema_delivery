package br.project.entrega_servico.application.usecase;

import br.project.entrega_servico.domain.entities.Entrega;
import br.project.entrega_servico.domain.gateway.EntregaGateway;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EntregaUseCase {
    private final EntregaGateway entregaGateway;

    public EntregaUseCase(EntregaGateway entregaGateway) {
        this.entregaGateway = entregaGateway;
    }

    public Entrega criarEntrega(Entrega entrega){
        return entregaGateway.salvar(entrega);
    }

    public Optional<Entrega> buscaEntregaId(Long id){
        return entregaGateway.buscaPorId(id);
    }

    public List<Entrega> listar(){
        return entregaGateway.listarEntrega();
    }

    public void deletar(Long id){
        entregaGateway.deletarEntrega(id);
    }
}
