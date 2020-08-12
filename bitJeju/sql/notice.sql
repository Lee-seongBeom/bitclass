DROP TABLE notice;
DROP sequence notice_seq;
CREATE sequence notice_seq start with 1;
CREATE TABLE notice(
    noticeNum     NUMBER(5)         NOT NULL, 
    title         VARCHAR2(120)      NOT NULL, 
    writer        VARCHAR2(24)      NOT NULL, 
    writedDate    DATE              NOT NULL, 
    cnt           NUMBER(4)         DEFAULT 1 not null, 
    contents      VARCHAR2(3000)
);
INSERT INTO notice VALUES (notice_seq.nextval,'첫 번째 공지','관리자', TO_DATE('2020-08-01', 'RRRR-MM-DD'), 555, '안녕하세요. 첫번째 공지사항입니다');
INSERT INTO notice VALUES (notice_seq.nextval,'두 번째 공지','관리자', TO_DATE('2020-08-02', 'RRRR-MM-DD'), 300, '안녕하세요. 두번째 공지사항입니다');
INSERT INTO notice VALUES (notice_seq.nextval,'세 번째 공지','행정', TO_DATE('2020-08-02', 'RRRR-MM-DD'), 380, '안녕하세요. 세번째 공지사항입니다');

commit;

select * from notice;
