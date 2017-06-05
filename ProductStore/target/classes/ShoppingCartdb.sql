create database productstore;

CREATE TABLE IF NOT EXISTS product_catalog (
  id int(5) NOT NULL AUTO_INCREMENT,
  sku varchar(10) NOT NULL,
  name varchar(60) NOT NULL,
  description varchar(200) NOT NULL,
  quantity int(5) NOT NULL,
  price  DECIMAL(7,2) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB;

 CREATE TABLE IF NOT EXISTS product_order( 
 order_id int(5) NOT NULL AUTO_INCREMENT,
 customer_id int(5) NOT NULL,
 order_date DATE, 
order_status varchar(10),
PRIMARY KEY(order_id))ENGINE=InnoDB;



CREATE TABLE IF NOT EXISTS product_order_detail (
  id int(5) NOT NULL AUTO_INCREMENT,
  product_id int(5) NOT NULL,
  quantity int(5) NOT NULL,
  order_id  int(5),
  PRIMARY KEY (id),
  FOREIGN KEY (order_id) REFERENCES product_order(order_id)
) ENGINE=InnoDB;


CREATE TABLE IF NOT EXISTS address (
  id int(5) NOT NULL AUTO_INCREMENT,
  address1 varchar(60) NOT NULL,
  address2 varchar(60),
  city varchar(25),
 state varchar(25),
  country varchar(25),
  zipcode varchar(15),
  PRIMARY KEY (id)
) ENGINE=InnoDB ;


CREATE TABLE IF NOT EXISTS creditcard_details 
(   id int(5) NOT NULL AUTO_INCREMENT, 
  cardholder_name varchar(30) NOT NULL, 
  card_number varchar(60) NOT NULL,
   expiry_year int(4) NOT NULL, 
 expiry_month varchar(15) NOT NULL,
cvv int(3) NOT NULL ,
PRIMARY KEY (id) ) ENGINE=InnoDB;

CREATE TABLE IF NOT EXISTS customer (
  id int(5) NOT NULL AUTO_INCREMENT,
  first_name varchar(30) NOT NULL,
  middle_name varchar(30) ,
  last_name varchar(30) NOT NULL,
   payment_id int(5),
address_id int(5),
  PRIMARY KEY (id),
  FOREIGN KEY (payment_id) REFERENCES creditcard_details(id),
  FOREIGN KEY (address_id) REFERENCES address(id)
)ENGINE=InnoDB;

ALTER TABLE product_order ADD CONSTRAINT fk_customer_id FOREIGN KEY (customer_id) REFERENCES customer(id);






