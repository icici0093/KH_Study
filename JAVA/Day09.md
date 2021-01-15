### Day 09  

# 메소드란?  
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

# 메소드의 종류  
  - 반환형 O, 매개변수 O  
		System.out.println(calcNum(1));  
	- 반환형 X, 매개변수 O  
		calcNumPrint(1);  
	- 반환형 O, 매개변수 X  
		System.out.println(calcNum());  
	- 반환형 X, 매개변수 X  
		calcNumPrint();  

# 메소드의 호출  
  - 매개변수 있는 경우 : 참조형 변수명.매소드명(매개변수);  
  - 매개변수 없는 경우 : 참조형 변수명.매소드명();  
  예) ps.setAge(19); <-- 매개변수 있는 경우  
      int age = ps.getAge(); <-- 매개변수 없는 경우  
