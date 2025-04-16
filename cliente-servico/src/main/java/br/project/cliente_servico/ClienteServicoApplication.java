package br.project.cliente_servico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration;

@SpringBootApplication(exclude = SslAutoConfiguration.class)
public class ClienteServicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienteServicoApplication.class, args);
	}

}
