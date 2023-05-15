CREATE DATABASE dbcalok;
USE calok;
CREATE TABLE IF NOT EXISTS usuario(
	idUsuario INTEGER NOT NULL,
    ra VARCHAR(20) NOT NULL UNIQUE,
    email VARCHAR(50) NOT NULL,
	senha VARCHAR(30) NOT NULL,
    tipo BOOL DEFAULT FALSE,
    PRIMARY KEY (idUsuario),
    CONSTRAINT PK_Usuario PRIMARY KEY (idUsuario)
);

CREATE TABLE IF NOT EXISTS material(
	idMaterial INTEGER NOT NULL UNIQUE,
    material VARCHAR(50) NOT NULL,
    quantidade VARCHAR(10) NOT NULL,
    disp BOOLEAN NOT NULL,
    PRIMARY KEY (idMaterial),
	CONSTRAINT PK_Material PRIMARY KEY (idMaterial)
);

CREATE TABLE validar(
	PK_Material VARCHAR(50) NOT NULL,
    PK_idUsuario INTEGER NOT NULL,
    auto BOOLEAN NOT NULL    
);

CREATE TABLE IF NOT EXISTS usuarioMaterial(
    idUsuario INTEGER NOT NULL AUTO_INCREMENT,
    idMaterial INTEGER NOT NULL,
    FOREIGN KEY (idUsuario)
        REFERENCES usuario (idUsuario),
    FOREIGN KEY (idMaterial)
        REFERENCES material (idMaterial)
);
