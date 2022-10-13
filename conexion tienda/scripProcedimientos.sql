#USE bdtienda;
#SELECT*FROM empleado;
#SELECT ifnull(RIGHT(MAX(codm),3),0)+1 FROM marca;
#SELECT ifnull(RIGHT(MAX(codp),3),0)+1 FROM producto;
#SELECT ifnull(RIGHT(MAX(code),3),0)+1 FROM empleado;
#SELECT lpad(6,3,'0')
# numero, longitud, relleno


#DROP PROCEDURE bdtienda.adicionM
#generar codigo de marca
DELIMITER @@
CREATE PROCEDURE bdtienda.adicionM
(marca varchar(50))
BEGIN
declare cuenta int;
declare cod char(4);
SELECT ifnull(RIGHT(MAX(codm),3),0)+1 into cuenta FROM marca;
SET cod=concat('M',Lpad(cuenta,3,'0'));
INSERT INTO marca VALUES(cod,marca);
end @@
DELIMITER ;

#DROP PROCEDURE bdtienda.adicionE
#generar codigo de empleado
DELIMITER @@
CREATE PROCEDURE bdtienda.adicionE
(nome varchar(50), apee varchar(50), dni varchar(8), celular int(9), correo varchar(50), codc varchar (4), usuario varchar(50), contraseña varchar(50))
BEGIN
declare cuenta int;
declare cod char(6);
SELECT ifnull(RIGHT(MAX(code),3),0)+1 into cuenta FROM empleado;
SET cod=concat('EMP',Lpad(cuenta,3,'0'));
INSERT INTO empleado VALUES(cod,nome,apee,dni,celular,correo,codc,usuario,contraseña);
end @@
DELIMITER ;

#DROP PROCEDURE bdtienda.adicionP
#generar codigo de producto
DELIMITER @@
CREATE PROCEDURE bdtienda.adicionP
(codm varchar(4), codt varchar(4), descripcion varchar(50), precio decimal(8,2), stock int)
BEGIN
declare cuenta int;
declare cod char(6);
SELECT ifnull(RIGHT(MAX(codp),3),0)+1 into cuenta FROM producto;
SET cod=concat('PRD',Lpad(cuenta,3,'0'));
INSERT INTO producto VALUES(cod,codm,codt,descripcion,precio,stock);
end @@
DELIMITER ;