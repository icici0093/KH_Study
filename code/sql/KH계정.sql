SELECT * FROM EMPLOYEE; --WHERE DEPT_CODE = 'D9';
-- WHERE EMP_NAME = '방명수';

UPDATE EMPLOYEE SET EMP_NO = '850305-1313513' WHERE EMP_NAME = '방명수';
COMMIT;

DESC EMPLOYEE;

-- 1. JOB테이블에서 JOB_NAME의 정보만 출력되도록 하시오.
SELECT JOB_NAME FROM JOB;

-- 2. DEPARTMENT테이블의 내용 전체를 출력하는 SELECT문을 작성하시오.
SELECT * FROM DEPARTMENT;

-- 3. EMPLOYEE 테이블에서 이름(EMP_NAME),이메일(EMAIL),전화번호(PHONE),고용일(HIRE_DATE)만 출력하시오
SELECT EMP_NAME, EMAIL, PHONE, HIRE_DATE FROM EMPLOYEE;

-- 4. EMPLOYEE 테이블에서 고용일(HIRE_DATE) 이름(EMP_NAME),월급(SALARY)를 출력하시오
SELECT HIRE_DATE, EMP_NAME, SALARY FROM EMPLOYEE;

-- 5. EMPLOYEE 테이블에서 월급(SALARY)이 2,500,000원이상인 사람의 EMP_NAME 과 SAL_LEVEL을 출력하시오 (힌트 : >(크다) , <(작다) 를 이용)
SELECT EMP_NAME, SAL_LEVEL, SALARY FROM EMPLOYEE WHERE SALARY >= 2500000;

-- 6. EMPLOYEE 테이블에서 월급(SALARY)이 350만원 이상이면서 JOB_CODE가 'J3' 인 사람의 이름(EMP_NAME)과 전화번호(PHONE)를 출력하시오
-- (힌트 : AND(그리고) , OR (또는))
SELECT EMP_NAME, PHONE FROM EMPLOYEE WHERE SALARY >= 3500000 and JOB_CODE = 'J3';

-- SELECT 칼럼 값 산술 연산
SELECT EMP_NAME, SALARY, SALARY*12, SALARY*BONUS FROM EMPLOYEE;

-- 컬럼 별칭 
SELECT EMP_NAME, SALARY, SALARY*12 AS "연봉", SALARY*BONUS "뽀나스" FROM EMPLOYEE;

-- 리터럴
SELECT EMP_NAME, SALARY, '원' AS "단위" FROM EMPLOYEE;

-- 간단 실습 문제
--1. EMPLOYEE 테이블에서 이름,연봉, 총수령액(보너스포함), 실수령액(총 수령액-(월급*세금 3%))가 출력되도록 하시오
SELECT EMP_NAME, SALARY*12 "연봉", SALARY*12+(SALARY*BONUS) "총수령액",
    SALARY*12+(SALARY*BONUS)-(SALARY*0.03*12) "실수령액" FROM EMPLOYEE;

-- 2. EMPLOYEE 테이블에서 이름, 근무 일수를 출력해보시오 (SYSDATE를 사용하면 현재 시간 출력)
SELECT EMP_NAME, SYSDATE-HIRE_DATE "근무일수" FROM EMPLOYEE;

-- 3. EMPLOYEE 테이블에서 20년 이상 근속자의 이름,월급,보너스율를 출력하시오-- 간단 실습 문제
SELECT EMP_NAME, SALARY, BONUS FROM EMPLOYEE WHERE (SYSDATE-HIRE_DATE)/365 >= 20;

-- DISTINCT
-- 컬럼에 포함된 중복값을 한번씩만 표시하고자 할 때 사용
SELECT DISTINCT JOB_CODE FROM EMPLOYEE;

-- 논리연산자(AND, OR)
-- 부서코드가 D6이고 급여를 2,000,000보다 많이 받는 사원의 이름, 부서코드, 급여를 조회하시오.
SELECT EMP_NAME, DEPT_CODE, SALARY FROM EMPLOYEE WHERE DEPT_CODE = 'D6' 
    and SALARY > 2000000;    
-- 부서코드가 D5 또는 급여를 3,000,000보다 많이 받는 사원의 이름, 부서코드, 급여를 조회하시오
SELECT EMP_NAME, DEPT_CODE, SALARY FROM EMPLOYEE WHERE DEPT_CODE = 'D5' 
    OR SALARY > 3000000;

-- 연결 연산자(||)
-- 여러 컬럼을 하나의 컬럼인 것 처럼 연결하거나 컬럼과 리터럴 연결
SELECT EMP_NAME || DEPT_CODE, SALARY||'원' AS "급여" FROM EMPLOYEE;

-- 비교 연산자 ( >, >=, <, <=)
-- BETWEEN A AND B
-- 급여를 3500000원 이상 받고 6000000원 이하로 받는 직원의 이름과 급여를 조회하시오.
SELECT EMP_NAME, SALARY FROM EMPLOYEE WHERE SALARY BETWEEN 3500000 AND 6000000;
-- EMPLOYEE 테이블에서 고용일이 90/01/01 ~ 01/01/01인 사원의 전체 내용을 출력하시오.
SELECT * FROM EMPLOYEE WHERE HIRE_DATE BETWEEN '90/01/01' AND '01/01/01';

-- 비교 연산자 (LIKE)
-- 비교하려는 값이 지정한 특정패턴을 만족시키면 TRUE를 리턴하는 연산자로 '%'와 '_'를 와일드카드로 사용할 수 있음
-- 와일드카드 : 아무 문자나 대체해서 사용할 수 있는 것
-- 와일드카드의 위치는 단어 앞, 뒤 모두 올 수 있음
SELECT EMP_NAME, SALARY FROM EMPLOYEE WHERE EMP_NAME LIKE '노옹철';
SELECT EMP_NAME, SALARY FROM EMPLOYEE WHERE EMP_NAME LIKE '노%';
SELECT EMP_NAME, SALARY FROM EMPLOYEE WHERE EMP_NAME LIKE '노__'; -- '_'는 자리수 ㅇㅋ
SELECT EMP_NAME, SALARY FROM EMPLOYEE WHERE EMP_NAME LIKE '%전%'; -- 전00, 00전, 0전0
SELECT EMP_NAME, SALARY FROM EMPLOYEE WHERE EMP_NAME LIKE '_전_';

-- 비교 연산자 (NOT LIKE)
SELECT EMP_ID, EMP_NAME, EMAIL FROM EMPLOYEE WHERE EMP_NAME NOT LIKE '이%';

-- 실습문제
--1. EMPLOYEE 테이블에서 이름 끝이 연으로 끝나는 사원의 이름을 출력하시오
SELECT EMP_NAME FROM EMPLOYEE WHERE EMP_NAME LIKE '%연';
--2. EMPLOYEE 테이블에서 전화번호 처음 3자리가 010이 아닌 사원의 이름, 전화번호를 출력하시오
SELECT EMP_NAME, PHONE FROM EMPLOYEE WHERE PHONE NOT LIKE '010%';
--3. EMPLOYEE 테이블에서 메일주소의 's'가 들어가면서, DEPT_CODE가 D9 또는 D6이고
--고용일이 90/01/01 ~ 00/12/01이면서, 월급이 270만원이상인 사원의 전체 정보를 출력하시오
SELECT * FROM EMPLOYEE 
    WHERE HIRE_DATE BETWEEN '90/01/01' AND '01/12/01' AND SALARY >=2700000
    AND (DEPT_CODE = 'D9' OR DEPT_CODE = 'D6') AND EMAIL LIKE '%s%';
    
-- EMPLOYEE 테이블에서 EMAIL ID 중 @ 앞자리가 5자리인 직원을 조회한다면~?!!?!
SELECT EMP_NAME, EMAIL FROM EMPLOYEE WHERE EMAIL LIKE '_____@%';

-- EMPLOYEE 테이블에서 EMAIL ID 중 '_' 앞자리가 3자리인 직원을 조회한다면!?!?
SELECT EMP_NAME, EMAIL FROM EMPLOYEE WHERE EMAIL LIKE '___#_%' ESCAPE'#';

-- 비교 연산자 (IN)
-- 비교하려는 값 목록에 일치하는 값이 있으면 TRUE를 반환하는 연산자
-- EMPLOYEE 테이블에서 DEPT_CODE가 D9 또는 D6인 직원의 이름, 급여를 출력하시오
SELECT EMP_NAME, SALARY FROM EMPLOYEE WHERE DEPT_CODE = 'D9'
    OR DEPT_CODE = 'D6';
-- 위 아래 같은 결과 
SELECT EMP_NAME, SALARY FROM EMPLOYEE WHERE DEPT_CODE IN ('D9', 'D6');

-- 비교 연산자 (IS NULL / IS NOT NULL)
-- NULL 여부를 비교하는 연산자
SELECT BONUS, MANAGER_ID FROM EMPLOYEE WHERE BONUS IS NULL;
SELECT BONUS, MANAGER_ID FROM EMPLOYEE WHERE BONUS IS NOT NULL;

-- MANAGER_ID가 없고 부서 배치(DEPT_CODE)도 받지 않은 직원의 이름 조회
SELECT EMP_NAME FROM EMPLOYEE WHERE MANAGER_ID IS NULL AND DEPT_CODE IS NULL;

-- 부서 배치를 받지 않았지만 보너스를 지급하는 직원 전체 정보 조회 
SELECT EMP_NAME FROM EMPLOYEE WHERE BONUS IS NOT NULL AND DEPT_CODE IS NULL;

-- 연산자 우선 순위
-- 여러 연산자를 사용하는 경우에 우선순위를 고려해서 사용해야 함
-- 산술 > 연결 > 비교 > IS NULL, LIKE, IN(NOT 포함) > BETWEEN AND 
-- > 논리(NOT) > 논리(AND) > 논리(OR)

-- 부서원 중 직급코드가 J7 또는 J2이고, 급여가 2,000,000원 초과인 사람의 이름,급여,직급코드 출력
SELECT EMP_NAME, SALARY, JOB_CODE FROM EMPLOYEE WHERE SALARY > 2000000 
    AND (JOB_CODE IN ('J7', 'J2'));
-- OR를 사용한 경우 
SELECT EMP_NAME, SALARY, JOB_CODE FROM EMPLOYEE WHERE SALARY > 2000000 
    AND (JOB_CODE = 'J7' OR JOB_CODE =  'J2');
    
-- ORDER BY
-- SELECT한 컬럼에 대해 정렬을 할 때 사용하는 구문
-- SELECT 구문의 가장 마지막에 작성하며, 실행순서도 가장 마지막에 수행됨
-- ASC : 오름차순 정렬
-- DESC : 내림차순 정렬 
SELECT EMP_NAME, SALARY FROM EMPLOYEE ORDER BY SALARY DESC; -- 기본적으로 오름차순(ASC)
-- DATE 과거 -> 현재(ASC)
SELECT EMP_NAME, SALARY, HIRE_DATE FROM EMPLOYEE ORDER BY HIRE_DATE;
-- NULL이 있을 때 null값이 아래로(ASC)
SELECT EMP_NAME, SALARY, BONUS FROM EMPLOYEE ORDER BY BONUS;

-- SELECT 실행 순서
-- FROM - WHERE - GROUP BY - HAVING - SELECT - ORDER BY
SELECT EMP_NAME, PHONE FROM EMPLOYEE WHERE 1 > 0 ORDER BY EMP_NAME DESC;


-- 문제1. 
-- 입사일이 5년 이상, 10년 이하인 직원의 이름,주민번호,급여,입사일을 검색하여라
SELECT EMP_NAME, EMP_NO, SALARY, HIRE_DATE FROM EMPLOYEE
    WHERE (SYSDATE - HIRE_DATE)/365 BETWEEN 5 AND 10;

-- 문제2.
-- 재직중이 아닌 직원의 이름,부서코드, 고용일, 근무기간, 퇴직일을 검색하여라 (퇴사 여부 : ENT_YN)
SELECT EMP_NAME, DEPT_CODE, HIRE_DATE, 
    (ENT_DATE-HIRE_DATE) || '일' AS "근무기간", ENT_DATE 
    FROM EMPLOYEE WHERE ENT_YN != 'N';

-- 문제3.
-- 근속년수가 10년 이상인 직원들을 검색하여
-- 출력 결과는 이름,급여,근속년수(소수점X)를 근속년수가 오름차순으로 정렬하여 출력하여라
-- 단, 급여는 50% 인상된 급여로 출력되도록 하여라.
SELECT EMP_NAME, SALARY*1.5, FLOOR((SYSDATE - HIRE_DATE)/365)||'년' "근속년수"
    FROM EMPLOYEE WHERE (SYSDATE - HIRE_DATE)/365 >= 10
    ORDER BY 3; -- 컬럼의 순서로 정렬 가능 

-- 문제4.
-- 입사일이 99/01/01 ~ 10/01/01 인 사람 중에서 급여가 2000000 원 이하인 사람의
-- 이름,주민번호,이메일,폰번호,급여를 검색 하시오
SELECT EMP_NAME, EMP_NO, EMAIL, PHONE, SALARY
    FROM EMPLOYEE WHERE (HIRE_DATE BETWEEN '99/01/01' AND '10/01/01')
    AND SALARY <= 2000000;

-- 문제5.
-- 급여가 2000000원 ~ 3000000원 인 여직원 중에서 4월 생일자를 검색하여 
-- 이름,주민번호,급여,부서코드를 주민번호 순으로(내림차순) 출력하여라
-- 단, 부서코드가 null인 사람은 부서코드가 '없음' 으로 출력 하여라.
SELECT EMP_NAME, EMP_NO, SALARY, NVL(DEPT_CODE, '없음')
    FROM EMPLOYEE WHERE (SALARY BETWEEN 2000000 AND 3000000)
    AND EMP_NO LIKE '__04__-2%' ORDER BY EMP_NO DESC;

-- 문제6.
-- 남자 사원 중 보너스가 없는 사원의 오늘까지 근무일을 측정하여 
-- 1000일 마다(소수점 제외) 
-- 급여의 10% 보너스를 계산하여 이름,특별 보너스 (계산 금액) 결과를 출력하여라.
-- 단, 이름 순으로 오름 차순 정렬하여 출력하여라.최종 실습 문제
SELECT EMP_NAME, FLOOR((SYSDATE-HIRE_DATE)/1000)*(SALARY*0.1) "특별보너스"
    FROM EMPLOYEE WHERE EMP_NO LIKE '______-1%' AND BONUS IS NULL
    ORDER BY EMP_NAME;
    
--------------------------------------------------------------------

SELECT SYSDATE FROM DUAL;

-- LENGTH : 문자열의 길이, LENGTHB : 문자열의 바이트 길이 
SELECT EMP_NAME, LENGTH(EMP_NAME), LENGTHB(EMP_NAME), 
    EMAIL, LENGTH(EMAIL), LENGTHB(EMAIL)
    FROM EMPLOYEE;
    
-- INSTR, INSTRB
SELECT INSTR('HEllo World Hi High', 'H',1,1) FROM DUAL;
SELECT INSTR('HEllo World Hi High', 'H',1,2) FROM DUAL;
SELECT INSTR('HEllo World Hi High', 'H',1,3) FROM DUAL;

-- EMPLOYEE 테이블에서 EMAIL 컬럼의 문자열 중 '@'의 위치를 구하시오
SELECT EMAIL, INSTR(EMAIL,'@',1,1) "위치" FROM EMPLOYEE;

-- LPAD/RPAD
SELECT LPAD(EMAIL,20,'#'), RPAD(EMAIL,20,'#') FROM EMPLOYEE;

-- LTRIM/RTRIM
SELECT LTRIM('    KH'), LTRIM('    KH',' ') FROM DUAL;
SELECT LTRIM('000123456', '0') FROM DUAL;

-- DUAL 테이블은 오라클 자체에서 제공되는 테이블
-- 간단하게 함수를 이용해서 계산 결과값을 확인할 때 사용하는 테이블

-- TRIM
SELECT TRIM ('   KH   '), TRIM(BOTH 'z' FROM 'zzzKHzzz'),
    TRIM(LEADING 'z' FROM 'zzzKHzzz'),
    TRIM(TRAILING 'z' FROM 'zzzKHzzz')
FROM DUAL;

-- 실습 문제 1
-- Hello KH Java 문자열을 Hello KH 가 출력되게 하여라.
SELECT RTRIM('Hello KH Java', 'Java') FROM DUAL;

-- 실습 문제 2
-- Hello KH Java 문자열을 KH Java 가 출력되게 하여라.
SELECT LTRIM('Hello KH Java', 'Hello') FROM DUAL;

-- 실습 문제 3 (TRIM으로 해보세요)
-- DEPARTMENT 테이블에서 DEPT_TITLE을 출력하여라
-- 이때, 마지막 부 글자를 빼고 출력되도록 하여라 / ex)회계관리부 -> 회계관리
SELECT TRIM(TRAILING '부' FROM DEPT_TITLE) FROM DEPARTMENT;

-- 실습 문제 4
-- 다음문자열에서 앞뒤 모든 숫자를 제거하세요.
-- '982341678934509hello89798739273402'
SELECT RTRIM(LTRIM('982341678934509hello89798739273402', '0123456789')
    , '0123456789') FROM DUAL;
    
-- SUBSTR
SELECT SUBSTR('SHOW ME THE MONEY',7), 
    SUBSTR('SHOW ME THE MONEY',6,2),
    SUBSTR('SHOW ME THE MONEY',-9,3) 
FROM DUAL;
-- 실습문제1
-- 사원명에서 성만 사전순으로 출력
SELECT DISTINCT SUBSTR(EMP_NAME,1,1) FROM EMPLOYEE ORDER BY 1;
-- 실습문제2
-- EMPLOYEE 테이블에서 남자만 사원번호, 사원명, 주민번호, 연봉을 출력
-- 주민번호 뒤 6자리는 *처리
SELECT EMP_ID "사원번호",
    EMP_NAME "사원명",
    RPAD(SUBSTR(EMP_NO,1,8),14,'*') "주민번호",
    SUBSTR(EMP_NO,1,8)||'******' "주민번호",
    SALARY*12 "연봉"
FROM EMPLOYEE 
WHERE EMP_NO LIKE '______-1%';

-- REPLACE
SELECT REPLACE('KH HATE', 'HATE', 'LOVE') FROM DUAL;
-- 실습문제
-- EMPLOYEE 테이블의 모든 직원의 이름, 주민번호, EMAIL을 출력
-- 단, 출력시 EMAIL의 주소를 kh.or.kr에서 iei.or.kr로 변경하여 출력
SELECT EMP_NAME, 
    EMP_NO, 
    SUBSTR(EMAIL,1,INSTR(EMAIL,'@',1,1)-1) ||
    REPLACE(SUBSTR(EMAIL,INSTR(EMAIL,'@',1,1)), 'kh.or.kr', 'iei.or.kr')
    AS "EMAIL"
FROM EMPLOYEE;

-- LOWER/UPPER/INITCAP
-- CONCAT( || 연결연산자와 같음)

-- 숫자 처리함수
-- ABS(절대값), MOD, ROUND, FLOOR, TRUNC, CEIL
-- 올림, 반올림, 버림

--MOD(나머지 연산자)
SELECT MOD(10,3) FROM DUAL;

--ROUND(반올림), FLOOR/TRUNC(버림), CEIL(올림)
SELECT ROUND(123.456, 0), ROUND(123.456, 1) FROM DUAL;
SELECT ROUND(123.456, -1), ROUND(123.456, -2), ROUND(123.456, -3) 
FROM DUAL;

SELECT FLOOR(123.456), TRUNC(123.456,1) FROM DUAL;

SELECT CEIL(123.456) FROM DUAL;

-- 날짜 처리 함수
-- SYSDATE
SELECT SYSDATE FROM DUAL;

-- MONTHS_BETWEEN
-- 날짜 두개를 받아 개월 수 차이를 숫자 데이터형으로 리턴하는 함수
SELECT EMP_NAME, HIRE_DATE,
    CEIL(MONTHS_BETWEEN(SYSDATE, HIRE_DATE))||'개월' AS "근무 개월",
    CEIL(SYSDATE-HIRE_DATE) "근무일수"
FROM EMPLOYEE;

-- ADD_MONTHS
-- 인자로 전달받은 날짜에 인자로 전달받은 숫자만큼 개월 수를 더하여 특정 날짜를 리턴하는 함수
SELECT SYSDATE, ADD_MONTHS(SYSDATE,6) FROM DUAL;
--EMPLOYEE 테이블에서 사원의 이름, 입사일, 입사 후 6개월이 된 날짜
SELECT EMP_NAME, HIRE_DATE, ADD_MONTHS(HIRE_DATE, 6) FROM EMPLOYEE;

-- NEXT_DAY
SELECT SYSDATE, NEXT_DAY(SYSDATE,'월요일'),
    NEXT_DAY(SYSDATE,2) -- 1:일요일, 2:월요일
FROM DUAL;

-- LAST_DAY
-- EMPLOYEE 테이블에서 사원의 이름, 입사일, 입사월의 마지막 날을 조회하시오
SELECT EMP_NAME, HIRE_DATE, LAST_DAY(HIRE_DATE)
FROM EMPLOYEE;

/*
    오늘 군대에 간다면?!
    군복무기간 1년 6개월
    1. 제대일자
    2. 제대일자까지 먹어야하는 짬밥의 그릇 수,,(1일 3끼)
*/
SELECT SYSDATE AS "입대일", 
    ADD_MONTHS(SYSDATE,18) AS "제대일자",
    (ADD_MONTHS(SYSDATE,18)-SYSDATE)*3 AS "쫨빱"
FROM DUAL;

-- EXTRACT
-- 년,월,일 정보를 추출해서 리턴해주는 함수
SELECT EXTRACT(YEAR FROM SYSDATE),
    EXTRACT(MONTH FROM SYSDATE),
    EXTRACT(DAY FROM SYSDATE)
    FROM DUAL;

SELECT EMP_NAME,
    EXTRACT(YEAR FROM HIRE_DATE) "입사년도",
    EXTRACT(MONTH FROM HIRE_DATE) "입사월",
    EXTRACT(DAY FROM HIRE_DATE) "입사일"
FROM EMPLOYEE;

-- @ 실습문제 1
-- EMPLOYEE 테이블에서 사원의 이름,입사일,년차를 출력하여라. 
-- 단, 입사일은 YYYY년M월D일로 출력하도록 하여라.
-- 년차 출력은 소수점 일경우 올림으로 하여 출력하여라. (28.144 -> 29년차)
-- (출력시 정렬은 입사일 기준으로 오름차순)
SELECT EMP_NAME "이름",
    EXTRACT(YEAR FROM HIRE_DATE)||'년'||
    EXTRACT(MONTH FROM HIRE_DATE)||'월'||
    EXTRACT(DAY FROM HIRE_DATE)||'일' "입사일",
    CEIL((SYSDATE-HIRE_DATE)/365)||'년차' "년차"
    FROM EMPLOYEE;

-- @ 실습문제 2
-- 특별 보너스를 지급하기 위하여 자료가 필요하다
-- 입사일을 기점으로 다음달 1일 부터 6개월을 계산하여 
-- 출력하시오 (이름,입사일,기준일,기준일+6,기준달(월))
-- ex) 90년2월6일 입사 -> 90년3월1일 부터 계산
-- ex) 90년2월26일 입사 -> 90년3월1일 부터 계산
-- ex) 97년12월1일 입사 -> 98년1월1일 부터 계산
-- 출력시 입사일 기준으로 정렬하시오
SELECT EMP_NAME "이름", HIRE_DATE "입사일",
    LAST_DAY(HIRE_DATE)+1 "기준일",
    ADD_MONTHS(LAST_DAY(HIRE_DATE)+1,6) "기준일+6",
    EXTRACT(MONTH FROM ADD_MONTHS(LAST_DAY(HIRE_DATE)+1,6))||'월' "기준달"
FROM EMPLOYEE;
----------------------------------------------------------
--형변환 함수

-- 형식 
-- YYYY : 년도표현(4자리), YY : 년도표현(2자리)
-- MONTH : 월표시, MM : 월을 숫자로 표시, MON : 월을 한글로 표시
-- DD : 일 표현, D : 요일 표현(숫자로 1:일요일, 2:월요일)
-- DAY : 요일표현, DY : 요일 약어로 표현
-- HH, HH12 : 시간표현(12시간으로 표현), HH24 : 24시간으로 표현
-- MI : 분, SS : 초
-- AM, PM : 오전, 오후 표기
-- FM : 월, 일, 시, 분, 초 앞의 0을 제거
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD'), 
    TO_CHAR(SYSDATE, 'YYYY/MM/DD'),
    TO_CHAR(SYSDATE, 'YY-MON-DY HH24:MI:SS')
FROM DUAL;

SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD PMHH12"시"MI"분"SS"초"'), 
    TO_CHAR(SYSDATE, 'FMYYYY/MM/DD HH24"시"MI"분"SS"초"')
FROM DUAL;

-- EMPLOYEE 테이블에서 사원명, 고용일(ex. 1990/02/06(화))로 출력
SELECT EMP_NAME, TO_CHAR(HIRE_DATE, 'YYYY/MM/DD(DY)')
FROM EMPLOYEE;

-- TO_DATE 함수
SELECT TO_DATE(20210308, 'YYYYMMDD'),
    TO_DATE('20210308', 'YYYYMMDD')
FROM DUAL;

SELECT TO_CHAR(
    TO_DATE('20210308161530', 'YYYYMMDDHH24MISS'), 
    'YYYY/MM/DD HH24:MI:SS'),
    TO_DATE('20210308161530', 'YYYYMMDDHH24MISS')
    FROM DUAL;
    
-- TO_NUMBER
-- 숫자형식
-- , (9,999) : 콤마형식으로 변환
-- . (99.99) : 소수점 형식으로 변환
-- 0:맨 왼쪽에 0을 삽입, $:$통화로 표시, L:로컬통화로 표시(한국은 \)
-- 숫자 표시 단위를 쓸 때에는 충분히 크게 크기를 잡아야 함
SELECT TO_NUMBER('90,000', '999,999,999'),
    TO_CHAR(90000, '999,999,999')
FROM DUAL;

SELECT TO_NUMBER('1,000,000', '9,999,999') 
    - TO_NUMBER('550,000', '9,999,999'),
    ('1000000' - '550000')
FROM DUAL;
    

-- 다양한 함수들
-- NVL, DECODE, CASE

-- NVL
SELECT NVL(BONUS, 0),
    NVL(MANAGER_ID, '없음'),
    NVL(DEPT_CODE, '미배정')
FROM EMPLOYEE;

SELECT
    BONUS,
    (SALARY*12+(SALARY*BONUS*12)),
    (SALARY*12+(SALARY*NVL(BONUS,0)*12)) "총수령액"
FROM EMPLOYEE;

-- DECODE
-- 여러가지 경우에 선택할 수 있는 기능을 제공함(일치하는 값)
SELECT
    EMP_ID,
    EMP_NAME,
    EMP_NO,
    DECODE(SUBSTR(EMP_NO,8,1), '1', '남', '2', '여', '없음') "성별"
FROM EMPLOYEE;

-- CASE(범위값도 가능)
SELECT EMP_ID,
    EMP_NAME,
    EMP_NO,
    CASE WHEN SUBSTR(EMP_NO,8,1) = 1 THEN '남'
         WHEN SUBSTR(EMP_NO,8,1) = 2 THEN '여'
         ELSE '없음'
    END "성별"
FROM EMPLOYEE;

-- 60년대생 직원을 65년 이전 출생자는 60년생 초반, 65년 이후 출생자는 60년생 후반이라고 출력
SELECT 
    EMP_NAME, EMP_NO,
CASE WHEN SUBSTR(EMP_NO,1,2) > 65 THEN '60년생 후반'
    WHEN SUBSTR(EMP_NO,1,2) < 65 THEN '60년생 초반'
    ELSE '65년생'
    END "년생"
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO,1,2) BETWEEN 60 AND 69;

-- 그룹함수 : 여러개의 행이 전달되어 하나의 값만 나타나는 함수
-- SUM, AVG, COUNT, MAX, MIN

-- SUM
SELECT SUM(SALARY) FROM EMPLOYEE;
-- AVG
SELECT ROUND(AVG(SALARY)) FROM EMPLOYEE; -- ROUND : 반올림
-- COUNT
SELECT COUNT(*) FROM EMPLOYEE; -- 행의 갯수
-- MAX/MIN
SELECT MAX(SALARY), MIN(SALARY) FROM EMPLOYEE;


--함수 최종 연습 문제

--1. 직원명과 이메일 , 이메일 길이를 출력하시오
--		  이름	    이메일		이메일길이
--	ex) 	홍길동 , hong@kh.or.kr   	  13
SELECT EMP_NAME "이름", 
    EMAIL "이메일",
    LENGTH(EMAIL) "이메일 길이" 
FROM EMPLOYEE;

--2. 직원의 이름과 이메일 주소중 아이디 부분만 출력하시오
--	ex) 노옹철	no_hc
--	ex) 정중하	jung_jh
SELECT EMP_NAME,
    SUBSTR(EMAIL,1,INSTR(EMAIL,'@',1,1)-1)
FROM EMPLOYEE;

--3. 60년생의 직원명과 년생, 보너스 값을 출력하시오 
--	그때 보너스 값이 null인 경우에는 0 이라고 출력 되게 만드시오
--	    직원명    년생      보너스
--	ex) 선동일	62	      0.3
--	ex) 송은희	63  	  0
SELECT EMP_NAME "직원명",
    SUBSTR(EMP_NO,1,2) "년생",
    NVL(BONUS, 0) "보너스"
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO,1,2) BETWEEN 60 AND 69;
--4. '010' 핸드폰 번호를 쓰지 않는 사람의 수를 출력하시오 (뒤에 단위는 명을 붙이시오)
--	   인원
--	ex) 3명
SELECT COUNT(PHONE)||'명' "인원" 
FROM EMPLOYEE 
WHERE PHONE NOT LIKE '010%';
--5. 직원명과 입사년월을 출력하시오 
--	단, 아래와 같이 출력되도록 만들어 보시오
--	    직원명		입사년월
--	ex) 전형돈		2012년12월
--	ex) 전지연		1997년 3월
SELECT EMP_NAME "이름",
    -- TO_CHAR(HIRE_DATE, 'YYYY"년"MM"월"') "입사년월",
    EXTRACT(YEAR FROM HIRE_DATE)||'년'||
    EXTRACT(MONTH FROM HIRE_DATE)||'월' "입사년월"
FROM EMPLOYEE;
--6. 직원명과 주민번호를 조회하시오
--	단, 주민번호 9번째 자리부터 끝까지는 '*' 문자로 채워서출력 하시오
--	ex) 홍길동 771120-1******
SELECT EMP_NAME,
    SUBSTR(EMP_NO,1,8)||'******'
FROM EMPLOYEE;
--7. 직원명, 직급코드, 연봉(원) 조회
--  단, 연봉은 ￦57,000,000 으로 표시되게 함
--     연봉은 보너스포인트가 적용된 1년치 급여임
SELECT EMP_NAME, JOB_CODE,
    TO_CHAR(SALARY*12+SALARY*NVL(BONUS,0), 'L999,999,999') "연봉"
FROM EMPLOYEE;

--8. 부서코드가 D5, D9인 직원들 중에서 2004년도에 입사한 직원의 
--   수 조회함.
--   사번 사원명 부서코드 입사일
SELECT
    EMP_ID, EMP_NAME, DEPT_CODE, HIRE_DATE
FROM EMPLOYEE
WHERE DEPT_CODE IN ('D5','D9') 
AND SUBSTR(HIRE_DATE,1,2) = '04';

--9. 직원명, 입사일, 오늘까지의 근무일수 조회 
--	* 주말도 포함 , 소수점 아래는 버림
SELECT EMP_NAME, HIRE_DATE,
    FLOOR(SYSDATE-HIRE_DATE) "오늘까지의 근무일수"
FROM EMPLOYEE;
--10. 모든 직원의 나이 중 가장 많은 나이와 가장 적은 나이를 출력 하여라. (나이만 출력)
SELECT 
    MIN(EXTRACT(YEAR FROM SYSDATE) - (1900 + SUBSTR(EMP_NO,1,2))) 
    "최소나이",
    MAX(EXTRACT(YEAR FROM SYSDATE) - (1900 + SUBSTR(EMP_NO,1,2))) 
    "최대나이"
FROM EMPLOYEE;

--11.  회사에서 야근을 해야 되는 부서를 발표하여야 한다.
-- 부서코드가 D5,D6,D9  야근, 그외는 야근없음 으로 출력되도록 하여라. 
-- 출력 값은 이름,부서코드,야근유무 (부서코드 기준 오름차순 정렬함.)
--   (부서코드가 null인 사람도 야근없음 임)
SELECT 
    EMP_NAME, DEPT_CODE,
    --DECODE(SUBSTR(DEPT_CODE,2,1),'5','야근','6','야근',9','야근','야근없음') 
    CASE
        WHEN DEPT_CODE IN ('D5','D6','D9') THEN '야근'
        ELSE '야근없음'
    END "야근유무"
FROM EMPLOYEE
ORDER BY DEPT_CODE;
------------------------------------------------------------------
-- GRUOP BY
SELECT DEPT_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE
ORDER BY 1;

-- EMPLOYEE 테이블에서 부서코드, 그룹별 급여의 합계, 그룹별 급여의 평균(점수처리),
-- 인원수를 조회하고 부서코드 순으로 정렬
SELECT DEPT_CODE, SUM(SALARY), FLOOR(AVG(SALARY)),COUNT(*)
FROM EMPLOYEE
GROUP BY DEPT_CODE
ORDER BY 1;

-- EMPLOYEE 테이블에서 부서코드, 보너스를 지급받는 사원 수를 조회하고
-- 부서코드 순으로 정렬하시오
SELECT DEPT_CODE, COUNT(BONUS)
FROM EMPLOYEE
WHERE BONUS IS NOT NULL
GROUP BY DEPT_CODE
ORDER BY 1;

-- EMPLOYEE 테이블에서 EMP_NO의 8번째 자리가 1이면 '남', 2면 '여'로 결과 조회,
-- 성별별 급여의 평균(정수처리), 급여의 합계, 인원수를 조회한 뒤 인원수로 내림차순 정렬
SELECT 
    DECODE(SUBSTR(EMP_NO,8,1), '1','남','2','여') "성별",
    FLOOR(AVG(SALARY)) "평균",
    SUM(SALARY) "합계",
    COUNT(*) "인원수"
FROM EMPLOYEE
GROUP BY DECODE(SUBSTR(EMP_NO,8,1), '1','남','2','여')
ORDER BY 4 DESC;

-- @ 실습 문제 1
--EMPLOYEE 테이블에서 직급이 J1을 제외하고, 직급,직급별 사원수 및 평균급여를 출력하세요.
SELECT JOB_CODE "직급", COUNT(*) "사원수", 
    FLOOR(AVG(SALARY)) "평균급여"
FROM EMPLOYEE
WHERE JOB_CODE NOT IN ('J1')
GROUP BY JOB_CODE
ORDER BY 1;
-- @ 실습 문제 2
-- EMPLOYEE테이블에서 직급이 J1을 제외하고,  입사년도별 인원수를 조회해서, 입사년 기준으로 오름차순 정렬하세요.
SELECT EXTRACT(YEAR FROM HIRE_DATE) "입사년도",
    COUNT(*) "인원수"
FROM EMPLOYEE
WHERE JOB_CODE NOT LIKE 'J1'
GROUP BY EXTRACT(YEAR FROM HIRE_DATE)
ORDER BY 1;

--@ 실습 문제 3
--부서내 성별 인원수를 구하세요.
-- 다음과 같이 출력 되도록 만드시오
--ex)
--D1	남	2
--D1	여	1
SELECT DEPT_CODE "부서코드", 
    DECODE(SUBSTR(EMP_NO,8,1), '1','남','2','여') "성별",
    COUNT(*) "인원수"
FROM EMPLOYEE
GROUP BY DEPT_CODE, DECODE(SUBSTR(EMP_NO,8,1), '1','남','2','여')
ORDER BY 1;

-- HAVING절
SELECT DEPT_CODE,
    FLOOR(AVG(SALARY))
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING FLOOR(AVG(SALARY)) >= 3000000;

-- ROLLUP
-- 부서내 직급별 합계, 부서 합계 
SELECT DEPT_CODE,
    JOB_CODE,
    SUM(SALARY)
FROM EMPLOYEE
GROUP BY ROLLUP(DEPT_CODE, JOB_CODE)
ORDER BY 1;
-- CUBE
-- 부서 내 직급별 합계, 부서 합계, 직급별 합계 
SELECT DEPT_CODE,
    JOB_CODE,
    SUM(SALARY)
FROM EMPLOYEE
GROUP BY CUBE(DEPT_CODE, JOB_CODE)
ORDER BY 1;

-- 집합연산자
-- 합집합, 교집합, 차집합
-- A = {1, 2, 3, 4, 5}, B = {3, 4, 7, 8, 9}
-- A∪B = {1, 2, 3, 4, 5, 7, 8, 9} UNION (중복 값은 삭제)
-- A∩B = {3, 4}
-- A-B = {1, 2, 5}

-- UNION, UNION ALL의 사용 조건
-- 1. 컬럼의 갯수가 같아야 함
-- 2. 컬럼의 데이터 타입이 같아야 함 

SELECT EMP_ID,
    EMP_NAME,
    DEPT_CODE,
    SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5'
UNION --합집합. 중복 값은 삭제 
SELECT EMP_ID,
    EMP_NAME,
    DEPT_CODE,
    SALARY
FROM EMPLOYEE
WHERE SALARY > 3000000;

SELECT EMP_ID,
    EMP_NAME,
    DEPT_CODE,
    SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5'
UNION ALL -- 합집합. 중복 허용 
SELECT EMP_ID,
    EMP_NAME,
    DEPT_CODE,
    SALARY
FROM EMPLOYEE
WHERE SALARY > 3000000;

SELECT EMP_ID,
    EMP_NAME,
    DEPT_CODE,
    SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5'
INTERSECT -- 교집합. 중복되는 데이터 추출 
SELECT EMP_ID,
    EMP_NAME,
    DEPT_CODE,
    SALARY
FROM EMPLOYEE
WHERE SALARY > 3000000;

SELECT EMP_ID,
    EMP_NAME,
    DEPT_CODE,
    SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5'
MINUS -- 차집합. 겹치는 부분을 제외한 나머지 부분만 추출 
SELECT EMP_ID,
    EMP_NAME,
    DEPT_CODE,
    SALARY
FROM EMPLOYEE
WHERE SALARY > 3000000;

-- JOIN 예제
SELECT EMP_ID,
    EMP_NAME,
    DEPT_CODE,
    DEPT_TITLE
FROM EMPLOYEE JOIN DEPARTMENT
ON (DEPT_CODE = DEPT_ID);

SELECT EMP_ID,
    EMP_NAME,
    EMPLOYEE.JOB_CODE,
    JOB_NAME
FROM EMPLOYEE JOIN JOB
ON (EMPLOYEE.JOB_CODE = JOB.JOB_CODE);

SELECT *
FROM JOB;

SELECT DEPT_ID,
    DEPT_TITLE
FROM DEPARTMENT;

-- JOIN 사용법 
-- JOIN 테이블명 ON (컬럼1 = 컬럼2)
-- ANSI 표준 구문 
SELECT EMP_ID,
    EMP_NAME,
    DEPT_TITLE
FROM EMPLOYEE JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID);
-- 오라클 전용 구문
SELECT EMP_ID,
    EMP_NAME,
    DEPT_TITLE
FROM EMPLOYEE, DEPARTMENT WHERE DEPT_CODE = DEPT_ID;

-- ANSI 표준 구문
SELECT EMP_ID,
    EMP_NAME,
    JOB_NAME
FROM EMPLOYEE JOIN JOB USING(JOB_CODE);
-- 오라클 전용 구문
SELECT EMP_ID,
    EMP_NAME,
    JOB_NAME
FROM EMPLOYEE JOIN JOB ON (EMPLOYEE.JOB_CODE = JOB.JOB_CODE);

-- JOIN의 종류
-- 1. INNER JOIN(내부 조인) : 교집합(일반적으로 사용하는 JOIN)
-- 2. OUTER JOIN(외부 조인) : 합집합
-- 하나의 테이블을 기준으로 기준테이블의 데이터를 모두 출력한 후 조인하는 것
-- LEFT OUTER JOIN(왼쪽 외부 조인)
-- 테이블 A를 모두 반환하고 테이블 B 조건 구문과 일치하는 데이터만 반환(그 외에는 NULL처리)
SELECT EMP_NAME,
    DEPT_TITLE
FROM EMPLOYEE LEFT OUTER JOIN DEPARTMENT 
ON (DEPT_CODE = DEPT_ID);

SELECT EMP_NAME,
    DEPT_CODE,
    DEPT_TITLE
FROM EMPLOYEE RIGHT OUTER JOIN DEPARTMENT 
ON (DEPT_CODE = DEPT_ID);

SELECT EMP_NAME,
    DEPT_CODE,
    DEPT_TITLE
FROM EMPLOYEE FULL OUTER JOIN DEPARTMENT 
ON (DEPT_CODE = DEPT_ID);

-- CROSS JOIN(상호 조인)
-- 카테이션곱이라고도 함
-- JOIN 조건없이 조인이 됨
-- 왼쪽 테이블의 모든 행이 오른쪽 테이블의 모든 행들과 조인이 됨 
SELECT EMP_NAME, DEPT_TITLE
FROM EMPLOYEE CROSS JOIN DEPARTMENT;


-- SELF JOIN
-- 같은 테이블을 조인하는 경우
SELECT EMP.EMP_ID,
    EMP.EMP_NAME,
    EMP.MANAGER_ID,
    MNG.EMP_NAME "MANAGER_NAME"
FROM EMPLOYEE EMP JOIN EMPLOYEE MNG 
ON EMP.MANAGER_ID = MNG.EMP_ID;

--## SELF 조인 실습 ##
-- 자신이 관리하고 있는 사원의 이름,급여 및 직급이 어떻게 되는지 검색하여라.

SELECT MNG.EMP_NAME "매니저이름",
    EMP.EMP_NAME "직원이름",
    EMP.SALARY "급여",
    EMP.JOB_CODE "직급코드",
    J.JOB_NAME "직급명"
FROM EMPLOYEE MNG JOIN EMPLOYEE EMP
ON EMP.MANAGER_ID = MNG.EMP_ID
JOIN JOB J ON EMP.JOB_CODE = J.JOB_CODE;
-- 조인은 여러개가 가능!! 이것을 다중 JOIN이라고 함 
-- 다중 JOIN
-- EMPLOYEE 테이블, DEPARTMENT 테이블, LOCATION 테이블을 모두 조인해서 보고싶다면?
SELECT EMP_ID,
    EMP_NAME,
    DEPT_TITLE,
    LOCAL_NAME
FROM EMPLOYEE
JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
JOIN LOCATION ON LOCAL_CODE = LOCATION_ID;

--## 다중 JOIN 간단 실습 ##
-- 각 사원들의 이름,나이,부서명,직책명을 출력하여라.
-- (부서코드,직책코드가 아닌 부서명과 직책명을 출력하여야 함)

SELECT EMP_NAME "이름",
    EXTRACT(YEAR FROM SYSDATE) 
        - (1900 + SUBSTR(EMP_NO,1,2))||'세' "나이",
    DEPT_TITLE "부서명",
    JOB_NAME "직책"
FROM EMPLOYEE
JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
JOIN JOB USING(JOB_CODE);

-- NON EQUI JOIN (비등가 조인)
SELECT 
    EMP_ID,
    EMP_NAME,
    SALARY,
    EMPLOYEE.SAL_LEVEL,
    MAX_SAL,
    MIN_SAL
FROM EMPLOYEE
JOIN SAL_GRADE 
ON (EMPLOYEE.SALARY BETWEEN 3000000 AND 4000000)
WHERE EMPLOYEE.SAL_LEVEL = SAL_GRADE.SAL_LEVEL;

------------------------------------------------------------------


-- 2. 1970년대 생이면서 성별이 여자이고, 성이 전씨인 직원들의
-- 사원명, 주민번호, 부서명, 직급명을 조회하시오
SELECT
    EMP_NAME,
    EMP_NO,
    DEPT_TITLE,
    JOB_NAME
FROM EMPLOYEE EMP
JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
JOIN JOB J ON EMP.JOB_CODE = J.JOB_CODE
WHERE (SUBSTR(EMP_NO,1,2) BETWEEN 70 AND 79)
AND (SUBSTR(EMP_NO,8,1) = '2');

-- 3. 이름에 '형'자가 들어가는 직원들의 사번, 사원명, 부서명을 조회하시오
SELECT 
    EMP_ID,
    EMP_NAME,
    DEPT_TITLE
FROM EMPLOYEE
JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
WHERE EMP_NAME LIKE '%형%';

-- 4. 해외영업부에 근무하는 사원명, 직급명, 부서코드, 부서명을 조회하시오
SELECT
    EMP_NAME,
    JOB_NAME,
    DEPT_CODE,
    DEPT_TITLE
FROM EMPLOYEE EMP
JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
JOIN JOB J ON EMP.JOB_CODE = J.JOB_CODE
WHERE DEPT_TITLE LIKE '해외영업%';

-- 5. 보너스 포인트를 받는 직원들의 사원명, 보너스포인트, 부서명, 근무지역명을 조회하시오
SELECT
    EMP_NAME,
    BONUS,
    DEPT_TITLE,
    LOCAL_NAME
FROM EMPLOYEE
JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
JOIN LOCATION ON LOCAL_CODE = LOCATION_ID
WHERE BONUS IS NOT NULL;

-- 6. 부서코드가 D2인 직원들의 사원명, 직급명, 부서명, 근무지역명을 조회하시오
SELECT 
    EMP_NAME,
    JOB_NAME,
    DEPT_TITLE,
    LOCAL_NAME
FROM EMPLOYEE EMP
JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
JOIN JOB J ON EMP.JOB_CODE = J.JOB_CODE
JOIN LOCATION ON LOCAL_CODE = LOCATION_ID
WHERE DEPT_TITLE = '회계관리부'
ORDER BY 1;

-- 7. 급여등급 테이블의 최대급여 (MAX_SAL) -50만원보다 많이 받는 직원들의
-- 사원명, 직급명, 급여, 연봉을 조회하시오
-- (사원테이블과 급여등급 테이블을 SAL_LEVEL컬럼 기준으로 조인할 것)

-- 8. 한국과 일본에 근무하는 직원들의 사원명, 부서명, 지역명, 국가명을 조회하시오

-- 9. 같은 부서에 근무하는 직원들의 사원명, 부서명, 동료이름을 조회하시오.(self join)
SELECT
    E1.EMP_NAME "사원이름",
    E2.EMP_NAME "동료이름"
FROM EMPLOYEE E1
LEFT JOIN EMPLOYEE E2 ON (E1.DEPT_CODE = E2.DEPT_CODE)
WHERE E1.EMP_NAME != E2.EMP_NAME
ORDER BY 1;
-- 10. 보너스 포인트가 없는 직원들 중에서 직급이 차장과 사원인 직원들의
-- 사원명, 직급명, 급여를 조회하시오. (JOIN과 IN을 사용할 것)

-- 11. 재직중인 직원과 퇴사한 직원의 수를 조회하시오.
SELECT ENT_YN,
    DECODE(ENT_YN, 'N','재직','Y','퇴직') "재직여부",
    COUNT(*) "인원수"
FROM EMPLOYEE
GROUP BY ENT_YN;
---------------------------------------------------------------
-- SUBQUERY 실습
SELECT
    EMP_ID,
    EMP_NAME,
    JOB_CODE,
    SALARY
FROM EMPLOYEE
WHERE SALARY > (SELECT AVG(SALARY) FROM EMPLOYEE);
-- WHERE절의 일반 서브쿼리

-- 전지연 직원의 관리자 이름을 출력
SELECT EMP_ID,
    EMP_NAME,
    MANAGER_ID
FROM EMPLOYEE
WHERE EMP_ID =
    (SELECT MANAGER_ID
        FROM EMPLOYEE
            WHERE EMP_NAME = '전지연');
            
--@ 실습문제 
--1. 윤은해와 급여가 같은 사원들을 검색해서, 사원번호,사원이름, 급여를 출력하라.
--단, 윤은해는 출력 되면 안됨
SELECT EMP_ID,
    EMP_NAME,
    SALARY
FROM EMPLOYEE
WHERE SALARY = 
    (SELECT SALARY 
        FROM EMPLOYEE 
        WHERE EMP_NAME = '윤은해')
AND EMP_NAME != '윤은해';
--2. employee 테이블에서 기본급여가 제일 많은 사람과 제일 적은 사람의 정보를 
-- 사번, 사원명, 기본급여를 나타내세요.
SELECT EMP_ID,
    EMP_NAME,
    SALARY
FROM EMPLOYEE
WHERE SALARY = (SELECT MIN(SALARY) FROM EMPLOYEE) OR
    SALARY = (SELECT MAX(SALARY) FROM EMPLOYEE);
    
-- 3. D1, D2부서에 근무하는 사원들 중에서
-- 기본급여가 D5 부서 직원들의 '평균월급' 보다 많은 사람들만 
-- 부서번호, 사원번호, 사원명, 월급을 나타내세요.
SELECT DEPT_CODE,
    EMP_ID,
    EMP_NAME,
    SALARY
FROM EMPLOYEE
WHERE DEPT_CODE IN('D1','D2') 
AND SALARY > (SELECT AVG(SALARY) 
    FROM EMPLOYEE WHERE DEPT_CODE = 'D5');

-- 다중행 서브쿼리
SELECT
    EMP_ID,
    EMP_NAME,
    SALARY
FROM EMPLOYEE
WHERE DEPT_CODE IN
    (SELECT DEPT_CODE
        FROM EMPLOYEE
            WHERE EMP_NAME IN ('송종기','박나라'));
            
--@실습문제
-- 차태연, 전지연 사원의 급여등급(emplyee테이블의 sal_level컬럼)과 같은
-- 사원의 직급명, 사원명을 출력하시오
SELECT 
    EMP_NAME,
    JOB_NAME,
    SAL_LEVEL
FROM EMPLOYEE
JOIN JOB USING(JOB_CODE)
WHERE SAL_LEVEL IN
    (SELECT SAL_LEVEL
        FROM EMPLOYEE
            WHERE EMP_NAME IN ('차태연','전지연'));
            
-- 인라인 뷰(FROM절에서의 서브쿼리)
-- TOP-N 분석 : 가장 큰 N개의 값 또는 가장 작은 N개의 값을 출력할 때 사용됨
-- ex) 회사에서 급여가 가장 높은 5명을 출력하시오 
WITH TOP_SALN AS (SELECT EMP_NAME, SALARY 
    FROM EMPLOYEE ORDER BY SALARY DESC)
SELECT 
    *
FROM TOP_SALN;


SELECT 
    ROWNUM,
    EMP_NAME,
    SALARY
FROM (SELECT EMP_NAME, SALARY 
    FROM EMPLOYEE ORDER BY SALARY DESC)
WHERE ROWNUM < 6;

-- RANK() OVER
-- 중복 순위 다음은 해당 개수만큼 건너뛰고 반환
-- 1, 2, 3, 4, 5, 6, 6, 6, 9, 10
-- ex) 회사의 연봉 순위를 출력하시오
SELECT  EMP_NAME, SALARY*12 "연봉", 
    RANK() OVER(ORDER BY SALARY DESC) "순위"
FROM EMPLOYEE;

-- DENSE_RANK() OVER
-- 중복 순위 상관 없이 순차적으로 반환
-- 1,2,3,4,5,6,7,8,9,10
SELECT  EMP_NAME, SALARY*12 "연봉", 
    DENSE_RANK() OVER(ORDER BY SALARY DESC) "순위"
FROM EMPLOYEE;

-- 서브쿼리 실습 문제
--문제1
--기술지원부에 속한 사람들의 사람의 이름,부서코드,급여를 출력하시오
SELECT EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = (SELECT DEPT_ID
    FROM DEPARTMENT WHERE DEPT_TITLE = '기술지원부');
--문제2
--기술지원부에 속한 사람들 중 가장 연봉이 높은 사람의 이름,부서코드,급여를 출력하시오
SELECT 
    *
FROM (SELECT EMP_NAME, DEPT_CODE, SALARY 
    FROM EMPLOYEE
    WHERE DEPT_CODE 
        = (SELECT DEPT_ID
            FROM DEPARTMENT WHERE DEPT_TITLE = '기술지원부')
            ORDER BY SALARY DESC)
WHERE ROWNUM = 1;
--문제3
--매니저가 있는 사원중에 월급이 전체사원 평균을 넘고 
--사번,이름,매니저 이름,월급(만원단위부터)을 구하시오
 --* 단, JOIN을 이용하시오
SELECT 
    EMP.EMP_ID,
    EMP.EMP_NAME,
    MNG.EMP_NAME "매니저 이름",
    TRUNC(EMP.SALARY, -4) "급여(만원)"
FROM EMPLOYEE EMP
JOIN EMPLOYEE MNG ON (EMP.MANAGER_ID = MNG.EMP_ID)
WHERE EMP.MANAGER_ID IS NOT NULL
AND EMP.SALARY > (SELECT AVG(SALARY) FROM EMPLOYEE);
--문제4
--각 직급마다 급여 등급이 가장 높은 직원의 이름, 직급코드, 급여, 급여등급 조회
SELECT 
    EMP_NAME,
    JOB_CODE,
    SAL_LEVEL,
    SALARY
FROM EMPLOYEE E1
WHERE E1.SAL_LEVEL = (SELECT MIN(E2.SAL_LEVEL) FROM EMPLOYEE E2
                        WHERE E1.JOB_CODE = E2.JOB_CODE)
                        ORDER BY 2;
SELECT 
    E1.EMP_NAME,
    E1.JOB_CODE,
    E1.SAL_LEVEL,
    E1.SALARY
FROM EMPLOYEE E1
JOIN EMPLOYEE E2 ON E1.JOB_CODE = E2.JOB_CODE
ORDER BY 2;
--문제5
--부서별 평균 급여가 2200000 이상인 부서명, 평균 급여 조회
--단, 평균 급여는 소수점 버림
SELECT "평균급여",
    DEPT_TITLE
FROM(
SELECT 
    DEPT_CODE,
    FLOOR(AVG(SALARY)) "평균급여"
FROM EMPLOYEE
GROUP BY DEPT_CODE 
HAVING (AVG(SALARY)) >= 2200000) --하나의 테이블로 취급
JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
ORDER BY 1;
--문제6
--직급의 연봉 평균보다 적게 받는 여자사원의
--사원명,직급코드,부서코드,연봉을 이름 오름차순으로 조회하시오
--연봉 계산 => (급여+(급여*보너스))*12    
-- 사원명,직급명,부서명,연봉은 EMPLOYEE 테이블을 통해 출력이 가능함

-- 직급별 연봉
SELECT 
    AVG(SALARY*12) 
FROM EMPLOYEE
GROUP BY JOB_CODE;

-- 여자사원들 및 여자사원들의 연봉, 직급코드
SELECT SALARY*12, JOB_CODE
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO,8,1) = 2;

SELECT EMP_NAME, JOB_CODE, DEPT_CODE, SALARY*12 "ANNUAL_SALARY"
FROM EMPLOYEE E
WHERE SUBSTR(EMP_NO,8,1) = 2
AND (SALARY*12) < (SELECT AVG(SALARY*12) FROM EMPLOYEE Y 
    WHERE E.JOB_CODE = Y.JOB_CODE)
ORDER BY 1;

