create database MSC
use MSC

create table fabricantesHLR(
	idFabricante int not null IDENTITY(1,1) primary key,
	fabricante varchar(10) not null
);
insert into fabricantesHLR values('XIAOMI')
insert into fabricantesHLR values('IPHONE')
insert into fabricantesHLR values('SAMSUNG')
insert into fabricantesHLR values('HUAWEI')
insert into fabricantesHLR values('GOOGLE')

create table serviciosHLR(
	idServicio int not null IDENTITY(1,1) primary key,
	servicio varchar(3) not null
);
insert into serviciosHLR values('VOZ')
insert into serviciosHLR values('SMS')
insert into serviciosHLR values('MMS')

create table tarifasHLR(
	idTarifa int not null IDENTITY(1,1) primary key,
	tarifa varchar(15) not null
);
insert into tarifasHLR values('PREPAGO')
insert into tarifasHLR values('POSPAGO')

create table proveedoresHLR(
	idProveedor int not null primary key,
	proveedor varchar(10) not null
);
insert into proveedoresHLR values(90, 'TELCEL')
insert into proveedoresHLR values(20, 'AT&T')


create table usuariosHLR(
	idUsuario varchar(10) not null primary key,
	numeroAbonado varchar(4) not null,
	mnc int not null references proveedores(idProveedor),
	tipoPlan int not null references tarifas(idTarifa),
	idEquipo int not null references fabricantes(idFabricante),
	imei varchar(5) not null,
);