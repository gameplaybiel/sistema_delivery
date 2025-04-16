package br.project.pedido_servico.infra.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PedidoConsumer {

    @RabbitListener(queues = RabbitMQConfig.PEDIDO_CRIADO_QUEUE)
    public void receberPedidoCriado(PedidoCriadoEvent event){
        System.out.println("Pedido recebido via mensageria" + event.getNomePedido());
    }
}
