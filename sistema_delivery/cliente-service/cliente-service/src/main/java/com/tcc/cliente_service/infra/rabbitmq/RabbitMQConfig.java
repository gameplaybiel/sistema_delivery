package com.tcc.cliente_service.infra.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    public static final String CLIENTE_CRIADO_QUEUE = "cliente.criado.queue";
    public static final String CLIENTE_EXCHANGE = "cliente.exchange";
    public static final String CLIENTE_ROUTING_KEY = "cliente.criado.queue";

    @Bean
    public MessageConverter jsonMessageConverter(){
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public Queue clienteQueue(){
        return new Queue(CLIENTE_CRIADO_QUEUE, true);
    }

    @Bean
    public DirectExchange clienteExchange(){
        return new DirectExchange(CLIENTE_EXCHANGE);
    }

    @Bean
    public Binding binding(Queue clienteQueue, DirectExchange clienteExchange){
        return BindingBuilder.bind(clienteQueue).to(clienteExchange).with(CLIENTE_ROUTING_KEY);
    }
}
