/*
CREATE TABLE usuarios_nova (
  id INT,
  nome VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL UNIQUE,
  dataNascimento DATE NOT NULL,
  endereco VARCHAR(100) NOT NULL
);

-- INSERÇÃO EM MASSA

INSERT INTO usuarios_nova (id, nome, email, dataNascimento, endereco)
SELECT id, nome, email, dataNascimento, endereco
FROM usuarios;

-- DROP TABLE usuarios;

-- ALTER TABLE usuarios_nova RENAME TO usuarios

JEITO MAIS SIMPLES

ALTER TABLE usuarios ALTER COLUMN endereco TYPE VARCHAR(150);
*/