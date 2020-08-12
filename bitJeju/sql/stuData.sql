drop table studata;
drop sequence stuData_seq;
create sequence stuData_seq start with 1;
create table stuData(
   hakbun number(4) primary key,
   name varchar2(15) not null,
   id varchar2(12) not null unique,
   pw varchar2(8) not null,
   phoneNumber varchar2(11),
   lev number(2) default 1,
   classCode number(2),
   gradeJava number(3),
   gradeWeb number(3),
   gradeFrame number(3),
   rate number(4,1)
);
--select * from stuData where id='qwe' and pw='1234';
commit