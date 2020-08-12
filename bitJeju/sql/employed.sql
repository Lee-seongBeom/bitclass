DROP TABLE employed;
DROP sequence employed_seq;
CREATE sequence employed_seq start with 1;
CREATE TABLE employed(
    employedNum     NUMBER(5)         NOT NULL, 
    title         VARCHAR2(120)      NOT NULL, 
    writer        VARCHAR2(24)      NOT NULL, 
    writedDate    DATE              NOT NULL, 
    cnt           NUMBER(4)         DEFAULT 1 not null, 
    contents      VARCHAR2(3000)
);
insert into employed values (employed_seq.nextval,'김기철(자바1기) 감귤 소프트 입사!!','채용', TO_DATE('2020-08-01', 'RRRR-MM-DD'), 555, '제주 첫 졸업생 김기철씨 감귤 소프트에 입사했어요!');
insert into employed values (employed_seq.nextval,'김일이&김이이 한라봉 솔루션 입사','채용', TO_DATE('2020-08-02', 'RRRR-MM-DD'), 555, '두 학생을 축하해주세요~');
insert into employed values (employed_seq.nextval,'김일이&김이이 한라봉 솔루션 입사','채용', TO_DATE('2020-08-03', 'RRRR-MM-DD'), 555, '두 학생을 축하해주세요~');
commit;

select * from employed;
