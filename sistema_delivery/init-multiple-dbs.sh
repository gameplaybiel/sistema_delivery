#!/bin/bash
set -e

# Lista de bancos que queremos criar
for db in cliente-db pedido-db pagamento-db; do
  echo "Criando banco: $db"
  psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL
    CREATE DATABASE "$db";
EOSQL
done
