create database backoffice;

use backoffice;

create table usuarios(

	id_usuarios int(5) auto_increment primary key,
    username varchar(100) not null,
    senha varchar(10) not null,
    perfil enum("administrador", "auxiliar")
);

describe usuarios;

insert into usuarios(username, senha, perfil)
values("Guilherme", "12345", "administrador");

select * from usuarios;
