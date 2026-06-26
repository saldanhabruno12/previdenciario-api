create table usuarios(
    id bigint not null auto_increment,
    login text not null unique,
    password text not null,
    role text not null
)