drop table staffData;
create table staffData(
	mid varchar2(12) not null unique,
	mpw  varchar2(8) not null,
	mlev number(2) not null,
	mname varchar2(16) not null,
	tcode varchar2(2)
);
insert into staffData (mid,mpw,mlev,mname) values ('admin1','ad11234',20,'ÇàÁ¤ÆÀ1');
insert into staffData (mid,mpw,mlev,mname) values ('admin2','ad21234',20,'ÇàÁ¤ÆÀ2');
insert into staffData (mid,mpw,mlev,mname) values ('admin3','ad31234',20,'ÇàÁ¤ÆÀ3');
insert into staffData (mid,mpw,mlev,mname) values ('sales1','sa11234',30,'¿µ¾÷ÆÀ1');
insert into staffData (mid,mpw,mlev,mname) values ('sales2','sa21234',30,'¿µ¾÷ÆÀ2');
insert into staffData (mid,mpw,mlev,mname) values ('employ','em1234',40,'Ãë¾÷ÆÀ');
insert into staffData values ('teacher1','tea11234',50,'¼³¹Î¼®','t1');
insert into staffData values ('teacher2','tea21234',50,'Á¤½ÂÁ¦','t2');
insert into staffData values ('teacher3','tea31234',50,'È²ÇöÇÊ','t3');
commit