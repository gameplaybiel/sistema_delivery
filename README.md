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

Todos os microsserviços se comunicam entre si de forma **assíncrona via RabbitMQ** e possuem **seus próprios bancos de dados PostgreSQL**, garantindo o **princípio de independência de dados** nos microservices.

---

## 🗂️ Arquitetura do Sistema de Delivery

![Arquitetura do Microsserviço.png](Arquitetura%20do%20Microsservi%C3%A7o.png)

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
- 
---

## 🧑‍💻 Autor

Gabriel – Desenvolvedor Full Stack Java 💻  
Esse sistema foi desenvolvido **individualmente**, como parte do Trabalho de Conclusão de Curso.  
Mesmo sem equipe, com apoio técnico do orientador, todos os microsserviços foram desenvolvidos e integrados com sucesso.

---
