package br.project.pagamento_servico.infra.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PagamentoConsuimer {
    @RabbitListener(queues = RabbitMQConfig.PAGAMENTO_CRIADO_QUEUE)
    public void receberPagamentoCriado(PagamentoCriadoEvent event){
        System.out.println("Pedido recebido via mensageria" + event.getFormaPagamento());
    }
}
