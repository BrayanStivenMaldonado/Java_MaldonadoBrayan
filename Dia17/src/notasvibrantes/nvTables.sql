drop database if exists notasVibrantes;
create database notasVibrantes;

use notasVibrantes;

create table Cliente(
    nombre varchar(50) not null,
    apellido varchar(50) not null,
    correo varchar(50) not null,
    telefono varchar(12)
);

create table Concierto(
    id int not null primary key,
    nombre varchar(50) not null,
    artista varchar(50) not null,
    fecha date not null,
    lugar varchar(50) not null,
    precioBase decimal(10,2)
);

create table Zona(
    id int not null primary key,
    nombreZona varchar(50) not null,
    capacidad int not null,
    precioAdicional decimal(10,2)
);

create table Ticket(
    id int not null primary key auto_increment,
    id_cliente int,
    id_concierto int,
    id_zona int,
    precioFinal decimal(10,2),
    fechaCompra date,
    foreign key (id_cliente) references Cliente(id),
    foreign key (id_concierto) references Concierto(id),
    foreign key(id_zona) references Zona(id)
); 