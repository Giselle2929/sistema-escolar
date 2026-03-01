CREATE TABLE profesor (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

CREATE TABLE materia (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    id_profesor BIGINT,
    CONSTRAINT fk_materia_profesor
        FOREIGN KEY (id_profesor) REFERENCES profesor(id)
);

CREATE TABLE alumno (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL
);

CREATE TABLE alumno_materia (
    id_alumno BIGINT NOT NULL,
    id_materia BIGINT NOT NULL,
    PRIMARY KEY (id_alumno, id_materia),
    CONSTRAINT fk_alumno
        FOREIGN KEY (id_alumno) REFERENCES alumno(id),
    CONSTRAINT fk_materia
        FOREIGN KEY (id_materia) REFERENCES materia(id)
);