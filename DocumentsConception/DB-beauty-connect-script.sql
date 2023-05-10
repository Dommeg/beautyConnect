create table customer (
	customer_id int generated always as identity ,
	username varchar (50) not null,
	password varchar (50) not null,
	email varchar (50) not null,
	primary key(customer_id)
);

create table appointment (
	appointment_id int generated always as identity ,
	appointment_date datetime not null,
	primary key(appointment_id),
	constraint fk_customer
		foreign key (customer_id)
		references customer(customer_id),
	constraint fk_professionnel
		foreign key (pro_id)
		references professionnel(pro_id)
);

create table professionnel (
	pro_id int generated always as identity  ,
	name varchar(50) not null,
	location varchar (100) not null,
	open datetime,
	close datetime,
	primary key(pro_id)
);