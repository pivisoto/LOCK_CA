DROP DATABASE dbcalok;
CREATE DATABASE dbcalok;
USE dbcalok;
CREATE TABLE IF NOT EXISTS usuario(
	idUsuario INTEGER NOT NULL AUTO_INCREMENT,
    ra VARCHAR(10) NOT NULL UNIQUE,
    email VARCHAR(50) NOT NULL,
	senha VARCHAR(30) NOT NULL,
    tipo BOOL DEFAULT FALSE,
    CONSTRAINT PK_Usuario PRIMARY KEY (idUsuario)
);

CREATE TABLE IF NOT EXISTS material(
	idMaterial INTEGER NOT NULL UNIQUE AUTO_INCREMENT,
    material VARCHAR(50) NOT NULL,
    quantidade VARCHAR(10) NOT NULL,
    disp BOOLEAN NOT NULL,
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

CREATE TABLE IF NOT EXISTS feedback(
    idFeedback INTEGER NOT NULL AUTO_INCREMENT,
    idMaterial INTEGER NOT NULL,
    idUsuario INTEGER NOT NULL,
    feedback VARCHAR(100) NOT NULL,
    FOREIGN KEY (idUsuario)
        REFERENCES usuario (idUsuario),
    FOREIGN KEY (idMaterial)
        REFERENCES material (idMaterial),
    CONSTRAINT PK_Feedback PRIMARY KEY (idFeedback)
);
insert into usuario values (null, 22.00865-9, "123@gmail.com","senha", True);
insert into material values (null, "kit sinuca", "1", True);
insert into feedback values (null, 1, 1,"mensagem");