create database prueba;
use prueba;

create table articulo
(
	id varchar(10) not null primary key,
	nombre varchar(20) not null,
	descripcion varchar(200),
	precio decimal(10,2) not null,
	modelo varchar(10)
);