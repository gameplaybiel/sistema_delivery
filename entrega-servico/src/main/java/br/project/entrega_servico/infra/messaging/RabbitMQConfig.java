package br.project.entrega_servico.infra.messaging;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    public static final String ENTREGA_CRIADO_QUEUE = "entrega.criado.queue";
    public static final String ENTREGA_EXCHANGE = "entrega.exchange";
    public static final String ENTREGA_ROUTING_KEY = "entrega.criado";

    @Bean
    public Queue entregaQueue(){
        return new Queue(ENTREGA_CRIADO_QUEUE, false);
    }

    @Bean
    public DirectExchange entregaExchange(){
        return new DirectExchange(ENTREGA_EXCHANGE);
    }

    @Bean
    public Binding binding(Queue entregaQueue, DirectExchange entregaExchange){
        return BindingBuilder.bind(entregaExchange).to(entregaExchange).with(ENTREGA_ROUTING_KEY);
    }
}
