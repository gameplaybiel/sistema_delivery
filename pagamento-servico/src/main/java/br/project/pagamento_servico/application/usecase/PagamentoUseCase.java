package br.project.pagamento_servico.application.usecase;

import br.project.pagamento_servico.domain.entities.Pagamento;
import br.project.pagamento_servico.domain.gateway.PagamentoGateway;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PagamentoUseCase {
    private final PagamentoGateway gateway;

    public PagamentoUseCase(PagamentoGateway gateway) {
        this.gateway = gateway;
    }

    public Pagamento criarPagamento(Pagamento pagamento){
        return gateway.salvarPagamento(pagamento);
    }

    public Optional<Pagamento> buscarPagamentoPorId(Long id){
        return gateway.buscarPorId(id);
    }

    public List<Pagamento> listar(){
        return gateway.listarPagamento();
    }

    public void deletar(Long id){
        gateway.deletarPagamento(id);
    }
}
