
Create database bdproyecto;
use bdproyecto;

CREATE TABLE empleados (
    id INT NOT NULL PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100),
    cargo VARCHAR(100),
    telefono VARCHAR(15),
    direccion VARCHAR(255),
    sueldo DECIMAL(10, 2)
);

CREATE TABLE ventas (
    id INT NOT NULL PRIMARY KEY NOT NULL AUTO_INCREMENT,
    empleado_id INT,
    monto_total DECIMAL(10, 2),
    FOREIGN KEY (empleado_id) REFERENCES empleados(id)
);

INSERT INTO empleados (nombre, cargo, telefono, direccion, sueldo) 
VALUES ('Juan Perez', 'Gerente de Ventas', '123-456-7890', 'Calle Principal 123', 5000.00);

INSERT INTO empleados (nombre, cargo, telefono, direccion, sueldo) 
VALUES ('Maria Rodriguez', 'Asistente Administrativo', '987-654-3210', 'Avenida Central 456', 3000.00);

INSERT INTO empleados (nombre, cargo, telefono, direccion, sueldo) 
VALUES ('Pedro Gomez', 'Analista de Sistemas', '555-555-5555', 'Calle Secundaria 789', 4500.00);

INSERT INTO empleados (nombre, cargo, telefono, direccion, sueldo) 
VALUES ('Laura Martinez', 'Contadora', '111-222-3333', 'Avenida Principal 987', 4000.00);

INSERT INTO empleados (nombre, cargo, telefono, direccion, sueldo) 
VALUES ('Carlos Sanchez', 'Técnico de Soporte', '999-888-7777', 'Calle de la Esquina 321', 3500.00);




