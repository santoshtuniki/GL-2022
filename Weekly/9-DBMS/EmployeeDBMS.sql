/* delete database if it exists */
drop database if exists employee_DBMS;

/* create database employee_DBMS */
create database employee_DBMS;

/* use database employee_DBMS */
use employee_DBMS;

/* delete table if exists */
drop table if exists emp_details;

/* create table emp_details */
create table emp_details(id int, name varchar(50), department varchar(50), salary int);

/* renaming table (2 different ways) */
alter table emp_details rename to employee_details;
rename table employee_details to emp_details;

/* insert values into table */
insert into emp_details values(1,"Aman","IT",10000);
insert into emp_details values(2,"Brinda","HR",80000);
insert into emp_details values(3,"Chinamayi","IT",120000);
insert into emp_details values(4,"Deepak","Admin",90000);
insert into emp_details values(5,"Ekta","HR",75000);
insert into emp_details values(6,"Himanshu","Customer Support",60000);
insert into emp_details(id,name,department,salary) values(7,"Ganga","IT",10000);

/* display values in table */
select * from emp_details;
select name from emp_details;

/* update values in table */
update emp_details set salary=12500 where id=7;
update emp_details set name="Ajit" where id=3;
select * from emp_details;

/* delete values from table */
insert into emp_details values(8,"random","random",14000);
select * from emp_details;
delete from emp_details where id=8;
select * from emp_details;
