-- 오라클 객체(OBJECT)
-- 1. DBA_XXXX
-- 2. ALL_XXXX
-- 3. USER_XXXX :  자신의 계정이 소유한 객체 등에 관한 정보 조회
-- 오라클 KH 계정
SELECT CONSTRAINT_NAME FROM USER_CONSTRAINTS;
-- sys계정
SELECT USERNAME FROM DBA_USERS;
-- VIEW 생성 권한 부여
-- sys계정
GRANT CREATE VIEW TO KH;

-- VIEW 생성
CREATE VIEW V_EMPLOYEE(사번,이름,부서,지역)
AS SELECT EMP_ID, EMP_NAME, DEPT_TITLE, NATIONAL_NAME
FROM EMPLOYEE
LEFT JOIN DEPARTMENT ON (DEPT_ID=DEPT_CODE)
LEFT JOIN LOCATION ON (LOCATION_ID=LOCAL_CODE)
LEFT JOIN NATIONAL USING(NATIONAL_CODE);

SELECT * FROM V_EMPLOYEE;

CREATE VIEW EMP_VIEW (주민번호,이름,이메일,폰번호)
AS SELECT EMP_NO, EMP_NAME, EMAIL, PHONE
FROM EMPLOYEE;
DROP VIEW EMP_VIEW;
SELECT * FROM EMP_VIEW;

-- 뷰 갱신(수정)
CREATE OR REPLACE VIEW EMP_VIEW(이름,이메일,폰번호)
AS SELECT EMP_NAME, EMAIL, PHONE
FROM EMPLOYEE;

-- 원본테이블 변경시 뷰 데이터 조회 
-- EMPLOYEE 테이블 하동운 -> 하동훈
UPDATE EMPLOYEE 
SET EMP_NAME = '하동훈'
WHERE EMP_NAME = '하동운';
COMMIT;

SELECT * FROM EMPLOYEE;
SELECT * FROM EMP_VIEW;

-- EMP_VIEW 테이블에서 하동훈 -> 하동운
UPDATE EMP_VIEW
SET "이름" = '하동운'
WHERE "이름" = '하동훈';
SELECT * FROM EMPLOYEE;
SELECT * FROM EMP_VIEW;
COMMIT;

-- JOIN VIEW 생성
CREATE VIEW V_EMPLOYEE(사번,이름,부서,지역)
AS SELECT EMP_ID, EMP_NAME, DEPT_TITLE, NATIONAL_NAME
FROM EMPLOYEE
LEFT JOIN DEPARTMENT ON (DEPT_ID=DEPT_CODE)
LEFT JOIN LOCATION ON (LOCATION_ID=LOCAL_CODE)
LEFT JOIN NATIONAL USING(NATIONAL_COSDE);

-- 산술 표현식으로 VIEW 생성
CREATE OR REPLACE VIEW EMP_SAL_VIEW(이름,연봉)
AS SELECT EMP_NAME, SALARY*12
FROM EMPLOYEE;
SELECT * FROM EMP_SAL_VIEW;
-- 이런 경우 VIEW 테이블을 조작한다하더라도 원본 테이블을 바꿀 수 없다.

--SEQUENCE 실습
CREATE SEQUENCE SEQ_USERNO;
DELETE FROM SHOP_MEMBER;
COMMIT;
SELECT * FROM SHOP_MEMBER;
INSERT INTO SHOP_MEMBER
VALUES(1, 'user01', 'pass01','홍길동',
'남','010-2222-3333','hong123@iei.or.kr');
ROLLBACK;
INSERT INTO SHOP_MEMBER
VALUES(SEQ_USERNO.NEXTVAL, 'user01', 'pass01','홍길동',
'남','010-2222-3333','hong123@iei.or.kr');
INSERT INTO SHOP_MEMBER
VALUES(SEQ_USERNO.NEXTVAL, 'user02', 'pass02','뽕길동',
'남','010-2222-3553','bbong123@iei.or.kr');
-- 현재 시퀀스 값 확인하기
SELECT SEQ_USERNO.CURRVAL FROM DUAL;
SELECT SEQ_USERNO_SECOND.CURRVAL FROM DUAL;

CREATE SEQUENCE SEQ_USERNO_SECOND
START WITH 3
INCREMENT BY 2
MAXVALUE 3000
NOCYCLE;
DROP SEQUENCE SEQ_USERNO_SECOND;
INSERT INTO SHOP_MEMBER
VALUES(SEQ_USERNO_SECOND.NEXTVAL, 'user03', 'pass03','고길동',
'남','010-2322-3333','dong123@iei.or.kr');

SELECT * FROM SHOP_MEMBER ORDER BY 1;

--##  시퀀스 간단 예제 ##
--KH_MEMBER 테이블을 생성
--컬럼
--MEMBER_ID	NUNBER
--MEMBER_NAME	VARCHAR2(20)
--MEMBER_AGE	NUMBER
--MEMBER_JOIN_COM	NUMBER

--이때 해당 사원들의 정보를 INSERT 해야 함
--ID 값과 JOIN_COM은 SEQUENCE 를 이용하여 정보를 넣고자 함

--ID값은 500 번 부터 시작하여 10씩 증가하여 저장 하고자 함
--JOIN_COM 값은 1번부터 시작하여 1씩 증가하여 저장 해야 함
--(ID 값과 JOIN_COM 값의 MAX는 10000으로 설정)

--	MEMBER_ID	MEMBER_NAME	MEMBER_AGE	MEMBER_JOIN_COM	
--	500		      홍길동		   20		     1
--	510		      김말똥		   30		     2
--	520		      삼식이		   40		     3
--	530		      고길똥		   24		     4
CREATE TABLE KH_MEMBER(  
    MEMBER_ID NUMBER,
    MEMBER_NAME VARCHAR2(20),
    MEMBER_AGE NUMBER,
    MEMBER_JOIN_COM NUMBER
);

CREATE SEQUENCE SEQ_MEMBERID
START WITH 500
INCREMENT BY 10
MAXVALUE 10000;

CREATE SEQUENCE SEQ_MEM_JOINCOM
START WITH 1
INCREMENT BY 1
MAXVALUE 10000;

INSERT INTO KH_MEMBER
VALUES(SEQ_MEMBERID.NEXTVAL, '홍길동', 20, SEQ_MEM_JOINCOM.NEXTVAL);
INSERT INTO KH_MEMBER
VALUES(SEQ_MEMBERID.NEXTVAL, '삼식이', 40, SEQ_MEM_JOINCOM.NEXTVAL);
INSERT INTO KH_MEMBER
VALUES(SEQ_MEMBERID.NEXTVAL, '김말똥', 30, SEQ_MEM_JOINCOM.NEXTVAL);
INSERT INTO KH_MEMBER
VALUES(SEQ_MEMBERID.NEXTVAL, '고길똥', 24, SEQ_MEM_JOINCOM.NEXTVAL);
SELECT * FROM KH_MEMBER;