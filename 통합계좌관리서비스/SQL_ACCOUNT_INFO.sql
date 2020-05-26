-- users 테이블
CREATE TABLE USERS(
    NAME VARCHAR2(10),
    ID VARCHAR(20) PRIMARY KEY,
    PWD VARCHAR(20),
    SEQ NUMBER,
    REG_DATE DATE
);
-- account 테이블
CREATE TABLE ACCOUNT(
    NAME VARCHAR2(10),
    ID VARCHAR(20),
    ACCOUNT_NUMBER VARCHAR(20),
    BALANCE NUMBER,
    BANK_CODE VARCHAR(3),
    BANK_NAME VARCHAR(30),
    NICKNAME VARCHAR(50)
);

-- 제약조건 추가

alter table ACCOUNT
add constraint ACCOUNT_ck_BAL 
check (BALANCE >= 0);

--로그인 쿼리

SELECT ID, PWD, NAME, REG_DATE
FROM USERS
WHERE ID = ? AND PWD = ? ;

--아이디 중복 확인 쿼리

SELECT ID
FROM USERS
WHERE ID = ?;

--회원가입 쿼리 

insert into USERS(ID, PWD, NAME) 
 values(?,?,?) ;

--은행 등록 쿼리 
insert into ACCOUNT(BANK_NAME, ACCOUNT_NUMBER, NAME, ID, BALANCE, BANK_CODE, NICKNAME
values(?,?,?,?,?,?,?);

--계좌번호를 삭제하는 기능 쿼리

delete from  ACCOUNT 
where ACCOUNT_NUMBER = ? and ID = ?;

--내 전체계좌를 조회하는 기능 쿼리

SELECT * FROM ACCOUNT WHERE NAME = ?;

--입력한 계좌번호로 계좌를 조회하는 기능

select *  from ACCOUNT where account_number = ? and name = ?;

--계좌이체에서 계좌 학인하는 기능쿼리

select * from ACCOUNT where account_number = ? and name = ?;

--입력한 은행의  계좌를 조회하는 기능

select *from ACCOUNT where bank_name = ? and name = ?;

--계좌 번호로 계좌를 선택하여 계좌 별명 수정하기

update ACCOUNT  set NICKNAME = ?  where ID = ? and ACCOUNT_NUMBER = ?;

--계좌에 입금하는 기능

UPDATE ACCOUNT SET BALANCE = BALANCE + ?  WHERE ACCOUNT_NUMBER = ? and BANK_NAME = ? ;

--계좌에서 출금하는 기능

UPDATE ACCOUNT SET BALANCE = BALANCE - ? WHERE ACCOUNT_NUMBER = ? and BANK_NAME = ?;

--다른 계좌로 송금하는 기능

UPDATE ACCOUNT SET BALANCE = BALANCE - ? WHERE ACCOUNT_NUMBER = ? ;
UPDATE ACCOUNT SET BALANCE = BALANCE + ? WHERE ACCOUNT_NUMBER = ? ;
