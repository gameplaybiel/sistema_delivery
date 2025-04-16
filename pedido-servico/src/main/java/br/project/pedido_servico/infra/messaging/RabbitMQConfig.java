package br.project.pedido_servico.infra.messaging;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    public static final String PEDIDO_CRIADO_QUEUE = "pedido.criado.queue";
    public static final String PEDIDO_EXCHANGE = "pedido.exchange";
    public static final String PEDIDO_ROUTING_KEY = "pedido.criado";

    @Bean
    public Queue pedidoQueue(){
        return new Queue(PEDIDO_CRIADO_QUEUE, false);
    }

    @Bean
    public DirectExchange pedidoExchange(){
        return new DirectExchange(PEDIDO_EXCHANGE);
    }

    @Bean
    public Binding binding(Queue pedidoQueue, DirectExchange pedidoExchange){
        return BindingBuilder.bind(pedidoExchange).to(pedidoExchange).with(PEDIDO_ROUTING_KEY);
    }
}
