CREATE TABLE entrega (
    id INT PRIMARY KEY,
    endereco_entrega VARCHAR(255),
    rastreamento VARCHAR(255),
    status VARCHAR(255),
    data_envio TIMESTAMP,
    data_entrega TIMESTAMP
);

INSERT INTO entrega (id, endereco_entrega, rastreamento, status, data_envio, data_entrega)
VALUES(1, 'Avenida Paulista, 445', 'R12345BR', 'EM_TRANSITO', '2025-04-17 14:14:00', '2025-05-17 13:00:00');

INSERT INTO entrega (id, endereco_entrega, rastreamento, status, data_envio, data_entrega)
VALUES(2, 'Avenida José Marion, 205', 'R12436BR', 'ENTREGUE', '2025-04-18 14:00:00', '2025-05-17 13:00:00');