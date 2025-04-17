package br.project.entrega_servico.infra.repository;

import br.project.entrega_servico.domain.entities.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long> {
}
