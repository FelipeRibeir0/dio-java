CREATE TABLE reservas (
id INT,
id_usuario INT,
id_destino INT,
data DATE,
status VARCHAR(255) DEFAULT 'Pendente'
);

COMMENT ON COLUMN reservas.id IS 'Identificador único da reserva';
COMMENT ON COLUMN reservas.id_usuario IS 'Referência ao ID do usuário que fez a reserva';
COMMENT ON COLUMN reservas.id_destino IS 'Referência ao ID do destino da reserva';
COMMENT ON COLUMN reservas.data IS 'Data de reserva';
COMMENT ON COLUMN reservas.status IS 'Status da reserva (confirmada, pendente, cancelada, etc)';