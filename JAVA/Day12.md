# Day 12(다형성)  

### 다형성  
  - '여러 개의 형태를 갖는다'는 의미로, 객체지향 프로그래밍 3대 특징 중 하나  
  - **상속을 이용한 기술**  
    - 자식 객체를 부모클래스타입의 변수로 다룰 수 있는 기술(Parent parent = new Child();)  
  - 객체배열과 다형성  
    - 다형성을 이용하여 상속관계에 있는 여러 개의 자식클래스를 부모 클래스의 배열에 저장 가능  
  - 매개변수와 다형성  
    - 메소드 호출시 다형성을 이용하여 **부모타입의 매개변수를 사용**하면 **자식타입의 객체를 받을 수 있음**  

### 클래스 형변환  
  - Up-Casting  
    - 상속관계에 있는 부모, 자식 클래스 간에 **부모타입의 참조형 변수**가 모든 자식 타입의 객체 주소를 받을 수 있음  
    예) Sonata클래스가 Car클래스의 후손일 경우  
      Car c = new Sonata(); (<-- Sonata클래스가 Car클래스를 상속받고있기 때문에 가능)  
      Sonata 클래스형 -> Car 클래스형으로 바뀜  
    (자식객체의 주소를 전달받은 부모타입의 참조변수는 원래 부모타입의 멤버만 참조 가능)  
  - Down-Casting  
    - 자식객체의 주소를 받은 부모 참조형 변수를 가지고 자식의 멤버를 참조해야 할 경우, 후손 클래스 타입으로 참조형 변수를 형 변환해야 함  
    - 자동으로 처리되지 않기 때문에 반드시 후손타입을 **명시**해서 형변환 해야 함  
    예) Sonata클래스가 Car클래스 후손일 경우  
      Car c = new Sonata();  
      ((Sonata)c).moveSonata();  
    (클래스간의 형 변환은 **반드시 상속관계**에 있는 클래스끼리만 가능함  

### instanceof 연산자  
  - 현재 참조형 변수가 어떤 클래스 형의 객체 주소를 참조하고 있는지 확인할 때 사용  
  - 클래스타입이 맞으면 true, 아니면 false값을 반환  
    - if(레퍼런스 instanceof 클래스타입){  
      //참일때 처리할 내용  
      //해당 클래스 타입으로 down casting  
      }  

• [Exam_Poly](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Poly.java)  

### 바인딩  
  - 실제 실행할 메소드 코드와 호출하는 코드를 연결시키는 것  
  - 프로그램이 실행되기 전에 컴파일이 되면서 모든 메소드를 정적 바인딩 됨  
  - 동적 바인딩  
    - 컴파일시 정적바인딩된 메소드를 실행할 당시의 객체 타입을 기준으로 바인딩 되는 것  
    - 성립 요건 :  
      - 상속관계로 이루어져 다형성이 적용된 경우, 메소드 오버라이딩이 되어있으면 정적으로 바인딩 된 메소드 코드보다 **오버라이딩 된 메소드 코드를 우선 수행 함**  
      
### 추상클래스 (abstract class)  
  - 몸체 없는({}) 메소드(abstract가 있는 메소드)를 포함한 클래스  
  - 추상 클래스일 경우 클래스 선언부에 abstract 키워드를 사용  
  - 상속시 반드시 구현해야 하는 메소드(오버라이딩 강제화)  
  - new 연산자 사용 불가 !  
  - 특징 :  
    1. 미완성 클래스(abstract 키워드 사용). **자체적으로 객체 생성 불가** (반드시 상속하여 객체 생성)  
    2. abstract 메소드가 포함된 클래스 (반드시 abstract)  
      - abstract 메소드가 없어도 abstract 클래스 선언 가능  
    3. 일반적인 메소드, 변수도 포함 가능  
    4. 객체 생성은 안되나 참조형 변수 type으로는 사용 가능  
    
### 인터페이스  
  - 상수형 필드와 추상 메소드만을 작성할 수 있는 추상 클래스의 변형체  
  - 메소드의 통일성을 부여하기 위해 추상 메소드만 따로 모아 놓은 것  
  - 상속시 인터페이스 내에 정의된 모든 추상 메소드를 구현해야 함  
  - 특징  
    1. 모든 인터페이스의 메소드는 묵시적으로 public이고 abstract임  
    2. 변수는 묵시적으로 public static final임 (따라서 인터페이스 변수의 값 변경 시도는 컴파일시 에러를 발생)   
    3. **객체 생성은 안되나, 참조형 번수로는 가능**  
  - 장점  
    1. 공통 기능상의 일관성 제공  
    2. **공동 작업을 위한 인터페이스 제공**  
  - 사용 목적  
    1. 사양서 역할의 인터페이스  
    2. 다중 상속이 없는 자바에 다중 상속 지원  
    3. 클래스와 클래스를 연결해주는 인터페이스  
    
|구분   |인터페이스   |추상클래스    
|----|-------:|:-------|
|상속|다중상속    |단일상속    |
|구현|implements 사용 |extends 사용 |
|추상메소드 |모든 메소드는 abstract|abstract 메소드 0개 이상|
|abstract|묵시적으로 abstract|명시적 사용|
|객체|객체 생성 불가|객체 생성 불가| 
|용도|reference 타입|refrence 타입|

• [ManageStudent](https://github.com/icici0093/KH_Study/blob/main/code/ManageStudent.java)  
• [StudentProgram](https://github.com/icici0093/KH_Study/blob/main/code/StudentProgram.java)  

• [BTotal](https://github.com/icici0093/KH_Study/blob/main/code/BTotal.java)  
• [CTotal](https://github.com/icici0093/KH_Study/blob/main/code/CTotal.java)  
• [TotalConsole](https://github.com/icici0093/KH_Study/blob/main/code/TotalConsole.java)  
• [TotalInterface](https://github.com/icici0093/KH_Study/blob/main/code/TotalInterface.java)  
• [TotalRun](https://github.com/icici0093/KH_Study/blob/main/code/TotalRun.java)  

• [Exam_Parent](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Parent.java)  
• [Exam_Super](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Super.java)  
• [SampleProgram](https://github.com/icici0093/KH_Study/blob/main/code/SampleProgram.java)  

• [ITBankStudent](https://github.com/icici0093/KH_Study/blob/main/code/ITBankStudent.java)  
• [KhStudent2](https://github.com/icici0093/KH_Study/blob/main/code/KhStudent2.java)  
• [Student3](https://github.com/icici0093/KH_Study/blob/main/code/Student3.java)  
• [StudentConsole2](https://github.com/icici0093/KH_Study/blob/main/code/StudentConsole2.java)  
• [StudentList3](https://github.com/icici0093/KH_Study/blob/main/code/StudentList3.java)  
• [StudentRun3](https://github.com/icici0093/KH_Study/blob/main/code/StudentRun3.java)  
• [TestProgram2](https://github.com/icici0093/KH_Study/blob/main/code/TestProgram2.java)  

• [A](https://github.com/icici0093/KH_Study/blob/main/code/A.java)  
• [B](https://github.com/icici0093/KH_Study/blob/main/code/B.java)  
• [Program](https://github.com/icici0093/KH_Study/blob/main/code/Program.java)  
• [X](https://github.com/icici0093/KH_Study/blob/main/code/X.java)  

• [Leopard](https://github.com/icici0093/KH_Study/blob/main/code/Leopard.java)  
• [Lion](https://github.com/icici0093/KH_Study/blob/main/code/Lion.java)  
• [Predator](https://github.com/icici0093/KH_Study/blob/main/code/Predator.java)  
• [Tiger](https://github.com/icici0093/KH_Study/blob/main/code/Tiger.java)  
• [ZooKeeper](https://github.com/icici0093/KH_Study/blob/main/code/ZooKeeper.java)  
• [ZooProgram](https://github.com/icici0093/KH_Study/blob/main/code/ZooProgram.java)  

      
      
