package br.project.cliente_servico.domain.gateway;

import br.project.cliente_servico.domain.entities.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteGateway {
    Cliente salvar(Cliente cliente);
    Optional<Cliente> buscarPorId(Long id);
    List<Cliente> listar();
    void deletar(Long id);
}
