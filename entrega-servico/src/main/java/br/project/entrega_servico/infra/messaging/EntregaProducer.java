package br.project.entrega_servico.infra.messaging;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class EntregaProducer {
    private final RabbitTemplate rabbitTemplate;

    public EntregaProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void enviarEntregaCriado(EntregaCriadoEvent event){
        rabbitTemplate.convertAndSend(
                RabbitMQConfig.ENTREGA_EXCHANGE,
                RabbitMQConfig.ENTREGA_ROUTING_KEY,
                event
        );
    }
}
