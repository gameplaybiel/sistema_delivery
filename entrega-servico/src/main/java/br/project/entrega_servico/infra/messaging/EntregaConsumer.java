package br.project.entrega_servico.infra.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class EntregaConsumer {

    @RabbitListener(queues = RabbitMQConfig.ENTREGA_CRIADO_QUEUE)
    public void enviarEntregaCriado(EntregaCriadoEvent event){
        System.out.println("Entrega recebida via mensageria" + event.getEnderecoEntrega());
    }
}
