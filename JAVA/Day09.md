# Day 09  

### 메소드란?  
  - 수학의 함수와 비슷하며 호출을 통해 사용한다. 
  - 호출시 전달값은 있거나 없을 수 있다.  
  - 함수가 호출되면 내부에 작성된 연산으 수행하게되며, 연산 후 결과값/반환값은 있거나 없을 수 있다.  

  - 표현식  
    - [접근제한자] [예약어] 반환형 메소드명(매개변수){    
        //실행내용 작성                               
      }                                         
      예) public void showInformation(){  
             System.out.println(userName);  
          }  

### 메소드의 종류  
  - 반환형 O, 매개변수 O  
		System.out.println(calcNum(1));  
	- 반환형 X, 매개변수 O  
		calcNumPrint(1);  
	- 반환형 O, 매개변수 X  
		System.out.println(calcNum());  
	- 반환형 X, 매개변수 X  
		calcNumPrint();  

• [Exam_Method1](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Method1.java)  
• [StudentProgram](https://github.com/icici0093/KH_Study/blob/main/code/StudentProgram.java)  
• [Motel_Program](https://github.com/icici0093/KH_Study/blob/main/code/Motel_Program.java)  

### 메소드의 호출  
  - 매개변수 있는 경우 : 참조형 변수명.매소드명(매개변수);  
  - 매개변수 없는 경우 : 참조형 변수명.매소드명();  
  예) ps.setAge(19); <-- 매개변수 있는 경우  
      int age = ps.getAge(); <-- 매개변수 없는 경우  
      
### 자바의 예외처리  
  - 컴파일 오류 
    1. 문법에 맞지 않게 작성된 코드(;, 변수명 중복, 등등)  
    2. 컴파일할 때 발견 
  - 예외
    1. 오동작이나 결괴에 악영향을 미칠 수 있는 실행 중 발생한 오류 
	ex) 0으로 나눌 때 
	배열의 인덱스보다 큰 원소를 접근하려고 할 때 
	존재하지 않는 파일을 읽으려고 할 때
	정수 입력을 기다리는 코드가 실행되고 있는데 문자가 입력된 경우 
  - 자바 코드 예외 처리 가능  
  
• [Exam_Exception1](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Exception1.java)  
• [Exam_Exception2](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Exception2.java)  
• [Exam_Exception3](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Exception3.java)  
