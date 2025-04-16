package br.project.cliente_servico.infra.controller;

import br.project.cliente_servico.application.dto.ClienteRequestDTO;
import br.project.cliente_servico.application.usecase.ClienteUseCase;
import br.project.cliente_servico.domain.entities.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteUseCase clienteUseCase;

    public ClienteController(ClienteUseCase clienteUseCase) {
        this.clienteUseCase = clienteUseCase;
    }

    @PostMapping
    public Cliente criar(@RequestBody ClienteRequestDTO dto){
        Cliente cliente = new Cliente(null, dto.getNome(), dto.getEmail(), dto.getTelefone());
        return clienteUseCase.criar(cliente);
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id){
        return clienteUseCase.buscarId(id).orElse(null);
    }

    @GetMapping
    public List<Cliente> listar(){
        return clienteUseCase.listarCliente();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        clienteUseCase.deletarCliente(id);
    }
}
