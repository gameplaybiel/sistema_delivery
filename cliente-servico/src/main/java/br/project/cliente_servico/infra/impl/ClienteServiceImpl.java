package br.project.cliente_servico.infra.impl;

import br.project.cliente_servico.domain.entities.Cliente;
import br.project.cliente_servico.domain.gateway.ClienteGateway;
import br.project.cliente_servico.infra.repository.ClienteRepository;
import br.project.cliente_servico.infra.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteGateway {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }
}
