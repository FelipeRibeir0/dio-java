CREATE TABLE destinos (
id INT,
nome VARCHAR(255) NOT NULL UNIQUE,
descricao VARCHAR(255) NOT NULL
);

COMMENT ON COLUMN destinos.nome IS 'Nome do destino';
COMMENT ON COLUMN destinos.descricao IS 'Descrição do destino';