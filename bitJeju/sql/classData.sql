drop table classData;
create table classData(
	classCode number(2) primary key,
	className varchar2(100) not null,
	startDay date not null,
	endDay date not null,
	teacher varchar2(15) not null,
	max number(3) default 30,
	tcode varchar2(2)
);
insert into classData values (1, 'NCS기반의 웹 개발자 양성 과정', sysdate, sysdate, '설민석', 30, 't0');
insert into classData values (2, 'Java기반의 웹 개발자 양성 과정', sysdate, sysdate, '정승제', 30, 't0');
insert into classData values (3, '인공지능 개발자 양성 과정', sysdate, sysdate, '황현필', 30, 't0');
commit