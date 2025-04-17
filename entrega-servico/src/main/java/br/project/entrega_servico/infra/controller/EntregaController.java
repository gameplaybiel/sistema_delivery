package br.project.entrega_servico.infra.controller;

import br.project.entrega_servico.application.dto.EntregaRequestDTO;
import br.project.entrega_servico.application.usecase.EntregaUseCase;
import br.project.entrega_servico.domain.entities.Entrega;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entrega")
public class EntregaController {
    private final EntregaUseCase entregaUseCase;

    public EntregaController(EntregaUseCase entregaUseCase) {
        this.entregaUseCase = entregaUseCase;
    }

    @PostMapping
    public Entrega criar(@RequestBody EntregaRequestDTO dto){
        Entrega entrega = new Entrega(null, dto.getEnderecoEntrega(), dto.getRastreamento(), dto.getStatus(), dto.getDataEnvio(), dto.getDataEntrega());
        return entregaUseCase.criarEntrega(entrega);
    }

    @GetMapping("/{id}")
    public Entrega buscaPorId(Long id){
        return entregaUseCase.buscaEntregaId(id).orElse(null);
    }

    @GetMapping
    public List<Entrega> listarEntrega(){
        return entregaUseCase.listar();
    }

    @DeleteMapping("/{id}")
    public void deletarEntrega(Long id){
        entregaUseCase.deletar(id);
    }
}
