/*
ALTER TABLE usuarios
ADD rua VARCHAR(100),
ADD numero VARCHAR(10),
ADD cidade VARCHAR(50),
ADD estado VARCHAR(20);

UPDATE usuarios
SET 
    rua = split_part(endereco, ',', 1),
    numero = split_part(endereco, ',', 2),
    cidade = split_part(endereco, ',', 3),
    estado = split_part(endereco, ',', 4);
*/