package com.tcc.pedido_service.infra.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    // Nomes consistentes com os usados no Publisher
    public static final String PEDIDO_EXCHANGE = "pedido.exchange";
    public static final String PEDIDO_CRIADO_QUEUE = "pedido.queue";
    public static final String CRIADO_ROUTING_KEY = "pedido.criado.queue";

    @Bean
    public DirectExchange pedidoExchange() {
        return new DirectExchange(PEDIDO_EXCHANGE);
    }

    @Bean
    public Queue pedidoCriadoQueue() {
        return new Queue(PEDIDO_CRIADO_QUEUE, true);
    }

    @Bean
    public Binding bindingCriado() {
        return BindingBuilder.bind(pedidoCriadoQueue())
                .to(pedidoExchange())
                .with(CRIADO_ROUTING_KEY);
    }
}
