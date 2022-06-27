create database escola;

use escola;

create table aluno (
id_aluno int not null auto_increment,
nome varchar(100),
senha varchar(30),
turma varchar(10),
perfil enum("Aluno", "Professor", "Coordenador"),
primary key (id_aluno));

insert into aluno(nome, senha, turma, perfil)
values("Guilherme","12345", "3001", "Aluno");

insert into aluno(nome, senha, turma, perfil)
values("Felippe","12345", "3001", "Professor");

insert into aluno(nome, senha, turma, perfil)
values("William","12345", "", "Coodernador");

select * from aluno;