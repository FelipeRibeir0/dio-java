CREATE INDEX idx_nome ON usuarios (nome);

EXPLAIN
SELECT * FROM usuarios WHERE nome = 'João Silva';