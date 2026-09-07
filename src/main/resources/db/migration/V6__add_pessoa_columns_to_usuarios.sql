DELETE FROM clientes;
DELETE FROM usuarios;

alter table usuarios
    add column nome varchar(255) not null,
    add column email varchar(255),
    add column cpf varchar(255) not null;