# Sistema de Delivery

---

## Descrição do Projeto
Este projeto é um sistema de gerenciamento de pedidos e clientes para um serviço de delivery. A arquitetura é baseada em **microsserviços**, utilizando **RabbitMQ** para a comunicação assíncrona entre os serviços. Todo o sistema é orquestrado com **Docker Compose** para facilitar o ambiente de desenvolvimento e implantação.

## Arquitetura
A arquitetura do sistema é composta por três serviços principais que se comunicam através de filas de mensagens. Um proxy reverso NGINX atua como um gateway de API para rotear as requisições.

* **`cliente-service`**: Gerencia o cadastro e informações dos clientes.
* **`pedido-service`**: Recebe e gerencia os pedidos.
* **`pagamento-service`**: Processa as transações de pagamento.

**Tecnologias Utilizadas:**
* **Backend**: Java, Spring Boot, Spring Data JPA
* **Banco de Dados**: PostgreSQL
* **Mensageria**: RabbitMQ
* **Infraestrutura**: Docker, Docker Compose, NGINX

## Pré-requisitos
Certifique-se de que você tem as seguintes ferramentas instaladas em sua máquina:
* [Java Development Kit (JDK) 17](https://www.oracle.com/java/technologies/downloads/)
* [Apache Maven 3.9+](https://maven.apache.org/download.cgi)
* [Docker Desktop](https://www.docker.com/products/docker-desktop)

## Como Rodar o Projeto

1.  **Clone o Repositório:**
    ```bash
    git clone [https://github.com/gameplaybiel/sistema_delivery.git](https://github.com/gameplaybiel/sistema_delivery.git)
    cd sistema_delivery
    ```

2.  **Construa as Imagens e Suba os Contêineres:**
    Este comando irá construir as imagens Docker para cada serviço e iniciar todos os contêineres do sistema (`postgres`, `rabbitmq` e os serviços da aplicação).
    ```bash
    docker-compose up --build
    ```

3.  **Acesse a Aplicação:**
    O NGINX roteia as requisições para os serviços. Os endpoints da API estarão disponíveis através do proxy.

## Endpoints da API
Você pode usar uma ferramenta como o Postman ou Insomnia para testar os endpoints.

* **`cliente-service`**
    * `POST /clientes`: Cria um novo cliente.
    * `GET /clientes/{id}`: Busca um cliente por ID.

* **`pedido-service`**
    * `POST /pedidos`: Cria um novo pedido.
    * `GET /pedidos/{id}`: Busca um pedido por ID.

* **`pagamento-service`**
    * `POST /pagamentos`: Cria uma nova transação de pagamento.
    * `GET /pagamentos/{id}`: Busca uma transação de pagamento por ID.

## Autor
**Gabriel de Lima**
* [GitHub](https://github.com/gameplaybiel)