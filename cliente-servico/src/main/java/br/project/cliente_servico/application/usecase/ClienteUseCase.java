package br.project.cliente_servico.application.usecase;

import br.project.cliente_servico.domain.entities.Cliente;
import br.project.cliente_servico.domain.gateway.ClienteGateway;
import br.project.cliente_servico.infra.repository.ClienteRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ClienteUseCase {
    private final ClienteGateway clienteGateway;

    public ClienteUseCase(ClienteGateway clienteGateway) {
        this.clienteGateway = clienteGateway;
    }

    public Cliente criar(Cliente cliente){
        return clienteGateway.salvar(cliente);
    }

    public Optional<Cliente> buscarId(Long id){
        return clienteGateway.buscarPorId(id);
    }

    public List<Cliente> listarCliente(){
        return clienteGateway.listar();
    }

    public void deletarCliente(Long id){
        clienteGateway.deletar(id);
    }
}
