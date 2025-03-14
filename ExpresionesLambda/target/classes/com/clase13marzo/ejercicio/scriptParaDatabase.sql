create database liga;
use liga;

create table jugadores(
    id int not null AUTO_INCREMENT primary key,
    nombre varchar(40),
    edad int
);

-- Ejemplo de inserción de datos
insert into jugadores(nombre, edad) values('Juan', 20);
insert into jugadores(nombre, edad) values('Pedro', 21);
insert into jugadores(nombre, edad) values('Maria', 22);
insert into jugadores(nombre, edad) values('Jose', 23);
insert into jugadores(nombre, edad) values('Ana', 24);
insert into jugadores(nombre, edad) values('Luis', 25);
insert into jugadores(nombre, edad) values('Carlos', 26);
insert into jugadores(nombre, edad) values('Sofia', 27);
insert into jugadores(nombre, edad) values('Fernando', 28);
insert into jugadores(nombre, edad) values('Laura', 29);
insert into jugadores(nombre, edad) values('Ricardo', 30);
insert into jugadores(nombre, edad) values('Carmen', 31);
insert into jugadores(nombre, edad) values('Javier', 32);