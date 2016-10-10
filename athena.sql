--create database --
create database athenaeum_db;

use athenaeum_db;
show tables;

create table student(std_id varchar(20) not null primary key,
firstname varchar(50) not null,
lastname varchar(50) ,
father_name varchar(50),
contact_number varchar(10) not null,
type_of_proof_id varchar(40),
shift_slot varchar(25) not null,
is_fee_deposit boolean default false,
date_of_joining date not null,
fee_expire_date date,
seat_number int not null
);


insert into student values("ATH01","rahul","test","","9786123341","voter","EVENING",true,'2016-09-30','2016-10-30',25);
select * from sudent;


create table users(
userid varchar(20) not null,
password varchar(30) not null,
isAdmin boolean default false,
std_id varchar(20) REFERENCES Student(std_id)
);

insert into users(userid ,password,std_id) values("Rahulb9","rahulrock","AT01");

select * from users;