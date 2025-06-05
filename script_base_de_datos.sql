-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS Monster_Hunter_World CHARACTER SET utf8 COLLATE utf8_general_ci;

-- Entrar a la base de datos
USE Monster_Hunter_World;

-- Crear la tabla Monstruo
CREATE TABLE IF NOT EXISTS Monstruo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(25) NOT NULL,
    imagen VARCHAR(500),
    clase VARCHAR(25),
    elementos VARCHAR(30),
    estado VARCHAR(100),
    elementos_debil VARCHAR(30),
    habitat VARCHAR(50),
    parientes VARCHAR(50),
    generacion VARCHAR(20)
);

-- Crear un usuario y contraseña para acceder a la base de datos
CREATE USER IF NOT EXISTS 'cazador'@'localhost' IDENTIFIED BY 'ElHachaCargadaEsLoMejor';

-- Otorgar permisos al usuario para hacer cambios en la base de datos
GRANT SELECT, INSERT, UPDATE, DELETE ON Monster_Hunter_World.* TO 'cazador'@'localhost';

-- Actualiza los privilegios
FLUSH PRIVILEGES;
