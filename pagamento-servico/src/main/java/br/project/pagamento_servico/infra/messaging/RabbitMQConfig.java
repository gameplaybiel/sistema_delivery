package br.project.pagamento_servico.infra.messaging;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    public static final String PAGAMENTO_CRIADO_QUEUE = "pagamento.criado.queue";
    public static final String PAGAMENTO_EXCHANGE = "pagamento.exchange";
    public static final String PAGAMENTO_ROUTING_KEY = "pagamento.criado";

    @Bean
    public Queue pagamentoQueue(){
        return new Queue(PAGAMENTO_CRIADO_QUEUE, false);
    }

    @Bean
    public DirectExchange pagamentoExchange(){
        return new DirectExchange(PAGAMENTO_EXCHANGE);
    }

    @Bean
    public Binding binding(Queue pagamentoQueue, DirectExchange pagamentoExchange){
        return BindingBuilder.bind(pagamentoQueue).to(pagamentoExchange).with(PAGAMENTO_ROUTING_KEY);
    }
}

