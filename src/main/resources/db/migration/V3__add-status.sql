alter table clientes
add column status tinyint;

update clientes
set status = 1;

alter table clientes
modify column status tinyint not null;