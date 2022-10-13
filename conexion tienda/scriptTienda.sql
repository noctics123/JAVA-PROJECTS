DROP DATABASE IF EXISTS bdTienda;
CREATE DATABASE bdTienda;
USE bdTienda;


#
# creación tabla 'Cliente'
#

DROP TABLE IF EXISTS cliente;
CREATE TABLE IF NOT EXISTS cliente (
  dni char(8) NOT NULL, #99999999
  nomc varchar(50),
  apec varchar(50),
  celular int(9),
  correo varchar(50),
  direccion varchar(50),
  PRIMARY KEY (dni)
);

#
# insercion datos tabla 'cliente'
#

INSERT INTO cliente(dni,nomc,apec,celular,correo,direccion) VALUES ("45216897","Luis","Andrade","956235896","landrede@gmail.com","Obere Str. 57");
INSERT INTO cliente(dni,nomc,apec,celular,correo,direccion) VALUES ("55218963","Maria","Diaz","986986369","mdiaz@gmail.com","Avda. de la Constitución 2222");
INSERT INTO cliente(dni,nomc,apec,celular,correo,direccion) VALUES ("95218759","Pedro","Martinez","975859689","pmartinez@gmail.com","Mataderos  2312");
INSERT INTO cliente(dni,nomc,apec,celular,correo,direccion) VALUES ("65369741","Martin","Perez","963696385","mperez@gmail.com","120 Hanover Sq.");
INSERT INTO cliente(dni,nomc,apec,celular,correo,direccion) VALUES ("30215698","Lucia","Quiroz","925892589","lquiroz@gmailo.com","Cerrito 333");

#
# creación tabla 'cargo'
#

DROP TABLE IF EXISTS cargo;
CREATE TABLE IF NOT EXISTS cargo(
	codc varchar(4) NOT NULL, #C001
    cargo varchar(50),
    PRIMARY KEY (codc)
);

#
# insercion datos tabla 'cargo'
#

INSERT INTO cargo(codc,cargo) VALUES ("C001","Administrador");
INSERT INTO cargo(codc,cargo) VALUES ("C002","Cajero");
INSERT INTO cargo(codc,cargo) VALUES ("C003","Vendedor");

#
# creación tabla 'mpago'
#

DROP TABLE IF EXISTS mpago;
CREATE TABLE IF NOT EXISTS mpago(
	codmp varchar(5) NOT NULL, #MP001
    pago varchar(50),
    PRIMARY KEY (codmp)
);

#
# insercion datos tabla 'mpago'
#

INSERT INTO mpago(codmp,pago) VALUES ("MP001","Efectivo");
INSERT INTO mpago(codmp,pago) VALUES ("MP002","Tarjeta");

#
# creación tabla 'marca'
#

DROP TABLE IF EXISTS marca;
CREATE TABLE IF NOT EXISTS marca(
	codm varchar(4) NOT NULL, #M001
    marca varchar(50),
    PRIMARY KEY (codm)
);

#
# insercion datos tabla 'marca'
#

INSERT INTO marca(codm,marca) VALUES ("M001","Samsung");
INSERT INTO marca(codm,marca) VALUES ("M002","Xiaomi");
INSERT INTO marca(codm,marca) VALUES ("M003","Huawei");
INSERT INTO marca(codm,marca) VALUES ("M004","Apple");
INSERT INTO marca(codm,marca) VALUES ("M005","Nokia");

#
# creación tabla 'tipo'
#

DROP TABLE IF EXISTS tipo;
CREATE TABLE IF NOT EXISTS tipo(
	codt varchar(4) NOT NULL, #T001
    tipo varchar(50),
    PRIMARY KEY (codt)
);

#
# insercion datos tabla 'tipo'
#

INSERT INTO tipo(codt,tipo) VALUES ("T001","Celular");
INSERT INTO tipo(codt,tipo) VALUES ("T002","Audífonos");
INSERT INTO tipo(codt,tipo) VALUES ("T003","Mica");
INSERT INTO tipo(codt,tipo) VALUES ("T004","Carcasa");
INSERT INTO tipo(codt,tipo) VALUES ("T005","Cargador");

#
# creación tabla 'empleado'
#

DROP TABLE IF EXISTS empleado;
CREATE TABLE IF NOT EXISTS empleado(
	code varchar(7) NOT NULL, #EMP001
    nome varchar(50),
    apee varchar(50),
    dni varchar(8),
    celular int(9),
	correo varchar(50),
    codc varchar (4),
    usuario varchar(50),
    contraseña varchar(50),
    PRIMARY KEY (code),
    FOREIGN KEY (codc) REFERENCES cargo(codc)
);

#
# insercion datos tabla 'empleado'
#

INSERT INTO empleado(code,nome,apee,dni,celular,correo,codc,usuario,contraseña) VALUES ("EMP001","Dariel","Contreras","85629586","985698523","dcontreras@gmail.com","C001","dcontreras","85629586");
INSERT INTO empleado(code,nome,apee,dni,celular,correo,codc,usuario,contraseña) VALUES ("EMP002","Dilan","Castro","48567891","985632569","dcastro@gmail.com","C002","dcastro","48567891");
INSERT INTO empleado(code,nome,apee,dni,celular,correo,codc,usuario,contraseña) VALUES ("EMP003","Gianni","Duarte","36521589","986598369","gduarte@gmail.com","C003","gduarte","36521589");
INSERT INTO empleado(code,nome,apee,dni,celular,correo,codc,usuario,contraseña) VALUES ("EMP004","Daniela","Diaz","15487548","989659689","ddiaz@gmail.com","C003","ddiaz","15487548");
INSERT INTO empleado(code,nome,apee,dni,celular,correo,codc,usuario,contraseña) VALUES ("EMP005","Geraldine","Flores","59685965","963154874","gflores@gmail.com","C002","gflores","59685965");

#
# creación tabla 'producto'
#

DROP TABLE IF EXISTS producto;
CREATE TABLE IF NOT EXISTS producto(
	codp varchar(6) NOT NULL, #PRD001
    codm varchar(4),
    codt varchar(4),
    descripcion varchar(50),
    precio decimal(8,2),
    stock int,
    PRIMARY KEY (codp),
    FOREIGN KEY (codm) REFERENCES marca(codm),
    FOREIGN KEY (codt) REFERENCES tipo(codt)
);

#
# insercion datos tabla 'producto'
#

INSERT INTO producto(codp,codm,codt,descripcion,precio,stock) VALUES ("PRD001","M002","T001","Celular Xiaomi","459.00","50");
INSERT INTO producto(codp,codm,codt,descripcion,precio,stock) VALUES ("PRD002","M005","T004","Carcasa Nokia","15.50","50");
INSERT INTO producto(codp,codm,codt,descripcion,precio,stock) VALUES ("PRD003","M003","T002","Audifonos Huawei","52.90","50");
INSERT INTO producto(codp,codm,codt,descripcion,precio,stock) VALUES ("PRD004","M001","T005","Cargador Samsung","25.00","50");
INSERT INTO producto(codp,codm,codt,descripcion,precio,stock) VALUES ("PRD005","M004","T003","Mica Apple","20.00","50");

#
# creación tabla 'boleta'
#

DROP TABLE IF EXISTS boleta;
CREATE TABLE IF NOT EXISTS boleta(
	codb varchar(5) NOT NULL, #B0001
    codmp varchar(5),
    fecha date,
    dni varchar(8),
    code varchar(7),
    subtotal decimal(8,2),
    igv decimal(8,2),
    total decimal(8,2),
    PRIMARY KEY (codb), 
    FOREIGN KEY (codmp) REFERENCES mpago(codmp),
    FOREIGN KEY (dni) REFERENCES cliente(dni),
    FOREIGN KEY (code) REFERENCES empleado(code)
);

#
# insercion datos tabla 'boleta'
#

INSERT INTO boleta(codb,codmp,fecha,dni,code,subtotal,igv,total) VALUES ("B0001","MP001","2020-06-13","45216897","EMP002","15.50","2.79","18.29");
INSERT INTO boleta(codb,codmp,fecha,dni,code,subtotal,igv,total) VALUES ("B0002","MP002","2020-06-13","95218759","EMP005","25.00","4.50","29.50");
INSERT INTO boleta(codb,codmp,fecha,dni,code,subtotal,igv,total) VALUES ("B0003","MP002","2020-06-13","55218963","EMP002","20.00","3.60","23.60");
INSERT INTO boleta(codb,codmp,fecha,dni,code,subtotal,igv,total) VALUES ("B0004","MP001","2020-06-13","65369741","EMP004","459.00","82.62","541.62");
INSERT INTO boleta(codb,codmp,fecha,dni,code,subtotal,igv,total) VALUES ("B0005","MP001","2020-06-13","30215698","EMP003","52.90","9.52","62.42");

#
# creación tabla 'detalle boleta'
#

DROP TABLE IF EXISTS detboleta;
CREATE TABLE IF NOT EXISTS detboleta(
	codb varchar(5),
    codp varchar(6),
    cantidad int,
    FOREIGN KEY (codb) REFERENCES boleta(codb),
    FOREIGN KEY (codp) REFERENCES producto(codp)
);

#
# insercion datos tabla 'detboleta'
#

INSERT INTO detboleta(codb,codp,cantidad) VALUES ("B0001","PRD002","1");
INSERT INTO detboleta(codb,codp,cantidad) VALUES ("B0002","PRD004","1");
INSERT INTO detboleta(codb,codp,cantidad) VALUES ("B0003","PRD005","1");
INSERT INTO detboleta(codb,codp,cantidad) VALUES ("B0004","PRD001","1");
INSERT INTO detboleta(codb,codp,cantidad) VALUES ("B0005","PRD003","1");