alter table clientes add column procurador_id bigint;

alter table clientes
add constraint fk_clientes_procurador
foreign key (procurador_id) references usuarios(id);