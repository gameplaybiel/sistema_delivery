package com.tcc.pagamento_service.infra.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PagamentoConsumer {
    @RabbitListener(queues = RabbitMQConfig.PAGAMENTO_CRIADO_QUEUE)
    public void receberPagamentoCriado(PagamentoCriadoEvent event){
        System.out.println("Pagamento recebido via mensageria" + event.getId());
    }
}
