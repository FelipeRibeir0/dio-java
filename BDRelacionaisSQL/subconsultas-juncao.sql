/*
SELECT * FROM usuarios us
 INNER JOIN reservas rs ON us.id = rs.id_usuario

-- INNER JOIN consulta as linhas que têm correspondência em 
ambas tabelas na junção.

SELECT * FROM usuarios us
INNER JOIN reservas rs ON us.id = rs.id_usuario
INNER JOIN destinos ds ON rs.id_destino = ds.id;

===========================================================

SELECT * FROM usuarios us
LEFT JOIN reservas rs ON us.id = rs.id_usuario

-- LEFT JOIN consulta todas as linhas na tabela
da esquerda e as que têm correspondência na da direita

===========================================================

SELECT * FROM reservas rs
RIGHT JOIN destinos ds
ON rs.id_destino = ds.id

-- RIGHT consulta todas as linhas na tabela
da direita e as que têm correspondência na da esquerda

==========================================================

Realizando subconsultas

SELECT * FROM destinos
WHERE id NOT IN (SELECT id_destino FROM reservas);

SELECT * FROM usuarios
WHERE id NOT IN (SELECT id_usuario FROM reservas);

SELECT nome,email, (SELECT COUNT(*) FROM reservas WHERE id_usuario = usuarios.id)
AS total_reservas FROM usuarios;
*/