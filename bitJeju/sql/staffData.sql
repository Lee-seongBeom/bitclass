drop table staffData;
create table staffData(
	mid varchar2(12) not null unique,
	mpw  varchar2(8) not null,
	mlev number(2) not null,
	mname varchar2(16) not null,
	tcode varchar2(2)
);
insert into staffData (mid,mpw,mlev,mname) values ('admin1','ad11234',20,'������1');
insert into staffData (mid,mpw,mlev,mname) values ('admin2','ad21234',20,'������2');
insert into staffData (mid,mpw,mlev,mname) values ('admin3','ad31234',20,'������3');
insert into staffData (mid,mpw,mlev,mname) values ('sales1','sa11234',30,'������1');
insert into staffData (mid,mpw,mlev,mname) values ('sales2','sa21234',30,'������2');
insert into staffData (mid,mpw,mlev,mname) values ('employ','em1234',40,'�����');
insert into staffData values ('teacher1','tea11234',50,'���μ�','t1');
insert into staffData values ('teacher2','tea21234',50,'������','t2');
insert into staffData values ('teacher3','tea31234',50,'Ȳ����','t3');
commit