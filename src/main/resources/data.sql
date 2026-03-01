INSERT INTO profesor (nombre) VALUES ('Carlos');
INSERT INTO profesor (nombre) VALUES ('Ana');
INSERT INTO profesor (nombre) VALUES ('Luis');
INSERT INTO profesor (nombre) VALUES ('Miguel');
INSERT INTO profesor (nombre) VALUES ('Angel');

INSERT INTO materia (nombre, id_profesor) VALUES ('Matematicas', 1);
INSERT INTO materia (nombre, id_profesor) VALUES ('ciencias', 2);
INSERT INTO materia (nombre, id_profesor) VALUES ('Programacion', 3);
INSERT INTO materia (nombre, id_profesor) VALUES ('BaseDatos', 4);
INSERT INTO materia (nombre, id_profesor) VALUES ('Redes', 5);

INSERT INTO alumno (nombre, apellido) VALUES ('alexandra', 'Perez');
INSERT INTO alumno (nombre, apellido) VALUES ('Maria', 'Gomez');
INSERT INTO alumno (nombre, apellido) VALUES ('Mario', 'Lopez');
INSERT INTO alumno (nombre, apellido) VALUES ('Sofia', 'Martinez');
INSERT INTO alumno (nombre, apellido) VALUES ('Pedro', 'Ramirez');

INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (1,1);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (2,2);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (3,3);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (4,4);
INSERT INTO alumno_materia (id_alumno, id_materia) VALUES (5,5);