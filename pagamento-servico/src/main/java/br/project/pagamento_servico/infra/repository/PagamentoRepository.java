package br.project.pagamento_servico.infra.repository;

import br.project.pagamento_servico.domain.entities.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
