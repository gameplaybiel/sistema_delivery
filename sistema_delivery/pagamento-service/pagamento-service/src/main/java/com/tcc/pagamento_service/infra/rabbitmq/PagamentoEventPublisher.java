package com.tcc.pagamento_service.infra.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class PagamentoEventPublisher {
    private final RabbitTemplate rabbitTemplate;

    public PagamentoEventPublisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void publicarEvento(PagamentoCriadoEvent event){
        rabbitTemplate.convertAndSend(
                RabbitMQConfig.PAGAMENTO_EXCHANGE,
                RabbitMQConfig.PAGAMENTO_CRIADO_ROUTING_KEY,
                event
        );
    }
}
