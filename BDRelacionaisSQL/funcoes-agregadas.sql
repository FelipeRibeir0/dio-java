/* Funções Agregadas

SELECT COUNT(*) AS total_usuarios FROM usuarios us INNER JOIN reservas rs ON us.id = id_usuario;

SELECT MAX(EXTRACT(YEAR FROM AGE(CURRENT_DATE, dataNascimento))) AS maior_idade
FROM usuarios;

=================================================================

Agrupamento de Resultados


SELECT COUNT(*), id_destino FROM reservas
GROUP by id_destino;

=================================================================

Ordenação de Resultados
*/

SELECT COUNT(*) AS qtd_reservas, id_destino FROM reservas
GROUP BY id_destino
ORDER BY qtd_reservas DESC, id_destino ASC;