### Day 11 (상속)  

# 상속  
  - 다른 클래스가 가지고 있는 멤버(필드와 메소드)들을 새로 작성할 클래스에서 직접 만들지 않고, 
    상속을 받음으로써 새 클래스가 자신의 멤버처럼 사용할 수 있는 기능  
  - 상속의 목적 : **클래스의 재사용**, 연관된 일련의 클래스들에 대해 **공통적인 규약을 정의**  
  - 상속의 장점 :  
    1. 적은 양의 코드로 새로운 클래스 작성 가능  
    2. **코드의 중복을 제거**하여 **프로그램의 생산성과 유지보수**에 기여  
    3. 코드를 공통적으로 관리하기에 **코드의 추가 및 변경이 용이**  
    
# Has a 포함관계  
  - 한 클래스의 멤버변수로 다른 클래스타입의 참조변수를 선언  
  ![Has a](https://user-images.githubusercontent.com/68003227/105010926-aaedf500-5a7f-11eb-8a42-7ab335223269.png)  
  
# Is a 상속관계  
  - 부모클래스를 자식클래스가 상속  
![Is a](https://user-images.githubusercontent.com/68003227/105010927-aaedf500-5a7f-11eb-9143-c3dcf8463a87.png)  
  
# super.  
  - 부모객체의 생성자를 호출하는 메소드  
  - **반드시 첫 줄에만 작성 할 수 있음**(부모객체의 생성자를 호출할 부모 생성자가 가장 먼저 실행이 되어야 하기 때문)  
  - 부모객체의 주소가 있는 참조변수  
  
# 상속의 특징  
  - 부모클래스의 생성자 상속 안됨  
    - 자식클래스 객체 생성시 부모클래스 생성자가 먼저 실행  
    - 자식클래스 생성자 안에서 부모클래스 생성자 호출을 명시하고싶으면 super()활용  
  - 부모의 private 멤버는 상속은 되지만 **직접 접근 불가**  
    - 자식 객체 생성시 부모의 필드값도 전달받은 경우, 자식 생성자 안에서 부모의 private 필드에 직접 접근해서 대입 못함  
    - super() 이용, 전달받은 부모 필드값을 부모생성자 쪽으로 넘겨서 생성  
    - setter, getter 메소드 이용  
  - 모든 클래스는 Object 클래스의 후손  
    - Object클래스가 제공하는 메소드를 오버라이딩해서 메소드 재구현 가능  
  - 단일상속(Single inheritance)  
    - 자바에서는 다중상속을 지원하지 않음! **단일상속만을 지원**함  

# 오버라이딩(Overriding)  
  - 자식 클래스가 상속받은 부모 메소드를 재작성하는 것  
  - 부모가 제공하는 기능을 자식이 일부 고쳐 사용하겠다는 의미, 후손객체를 통해 실행 시 **후손것이 우선권을 가짐**  
  - 메소드 헤드라인 위에 반드시 Annotation 표시 (@Override)  
  - 성립 요건 :  
    1. **이름이 동일**해야 함  
    2. **매개변수의 개수와 타입이 동일**해야 함  
    3. **리턴 타입이 동일**해야 함  
    4. private 메소드의 오버라이딩은 불가능  
    
|대상   |                       사용 가능한 제어자  |
|------|-------------------------------------:|
|클래스  |public, (default), final, abstract    |
|메소드  |모든 접근 제어자, final, abstract, static | 
|변수   |모든 접근 제어자, final, static           |
|지역변수|final                                 |  
  - 메소드에 static과 abstract를 함께 사용할 수 없다.  
  - 클래스에 abstract와 final을 동시에 사용할 수 없다.  
  - abstract 메소드의 접근제어자가 private일 수 없다.  

![Overriding](https://user-images.githubusercontent.com/68003227/105010920-a9243180-5a7f-11eb-83ea-ba0cc7681754.png)  
• [SampleProgram](https://github.com/icici0093/KH_Study/blob/main/code/SampleProgram.java)  

  
| Overriding(재정의)                                 | Overloading(다중정의) |
|--------------------------------------------------|-------------------------------------:|
| 메소드를 하위 클래스에서 정의                           | 메소드를 같은 클래스에서 정의                |
| 메소드 이름 동일                                     | 메소드 이름 동일                         | 
| 매개변수(개수 및 데이터 타입) 동일                       | 매개변수(개수나 데이터 타입) 다름            |
| 리턴 타입 동일                                      | 리턴 타입 다를 수 있음                    |  
| 접근 제어자 : 상위 메소드의 접근 범위보다 넓거나 같아야 함    | 접근 제어자 : X                          |
| 예외처리 : 같은 예외 형식이거나 더 구체적인 예외 형식이어야 함 | 예외처리 : X                            |
  
• [Exam_Parent](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Parent.java)  
• [Exam_Super](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Super.java)  

• [KhStudent](https://github.com/icici0093/KH_Study/blob/main/code/KhStudent.java)    
• [TestProgram](https://github.com/icici0093/KH_Study/blob/main/code/TestProgram.java)    

• [StudentRun2](https://github.com/icici0093/KH_Study/blob/main/code/StudentRun2.java)  
• [StudentConsole](https://github.com/icici0093/KH_Study/blob/main/code/StudentConsole.java)  
• [StudentList2](https://github.com/icici0093/KH_Study/blob/main/code/StudentList2.java)  
• [Student2](https://github.com/icici0093/KH_Study/blob/main/code/Student2.java)  

# Student 작동 원리
![Student 작동 원리](https://user-images.githubusercontent.com/68003227/105010909-a6294100-5a7f-11eb-9553-58c596db9aa0.png)

