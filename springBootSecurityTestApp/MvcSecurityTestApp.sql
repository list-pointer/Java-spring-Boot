create database MvcSecurityTestApp;
use MvcSecurityTestApp;
create table UserData(Id int,UserName varchar(20),password varchar(20));
insert into UserData values(1,"abhi","1234"),(2,"rishab","5678");
select * from UserData;

-- drop database MvcSecurityTestApp;
-- update UserData SET id=1 where UserName="rishab";
-- ALTER table UserData
-- ADD id long;

-- SET SQL_SAFE_UPDATES = 0;