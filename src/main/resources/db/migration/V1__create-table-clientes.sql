create table clientes (

    id bigint not null auto_increment,
    nome varchar(100) not null,
    cpf varchar(11) not null unique,
    email varchar(100) not null unique,
    logradouro varchar(100) not null,
    numero varchar(10) not null,
    cep varchar (8) not null,
    cidade varchar(100) not null,
    estado varchar(100) not null,
    complemento varchar(100),

    primary key(id)

);