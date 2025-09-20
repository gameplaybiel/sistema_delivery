# 🛵 Sistema de Delivery - TCC

Projeto prático do TCC: **“A Utilização da Arquitetura Limpa com Microserviços”**  
Este sistema de delivery foi desenvolvido com **3 microsserviços independentes**, utilizando **Spring Boot**, **Arquitetura Limpa**, **RabbitMQ** para mensageria assíncrona e **PostgreSQL** como banco de dados relacional.

---

## ⚙️ Microsserviços

- 🔹 Serviço de Cliente
- 🔹 Serviço de Pedido
- 🔹 Serviço de Pagamento

---

## 🧠 Como funciona o sistema de delivery?

Todos os microsserviços se comunicam entre si de forma **assíncrona via RabbitMQ** e possuem **seus próprios bancos de dados PostgreSQL**, garantindo o **princípio de independência de dados** nos microsserviços.

---

## ▶️ Como executar o sistema

1. **Configure e inicie o Docker**:
    - Rode o comando:
      ```bash
      docker-compose up -d
      ```

2. **Execute os microsserviços** (um por um):
    - Cliente
    - Pedido
    - Pagamento

3. **Acesse as interfaces**:
    - RabbitMQ: [http://localhost:15672](http://localhost:15672)  
      (usuário: `guest` | senha: `guest`)
    - Aplicações: geralmente acessíveis via `localhost:porta`

---

## ✅ Tecnologias Utilizadas

- Spring Boot
- Java 17
- RabbitMQ
- PostgreSQL
- Docker & Docker Compose
- Clean Architecture

---
## 🚧 Desafios enfrentados e como superei

Durante o desenvolvimento do sistema, enfrentei alguns desafios importantes:

- **Comunicação entre microsserviços de forma desacoplada**  
  Como o objetivo era evitar acoplamento direto entre os serviços, implementei a comunicação via **RabbitMQ** usando troca de mensagens assíncronas (eventos). Isso exigiu aprendizado sobre filas, exchanges e consumers, e após alguns testes e ajustes, consegui estabelecer a troca eficiente de eventos entre Pedido, Pagamento e Cliente.

- **Configuração do ambiente local com vários serviços**  
  Inicialmente, era trabalhoso subir manualmente o banco de dados e o RabbitMQ para cada serviço. Resolvi isso criando um ambiente completo com **Docker Compose**, integrando todos os containers (RabbitMQ, PostgreSQL e os microsserviços), facilitando o desenvolvimento e testes locais.

- **Separação de responsabilidades e estrutura do código**  
  Ao aplicar a **Arquitetura Limpa**, foi desafiador manter os domínios realmente desacoplados e bem organizados. Estudei referências sobre camadas (Use Cases, Entities) e fui ajustando a estrutura até que cada serviço tivesse uma base sólida, de fácil manutenção e entendimento.

Esses desafios me ajudaram a ganhar confiança na construção de sistemas distribuídos e reforçaram meu entendimento sobre boas práticas em arquitetura de software.

---

## 📚 O que eu aprendi com o projeto

- Como aplicar arquitetura limpa em um contexto de microsserviços;
- Comunicação assíncrona entre serviços usando RabbitMQ;
- Isolamento de dados com PostgreSQL por serviço;
- Criação de um ambiente local completo com Docker e Docker Compose;
- Organização de código com separação de camadas e responsabilidades.

---

## 🧑‍💻 Autor

Gabriel de Souza Conceição – Desenvolvedor Full Stack Java 💻  
Esse sistema foi desenvolvido **individualmente**, como parte do Trabalho de Conclusão de Curso.  
Mesmo sem equipe, com apoio técnico do orientador, todos os microsserviços foram desenvolvidos e integrados com sucesso.
