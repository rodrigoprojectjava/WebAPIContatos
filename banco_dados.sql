create database bd_usuarios;

use bd_usuarios;

create table usuario {
	id				integer auto_increment primary key,
	nome			varchar(200) not null,
	email			varchar(200) not null unique,
	senha			text not null,
	telefone		varchar(15) not null,
};

insert into usuario values (null, 'teste1', 'teste1@teste.com','1234','12345678910');

select * from usuario;