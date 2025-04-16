CREATE TABLE cliente(
    id INT PRIMARY KEY,
    nome VARCHAR(50),
    email VARCHAR(100),
    telefone VARCHAR(100)
);

INSERT INTO cliente(id, nome, email, telefone)
VALUES (1, 'Gabriel', 'gabriel@email.com', '19984418234');

INSERT INTO cliente(id, nome, email, telefone)
VALUES (2, 'Jose', 'jose@email.com', '19984428245');