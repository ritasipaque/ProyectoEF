CREATE DATABASE final;
USE final;
CREATE TABLE usuarios
(
  id int(11) auto_increment PRIMARY KEY ,
  usuario varchar(10) ,
  password varchar(45) ,
  nombre varchar(60) ,
  email varchar(30) ,
  idTipo int(11) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE ventaencabezado
(
id int(30) auto_increment PRIMARY KEY ,
documento_ventas varchar(15) ,
codigo_cliente varchar(60) ,
fecha_venta varchar(20),
total_venta varchar(20),
estatus_venta varchar(30)  
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE ventadetalle
(
id int(30) auto_increment PRIMARY KEY ,
docuemento_venta varchar(10) ,
codigo_producto varchar(20) ,
cantidad_venta varchar(20) ,
costo_centa varchar(20) ,
precio_venta varchar(20) ,
codigo_bodega varchar(20)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE bodega
(
id int(30) auto_increment PRIMARY KEY ,
codigo_bodega varchar(20) ,
nombre_bodega varchar(20) ,
estatus_bodega varchar(20) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE compras_detalle
(
id int(30) auto_increment PRIMARY KEY ,
documento_compra varchar(20) ,
codigo_producto varchar(20) ,
cantidad_compra varchar(15) ,
codigo_bodega varchar(20) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE compras_encabezado
(
id int(30) auto_increment PRIMARY KEY ,
documento_compra varchar(20) ,
codigo_proveedor varchar(20) ,
fecha_compra varchar(20) ,
total_compra varchar(20) ,
estatus_compra varchar(20) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE proveedores
(
id int(30) auto_increment PRIMARY KEY ,
codigo_proveedor varchar(20) ,
nombre_proveedor varchar(20) ,
direccion_proveedor varchar(20) ,
telefono_proveedor varchar(20) ,
nit_proveedor varchar(20) ,
estatus_proveedor varchar(20) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE existencia
(
id int(30) auto_increment PRIMARY KEY ,
codigo_bodega varchar(20),
codigo_producto varchar(20),
saldo_existencia varchar(20)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE lineas
(
id int(30) auto_increment PRIMARY KEY ,
codigo_linea varchar(20),
nombre_linea varchar(20),
estatus_linea  varchar(20)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE marcas
(
id int(30) auto_increment PRIMARY KEY ,
codigo_marca varchar(20),
nombre_marca varchar(20),
estatus_marca varchar(20)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE vendedores
(
id int(30) auto_increment PRIMARY KEY ,
codigo_vendedor varchar(20) ,
nombre_vendedor varchar(20) ,
direccion_vendedor varchar(20) ,
telefono_vendedor varchar(20) ,
nit_vendedor varchar(20) ,
estatus_vendedor varchar(20) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE clientes
(
id int(30) auto_increment PRIMARY KEY ,
codigo_cliente varchar(20) ,
nombre_cliente varchar(20) ,
direccion_cliente varchar(20) ,
telefono_cliente varchar(20) ,
nit_clienter varchar(20) ,
estatus_cliente varchar(20) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE productos
(
id int(30) auto_increment PRIMARY KEY ,
codigo_producto varchar(20) ,
nombre_producto varchar(20) ,
codigo_linea varchar(20) ,
 codigo_marca varchar(20) ,
existencia_producto  varchar(20) ,
estatus_producto varchar(20) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;













