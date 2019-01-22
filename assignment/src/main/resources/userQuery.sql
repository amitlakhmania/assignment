CREATE TABLE USER
(
   id integer not null,
   username varchar(20) not null,
   password varchar(20) not null,
   status varchar(20) not null,
   primary key(id)
);

insert into user values(1,'AMIT','LAKHMANIA','Activated');
insert into user values(2,'Abhishek','Lakhmania','Deactivated');