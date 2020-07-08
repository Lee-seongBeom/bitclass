-- constraint 제약하다
-- 제약조건명 지정
-- 지정방식 : 테이블명_컬럼명_조건
-- 조건 ->
-- 	primary key = pk	중복x,not null
--	unique = uq	중복x
-- 	not null = nn	not null
--	foreign key = fk	
-- create table ex19(
--	num number constraint ex19_num_pk primary key,
--	name varchar2(15),
-- );

create table ex19(
	num number,
	name varchar2(15),
	constraint ex19_num_pk primary key(num)
);