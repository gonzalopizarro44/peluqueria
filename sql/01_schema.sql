-- ================================================
--   BASE DE DATOS: Sistema de Turnos Peluquería
--   Autor: Gonzalo Pizarro
--   Fecha: 2025
-- ================================================

-- ================================================
-- 1. TABLA USUARIOS
-- Roles:
-- 1 = cliente
-- 2 = barbero
-- 3 = admin
-- ================================================

CREATE TABLE usuarios (
    id BIGSERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    dni INT NOT NULL UNIQUE,
    email VARCHAR(200) NOT NULL UNIQUE,
    password VARCHAR(200) NOT NULL,
    rol SMALLINT NOT NULL DEFAULT 1,
    fecha_creacion TIMESTAMP DEFAULT NOW()
);

-- ================================================
-- 2. TABLA ESTADOS DE TURNOS
-- ================================================

CREATE TABLE estados_turnos (
    id SMALLINT PRIMARY KEY,
    nombre_estado VARCHAR(50) NOT NULL UNIQUE
);

INSERT INTO estados_turnos (id, nombre_estado) VALUES
(1, 'disponible'),
(2, 'reservado'),
(3, 'completado'),
(4, 'cancelado');

-- ================================================
-- 3. TABLA TURNOS
-- Un turno pertenece a un barbero (que es un usuario rol=2)
-- UNIQUE garantiza que no haya doble reserva para
-- mismo barbero + fecha + hora
-- ================================================

CREATE TABLE turnos (
    id BIGSERIAL PRIMARY KEY,

    barbero_id BIGINT NOT NULL REFERENCES usuarios(id),
    fecha DATE NOT NULL,
    hora TIME NOT NULL,

    dni_cliente INT REFERENCES usuarios(dni),

    id_estado SMALLINT NOT NULL DEFAULT 1 REFERENCES estados_turnos(id),

    precio NUMERIC(8,2),
    fecha_reserva TIMESTAMP DEFAULT NOW(),
    version INT DEFAULT 0,

    UNIQUE (barbero_id, fecha, hora)
);

-- ================================================
-- 4. INSERTS DE USUARIOS (ADMIN, BARBEROS, CLIENTE)
-- ================================================

-- ADMIN
INSERT INTO usuarios (nombre, apellido, dni, email, password, rol)
VALUES ('admin', 'admin', 123, 'admin@peluqueria.com', 'admin123', 3);

-- BARBEROS
INSERT INTO usuarios (nombre, apellido, dni, email, password, rol)
VALUES
('barbero1', 'barbero1', 1234, 'carlos@peluqueria.com', '1234', 2),
('barbero2', 'barbero2', 12345, 'martin@peluqueria.com', '1234', 2),
('barbero3', 'barbero3', 123456, 'diego@peluqueria.com', '1234', 2);

-- CLIENTE DE PRUEBA
INSERT INTO usuarios (nombre, apellido, dni, email, password, rol)
VALUES ('cliente', 'cliente', 123123, 'gonza@cliente.com', '1234', 1);

-- ================================================
-- FIN DEL SCRIPT
-- ================================================
