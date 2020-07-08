drop table bbs01;
drop sequence bbs01_seq;
--
create table bbs01(
	num number primary key,
	sub varchar2(30) default '제목없음',
	nalja date,
	id varchar2(30),
	cntnt varchar2(2000)
);
--dummy date
create sequence bbs01_seq;
insert into bbs01 (num,sub,nalja,id,cntnt) values (bbs01_seq.nextval,'제목1',sysdate,'user1','내용없음');
insert into bbs01 (num,sub,nalja,id,cntnt) values (bbs01_seq.nextval,'제목2',sysdate,'user2','내용없음');
insert into bbs01 (num,sub,nalja,id,cntnt) values (bbs01_seq.nextval,'제목3',sysdate,'user2','내용없음');
insert into bbs01 (num,sub,nalja,id,cntnt) values (bbs01_seq.nextval,'제목4',sysdate,'user1','내용없음');
insert into bbs01 (num,sub,nalja,id,cntnt) values (bbs01_seq.nextval,'제목5',sysdate,'user2','내용없음');
insert into bbs01 (num,sub,nalja,id,cntnt) values (bbs01_seq.nextval,'',sysdate,'user1','내용없음');


commit;