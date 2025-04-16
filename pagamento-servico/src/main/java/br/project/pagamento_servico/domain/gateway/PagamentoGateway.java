package br.project.pagamento_servico.domain.gateway;

import br.project.pagamento_servico.domain.entities.Pagamento;

import java.util.List;
import java.util.Optional;

public interface PagamentoGateway {
    Pagamento salvarPagamento(Pagamento pagamento);
    Optional<Pagamento> buscarPorId(Long id);
    List<Pagamento> listarPagamento();
    void deletarPagamento(Long id);
}
