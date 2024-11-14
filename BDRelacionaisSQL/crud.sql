-- CRUD: CREATE

INSERT INTO usuarios(id, nome, email, dataNascimento, endereco)
VALUES (1, 'Felipe Ribeiro', 'felipe@test.postgre.com', '2003-04-28', 'Uma rua aí')

INSERT INTO destinos (id, nome, descricao)
VALUES (1, 'Praia em Ubatuba','Praia de SP')

INSERT INTO reservas (id, id_usuario, id_destino, data, status)
VALUES (1,1,1,'2025-03-21','pendente')

INSERT INTO usuarios (id, nome, email, dataNascimento, endereco) 
VALUES (2, 'João Silva', 'joao@example.com', '1990-05-15', 'Rua A, 123, Cidade X, Estado Y'),
(3, 'Maria Santos', 'maria@example.com', '1985-08-22', 'Rua B, 456, Cidade Y, Estado Z'),
(3, 'José Fernando', 'jose@example.com', '1983-02-21', 'Rua A, 343, Cidade X, Estado Y'),
(4, 'Pedro Souza', 'pedro@example.com', '1998-02-10', 'Avenida C, 789, Cidade X, Estado Y');

INSERT INTO destinos (id, nome, descricao) VALUES 
(2, 'Praia das Tartarugas', 'Uma bela praia com areias brancas e mar cristalino'),
(3, 'Cachoeira do Vale Verde', 'Uma cachoeira exuberante cercada por natureza'),
(4, 'Cidade Histórica de Pedra Alta', 'Uma cidade rica em história e arquitetura');

INSERT INTO reservas (id, id_usuario, id_destino, data, status) VALUES 
(2, 1, 2, '2023-07-10', 'confirmada'),
(3, 2, 1, '2023-08-05', 'pendente'),
(4, 3, 3, '2023-09-20', 'cancelada');

SELECT * FROM usuarios;

SELECT * FROM usuarios WHERE id = 1 AND nome LIKE '%F%';

UPDATE usuarios 
SET email = 'felipe@example.com'
WHERE id = 1;

DELETE from reservas
WHERE id = 4;

SELECT * FROM reservas;