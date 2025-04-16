package br.project.pagamento_servico.infra.messaging;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class PagamentoProducer {
    private final RabbitTemplate rabbitTemplate;

    public PagamentoProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void enviarPedidoCriado(PagamentoCriadoEvent event){
        rabbitTemplate.convertAndSend(
                RabbitMQConfig.PAGAMENTO_EXCHANGE,
                RabbitMQConfig.PAGAMENTO_ROUTING_KEY,
                event
        );
    }
}
