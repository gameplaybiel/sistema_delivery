package br.project.pagamento_servico.infra.service;

import br.project.pagamento_servico.domain.entities.Pagamento;

import java.util.List;
import java.util.Optional;

public interface PagamentoService {
    Pagamento salvar(Pagamento pagamento);
    Optional<Pagamento> buscarPagamentoPorId(Long id);
    List<Pagamento> listar();
    void deletar(Long id);
}
