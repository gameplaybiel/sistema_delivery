CREATE TABLE pagamento(
    id INT PRIMARY KEY,
    total FLOAT,
    forma_pagamento VARCHAR(50)
);

INSERT INTO pagamento (id, total, forma_pagamento) VALUES (1, 150, 'Crédito');
INSERT INTO pagamento (id, total, forma_pagamento) VALUES (2, 1500, 'Débito');