SQL commands to Run DB

-- create database authdb;
 
-- create database userdb;
 
-- create database vehicledb;
 
-- create database bookingdb;
 
-- create database centerdb;
 
-- create database invoicedb;
 
use authdb;
select * from users;
truncate table users;
use userdb;
select * from users;
truncate table users;
delete from users where id=5;
use vehicledb;
truncate table vehicle;
select * from vehicle;
use bookingdb;
select * from bookings;
truncate table bookings;
use centerdb;
select * from service_center;
truncate table mechanic;
truncate table service_center;
select * from service_center;
truncate table service_type;
use invoicedb;
