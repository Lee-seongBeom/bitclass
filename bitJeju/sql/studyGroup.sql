drop table studyGroup;

create table studyGroup(
	classCode number(2),
	hakbun number(4) primary key,
	name varchar2(15) not null,
	gradeJava number(3),
	gradeWeb number(3),
	gradeFrame number(3),
	totalDay number(3),
	missDay number(3),
	tardy number(3),
	tcode varchar2(2)
);
insert into studyGroup values (1,1,'user1',90,80,70,90,3,0,'t1');
insert into studyGroup values (1,2,'user2',90,80,70,90,5,0,'t1');
insert into studyGroup values (1,3,'user3',90,80,70,90,0,3,'t1');
insert into studyGroup values (1,4,'user4',90,80,70,90,0,4,'t1');
insert into studyGroup values (1,5,'user5',90,80,70,90,3,2,'t1');
insert into studyGroup values (1,6,'user6',90,80,70,90,2,1,'t1');
insert into studyGroup values (1,7,'user7',90,80,70,90,5,1,'t1');
insert into studyGroup values (1,8,'user8',90,80,70,90,1,0,'t1');
insert into studyGroup values (1,9,'user9',90,80,70,90,2,0,'t1');
insert into studyGroup values (1,10,'user10',90,80,70,90,0,2,'t1');
commit