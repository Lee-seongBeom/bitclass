DROP TABLE employ;
DROP sequence employ_seq;
CREATE sequence employ_seq start with 1;
CREATE TABLE employ
(
    employNum    NUMBER(5)         NOT NULL,
    writer		 VARCHAR2(30)		NOT NULL,
    title        VARCHAR2(120)      NOT NULL, 
    company      VARCHAR2(90)      NOT NULL, 
    dueDate      DATE              NOT NULL, 
    contents     VARCHAR2(3000)    NOT NULL
);
insert into employ values (
employ_seq.nextval,'채용팀', '한라 소프트웨어 구인공고', '한라 소프트웨어', TO_DATE('2020-08-02', 'RRRR-MM-DD'),'안녕하세요. 한라 소프트에서 자바 백엔드 개발자를 구합니다. 이메일 hanla@hansoft.com으로 이력서 보내주세요');
insert into employ values (
employ_seq.nextval,'채용팀', '제주 소프트웨어 구인공고', '제주 소프트웨어', TO_DATE('2020-08-02', 'RRRR-MM-DD'),'안녕하세요. 한라 소프트에서 자바 백엔드 개발자를 구합니다. 이메일 hanla@hansoft.com으로 이력서 보내주세요');
insert into employ values (
employ_seq.nextval,'채용팀', '감귤 소프트웨어 구인공고', '감귤 소프트웨어', TO_DATE('2020-08-02', 'RRRR-MM-DD'),'안녕하세요. 한라 소프트에서 자바 백엔드 개발자를 구합니다. 이메일 hanla@hansoft.com으로 이력서 보내주세요');

commit