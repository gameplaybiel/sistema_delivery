package br.project.pedido_servico.infra.repository;

import br.project.pedido_servico.domain.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
