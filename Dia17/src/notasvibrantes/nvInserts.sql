use notasVibrantes;

insert into Cliente(nombre,apellido,correo,telefono)
values
('Brayan','Maldonado','brayanmaldonado0805@gmail.com','3249021361'),
('Jerxon','Correa','correofalso@gmail.com', 3103903374),
('Jaime','Barrera','correito@gmail.com', 3205776949),
('Stiven','Sanchez','correoxddd@gmail.com', 3110933387),
('Mildred','Ortega','correosuperfalso@gmail.com',3248753015);

insert into Concierto (id, nombre, artista, fecha, lugar, precioBase) 
VALUES
(1, 'Rock en la Ciudad', 'Coldplay', '2024-06-15', 'Estadio Nacional', 250.00),
(2, 'Voces del Alma', 'Adele', '2024-07-20', 'Arena Metropolitana', 300.00),
(3, 'Reggaeton Fest', 'Bad Bunny', '2024-08-10', 'Parque Central', 180.50),
(4, 'Noche de Jazz', 'Norah Jones', '2024-09-05', 'Teatro Municipal', 150.75),
(5, 'Pop Explosion', 'Dua Lipa', '2024-10-22', 'Auditorio Central', 275.00);

insert into Zona (id, nombreZona, capacidad, precioAdicional)  
values  
(1, 'General', 5000, 0.00),  
(2, 'Preferencial', 2000, 20.00),  
(3, 'VIP', 1000, 50.00),  
(4, 'Platino', 500, 100.00),  
(5, 'Palco', 200, 150.00);   

insert into Ticket (id_cliente, id_concierto, id_zona, precioFinal, fechaCompra) 
VALUES
(1, 1, 1, 250.00, '2024-02-01'),
(2, 1, 3, 300.00, '2024-02-02'),
(3, 2, 2, 320.00, '2024-02-03'),
(4, 2, 4, 400.00, '2024-02-04'),
(5, 3, 5, 330.50, '2024-02-05'),
(1, 3, 1, 180.50, '2024-02-06'),
(2, 4, 2, 170.75, '2024-02-07'),
(3, 4, 3, 200.75, '2024-02-08'),
(4, 5, 4, 375.00, '2024-02-09'),
(5, 5, 5, 425.00, '2024-02-10');