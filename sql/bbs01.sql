drop table bbs01;
drop sequence bbs01_seq;
--
create table bbs01(
	num number primary key,
	sub varchar2(30) default '�������',
	nalja date,
	id varchar2(30),
	cntnt varchar2(2000)
);
--dummy date
create sequence bbs01_seq;
insert into bbs01 (num,sub,nalja,id,cntnt) values (bbs01_seq.nextval,'����1',sysdate,'user1','�������');
insert into bbs01 (num,sub,nalja,id,cntnt) values (bbs01_seq.nextval,'����2',sysdate,'user2','�������');
insert into bbs01 (num,sub,nalja,id,cntnt) values (bbs01_seq.nextval,'����3',sysdate,'user2','�������');
insert into bbs01 (num,sub,nalja,id,cntnt) values (bbs01_seq.nextval,'����4',sysdate,'user1','�������');
insert into bbs01 (num,sub,nalja,id,cntnt) values (bbs01_seq.nextval,'����5',sysdate,'user2','�������');
insert into bbs01 (num,sub,nalja,id,cntnt) values (bbs01_seq.nextval,'',sysdate,'user1','�������');


commit;