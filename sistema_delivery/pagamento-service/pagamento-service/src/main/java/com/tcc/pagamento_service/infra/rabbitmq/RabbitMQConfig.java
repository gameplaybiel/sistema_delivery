package com.tcc.pagamento_service.infra.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    public static final String PAGAMENTO_EXCHANGE = "pagamento.exchange";
    public static final String PAGAMENTO_CRIADO_QUEUE = "pagamento.criado.queue";
    public static final String PAGAMENTO_CRIADO_ROUTING_KEY = "pagamento.criado.queue";

    @Bean
    public DirectExchange pagamentoExchange() {
        return new DirectExchange(PAGAMENTO_EXCHANGE);
    }

    @Bean
    public Queue pagamentoCriadoQueue() {
        return new Queue(PAGAMENTO_CRIADO_QUEUE, true);
    }

    @Bean
    public Binding binding(Queue pagamentoCriadoQueue, DirectExchange pagamentoExchange) {
        return BindingBuilder.bind(pagamentoCriadoQueue).to(pagamentoExchange).with(PAGAMENTO_CRIADO_ROUTING_KEY);
    }
}
