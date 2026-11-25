create database bella_pizza;

use bella_pizza;

create table usuarios (
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
nombre VARCHAR(100) NOT NULL,
usuario VARCHAR(50) NOT NULL,
email VARCHAR(100) NOT NULL,
password VARCHAR (255) NOT NULL,
tipo VARCHAR(20) NOT NULL,
activo BOOLEAN NOT NULL
);

create table pizzas (
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
nombre VARCHAR(100) NOT NULL,
descripcion VARCHAR(255) NOT NULL,
precio DECIMAL(8,2) NOT NULL,
imagen VARCHAR (255) NOT NULL,
activa BOOLEAN NOT NULL
);

CREATE TABLE pedidos (
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
id_usuario INT NOT NULL,
id_pizza INT NOT NULL,
fecha DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
cantidad INT NOT NULL,
precio DECIMAL(8, 2) NOT NULL,
importe DECIMAL(8, 2) NOT NULL,
estado VARCHAR(30) NOT NULL DEFAULT 'Pendiente',
CONSTRAINT fk_pedidos_usuario 
FOREIGN KEY (id_usuario) REFERENCES usuarios(id),
CONSTRAINT fk_pedidos_pizza 
FOREIGN KEY (id_pizza) REFERENCES pizzas(id)
);
