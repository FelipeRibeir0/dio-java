/*
ALTER TABLE reservas
ADD CONSTRAINT fk_reservas_usuarios
FOREIGN KEY (id_usuario) REFERENCES usuarios (id);

ALTER TABLE reservas
ADD CONSTRAINT fk_reservas_destinos
FOREIGN KEY (id_destino) REFERENCES usuarios (id);

ALTER TABLE reservas
ADD CONSTRAINT fk_usuarios
FOREIGN KEY (id_usuario) REFERENCES usuarios (id)
ON DELETE CASCADE
*/