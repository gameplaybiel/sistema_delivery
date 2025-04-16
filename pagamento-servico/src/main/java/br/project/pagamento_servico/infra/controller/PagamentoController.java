package br.project.pagamento_servico.infra.controller;

import br.project.pagamento_servico.application.dto.PagamentoRequestDTO;
import br.project.pagamento_servico.application.usecase.PagamentoUseCase;
import br.project.pagamento_servico.domain.entities.Pagamento;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {
    private final PagamentoUseCase pagamentoUseCase;

    public PagamentoController(PagamentoUseCase pagamentoUseCase) {
        this.pagamentoUseCase = pagamentoUseCase;
    }

    @PostMapping
    public Pagamento criar(@RequestBody PagamentoRequestDTO dto){
        Pagamento pagamento = new Pagamento(null, dto.getTotal(), dto.getFormaPagamento());
        return pagamentoUseCase.criarPagamento(pagamento);
    }

    @GetMapping("/{id}")
    public Pagamento buscarPorId(@PathVariable Long id){
        return pagamentoUseCase.buscarPagamentoPorId(id).orElse(null);
    }

    @GetMapping
    public List<Pagamento> listar(){
        return pagamentoUseCase.listar();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        pagamentoUseCase.deletar(id);
    }
}
