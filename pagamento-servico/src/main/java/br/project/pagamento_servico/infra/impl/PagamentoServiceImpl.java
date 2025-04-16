package br.project.pagamento_servico.infra.impl;

import br.project.pagamento_servico.domain.entities.Pagamento;
import br.project.pagamento_servico.domain.gateway.PagamentoGateway;
import br.project.pagamento_servico.infra.repository.PagamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagamentoServiceImpl implements PagamentoGateway {
    private final PagamentoRepository pagamentoRepository;

    public PagamentoServiceImpl(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }

    @Override
    public Pagamento salvarPagamento(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }

    @Override
    public Optional<Pagamento> buscarPorId(Long id) {
        return pagamentoRepository.findById(id);
    }

    @Override
    public List<Pagamento> listarPagamento() {
        return pagamentoRepository.findAll();
    }

    @Override
    public void deletarPagamento(Long id) {
        pagamentoRepository.deleteById(id);
    }
}
