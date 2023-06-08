create database MSC;

insert into fabricanteshlr(fabricante) values('XIAOMI');
insert into fabricanteshlr(fabricante) values('IPHONE');
insert into fabricanteshlr(fabricante) values('SAMSUNG');
insert into fabricanteshlr(fabricante) values('HUAWEI');
insert into fabricanteshlr(fabricante) values('GOOGLE');

insert into servicioshlr(servicio) values('VOZ');
insert into servicioshlr(servicio)  values('SMS');
insert into servicioshlr(servicio)  values('MMS');

insert into tarifashlr(id_tarifa,tarifa) values(1,'PREPAGO');
insert into tarifashlr(id_tarifa,tarifa) values(2,'POSPAGO');

insert into proveedoreshlr(id_proveedor,proveedor) values(90, 'TELCEL');
insert into proveedoreshlr(id_proveedor,proveedor) values(20, 'AT&T');
drop table usuarios;
create table usuarios(
	id_usuario varchar(10) not null,
	numero_abonado varchar(4) not null,
	mnc int not null,
	tipo_plan int not null,
	id_equipo int not null,
	imei varchar(5) not null,
    primary key(id_usuario)
);


INSERT INTO `msc`.`usuarios`(`id_usuario`,`numero_abonado`,`mnc`,`tipo_plan`,`id_equipo`,`imei`) VALUES ('andres','4585',90,1,1,'12345');
INSERT INTO `msc`.`usuarios`(`id_usuario`,`numero_abonado`,`mnc`,`tipo_plan`,`id_equipo`,`imei`) VALUES ('diego','0110',20,2,4,'67890');
INSERT INTO `msc`.`usuarios`(`id_usuario`,`numero_abonado`,`mnc`,`tipo_plan`,`id_equipo`,`imei`) VALUES ('victor','3578',90,1,3,'10021');
INSERT INTO `msc`.`usuarios`(`id_usuario`,`numero_abonado`,`mnc`,`tipo_plan`,`id_equipo`,`imei`) VALUES ('abigail','3063',90,1,2,'23150');
INSERT INTO `msc`.`usuarios`(`id_usuario`,`numero_abonado`,`mnc`,`tipo_plan`,`id_equipo`,`imei`) VALUES ('abdiel','1527',90,1,5,'67542');
INSERT INTO `msc`.`usuarios`(`id_usuario`,`numero_abonado`,`mnc`,`tipo_plan`,`id_equipo`,`imei`) VALUES ('ana','2991',20,1,1,'87921');


