-- 게시판 테이블 생성
create table t_board(
    no  number(5) primary key
    , title varchar2(200) not null
    , writer varchar2(100) not null
    , reg_date date default sysdate
);

-- 게시판 일련번호 생성
create sequence seq_t_board_no;