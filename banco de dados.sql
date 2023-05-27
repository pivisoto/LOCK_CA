DROP DATABASE dbcalok;
CREATE DATABASE dbcalok;
USE dbcalok;
CREATE TABLE IF NOT EXISTS usuario(
	idUsuario INTEGER NOT NULL AUTO_INCREMENT,
    ra VARCHAR(10) NOT NULL UNIQUE,
    email VARCHAR(50) NOT NULL UNIQUE,
	senha VARCHAR(30) NOT NULL,
    CONSTRAINT PK_Usuario PRIMARY KEY (idUsuario)
);

CREATE TABLE IF NOT EXISTS material(
	idMaterial INTEGER NOT NULL UNIQUE AUTO_INCREMENT,
    material VARCHAR(50) NOT NULL,
    quantidadeTotal INTEGER NOT NULL,
    quantidadeDisponivel integer not null,
	CONSTRAINT PK_Material PRIMARY KEY (idMaterial)
);

CREATE TABLE emprestimo(
	idEmprestimo integer not null unique auto_increment,
	idMaterial INTEGER ,
    idUsuario INTEGER NOT NULL,
    codigo integer not null unique,
    dia datetime default now() not null,
    horario time not null,
    retorno bool not null,
    FOREIGN KEY (idMaterial) REFERENCES material(idMaterial),
	 FOREIGN KEY (idUsuario)
        REFERENCES usuario (idUsuario),
	CONSTRAINT PK_Emprestimo PRIMARY KEY (idEmprestimo)
);

CREATE TABLE IF NOT EXISTS feedback(
    idFeedback INTEGER NOT NULL unique AUTO_INCREMENT,	
    idEmprestimo INTEGER NOT NULL UNIQUE,
    feedback VARCHAR(100) NOT NULL,
    FOREIGN KEY (idEmprestimo)
        REFERENCES emprestimo (idEmprestimo),
    CONSTRAINT PK_Feedback PRIMARY KEY (idFeedback)
);
insert into usuario values (1,"22.00865-9", "123@gmail.com","senha");
insert into material values (null, "kit sinuca", "1", True);
insert into emprestimo values(null,1,1,1,default,current_time(),true);
insert into emprestimo values(null,1,1,2,default,current_time(),true);
insert into feedback values (null, 1,"uma bolinha faltando");