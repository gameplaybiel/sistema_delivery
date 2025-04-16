package br.project.cliente_servico.infra.service;

import br.project.cliente_servico.domain.entities.Cliente;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface ClienteService {
    Cliente salvar(Cliente cliente);
    Optional<Cliente> buscarPorId(Long id);
    List<Cliente> listar();
    void deletar(Long id);
}
