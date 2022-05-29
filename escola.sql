create database escola;

use escola;

create table aluno (
id_aluno int not null auto_increment,
nome varchar(100),
senha varchar(30),
turma varchar(10),
perfil enum("Aluno", "Professor", "Administrador"),
primary key (id_aluno));

insert into aluno(nome, senha, turma, perfil)
values("Guilherme","12345", "3001", "Aluno");

select * from aluno;
