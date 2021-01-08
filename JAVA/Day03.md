### Day03 연산자  

# 연산자와 피연산자 
  - 연산자는 연산을 수행하는 기호(+,-,*,/)  
  - 피연산자는 연산자의 작업대상(변수,상수,리터럴,수식)이 됨  

•[Exam_Calculator](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Calculator.java)  

# 증감연산자  
  - 단독사용시 : 증감연산자를 단독으로 사용할때는 전위/후위 모두 같은 연산 결과를 갖는다.  
    예) a++; ++a; 결과 같음  
       b++; ++b; 결과 같음  
  - 다른 연산의 일부로 포함시 (b = ++a, b = a++)  
  전위연산 : 자신의 연산을 우선 실행 후 다음 연산 ( ++a; -> b = a; )  
  후위연산 : 인접한 연산을 먼저 실행 후 자신의 연산 실행 ( b = a; -> a++ )  
  
•[Exam_Unary_01](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Unary_01.java)  
•[Exam_Unary_02](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Unary_02.java)  
•[Exam_Unary_03](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Unary_03.java)  

# 비트연산자  
  - 비트단위 연산을 하는 것 (같은 위치의 비트 비교)  
    - a&b(AND) : 비트 값이 둘 중 하나가 0이면 0, 둘 다 1이면 1  
    - a|b(OR) : 비트 값이 둘 중 하나가 1이면 1, 둘 다 0일때 0  
    - a^b(XOR) : 비트 값이 서로 다르면 1, 같으면 0  
    - ~a(NOT) : 비트 값을 반전시킴(1을 0으로, 0을 1로 변환)  
# 비트 쉬프트 연산자  
  - a >> 숫자 : 비트를 오른쪽으로 숫자만큼 이동하고 새로 생긴 비트는 0 (숫자만큼 2로 나누는 효과)  
  - a << 숫자 : 비트를 왼쪽으로 숫자만큼 이동하고 새로 생긴 비트는 0 (숫자만큼 2로 곱한 효과)  
  
# 관계연산자(비교연산자)  
  - 두 개의 변수의 관계를 따지는 연산자, 다른 말로 비교 연산자라고도 함  
  - 관계 연산자는 조건을 만족하면 true, 만족하지 못하면 false를 반환  
    - '>','<','>=','<=' : 숫자값 비교  
    - '==','!=' : 제어문에서 데이터를 비교(조건식)할때 자주 쓰임. 결과값은 논리값(true, false)  
      - a == b : a와 b가 같으면 true  
      - a != b : a와 b가 다르면 true  
# 논리연산자  
  - 논리값 두 개를 비교하는 연산자로 제어문에서 많이 사용됨  
  - a && b : a, b 모두 참일때 **참**  
  - a || b : a, b 하나라도 참이면 **참**  
  
•[Exam_Logical_01](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Logical_01.java)  
•[Exam_Logical_02](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Logical_02.java)  
•[Exam_Logical_03](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Logical_03.java)  

# 삼항연산자  
  - 조건식을 이용하여 결과값에 따라 연산을 처리하는 방식  
  **조건식 ? (true일때 실행코드) : (false일때 실행코드)**  
    - 예) a = a < b ? a++ : a--;  
  - 이중 삼항 연산자도 가능  
    - 예) a < b ? a-- : (b==0 ? a++ : b--);  

•[Exam_Triple](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Triple.java)  
•[Exercise_Triple1](https://github.com/icici0093/KH_Study/blob/main/code/Exercise_Triple1.java)  
•[Exercise_Triple2](https://github.com/icici0093/KH_Study/blob/main/code/Exercise_Triple2.java)  
    
# 대입연산자  
  - 복합 대입 연산자 +=, -=, *=, /=, %=  
    자기자신과 연산을 하고 연산한 결과를 자기자신에게 누적 대입(일반 대입연산자보다 처리속도가 빠르다)  
      - A += 10 ➡️ A = A + 10  
      - A -= 10 ➡️ A = A - 10  
      - A *= 10 ➡️ A = A * 10  
      - A /= 10 ➡️ A = A / 10  
      - A %= 10 ➡️ A = A % 10  
      
  - 비트 복합 대입연산자 &=,|=,^=,>>=,<<=  
     - A &= 10 ➡️ A = A & 10 논리곱 복합대입  
     - A |= 10 ➡️ A = A | 10 논리합 복합대입  
     - A ^= 10 ➡️ A = A ^ 10 베타논리합 복합대입  
     - A >>= 10 ➡️ A = A >> 10 우측쉬프트 복합대입  
     - A <<= 10 ➡️ A = A << 10 좌측쉬프트 복합대입  
     
•[Exam_Compound](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Compound.java)  
•[Exam_Comparison](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Comparison.java)  

# 연산자의 우선순위  
  - 괄호의 우선순위가 제일 높다.  
  - 산술연산자 > 비교연산자 > 논리연산자 > 대입연산자 **(대입은 제일 마지막에 수행된다.)**  
  - 단항연산자 > 이행연산자 > 삼항연산자 **(단항연산자의 우선순위가 이항연산자보다 높다.)**  
  - 단항연산자와 대입연산자를 제외한 모든 연산의 진행방향은 왼쪽에서 오른쪽이다.  
