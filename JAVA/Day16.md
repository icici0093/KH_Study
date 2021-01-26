### Day 16  

# 예외처리  
  - 오류(Error)  
    1. 프로그램 수행시 치명적 상황이 발생한 것  
    2. 소스상 해결이 불가능한 것을 에러라고 하며, 프로그램이 비정상적으로 종료됨  
  - 예외(Exception)  
    - 프로그램 오류 중 코드 수정을 통해 수습될 수 있는 오류  

# 오류의 종류  
  - 컴파일 에러 : 소스상의 문법 Error  
  - 논리 에러 : 문법상 문제가 없고, 런타임에러도 발생하지 않지만 개발자 의도대로 작동하지 않음  
  - 런타임 에러 : 입력값이 틀리거나 계산식의 오류로 발생  
  - 시스템 에러 : 컴퓨터 오작동으로 인한 에러  
  
# 예외처리(try ~ catch)의 목적  
  - 목적 : 프로그램의 비정상 종료를 막고 정상적인 실행상태를 유지함  
  - 어떻게 : 예외상황이 발생된 경우에 처리로직을 만듬  
    
# Exception 클래스 상속도  
  - 소스코드상에서 반드시 예외처리해야되는 **Checked Exception**  
  - 소스코드상에서 명시적인 처리를 강제하지 않는 **Unchecked Exception**  

# finally 사용 이유  
  - App과 DB를 연결해서 사용하는 경우 finally를 통해 DB 연결해제 처리를하여 DB에 영향을 주지 않도록 설정  
  
# Exception 처리 방법  
  1. Exception 처리를 호출한 메소드에게 위임  
    - 메소드 선언시 **throws ExceptionName**문을 추가하여 호출한 사우이 메소드에게 처리를 위임하여 해결  
    - 계속적으로 위임하면 main()까지 위임하게 되고, main()까지 가서도 예외처리가 되지 않으면 JVM이 비정상 종료됨  
  2. Exception을 발생한 곳에서 직접 처리  
    - try ~ catch문을 이용  
      - try : exception 발생할 가능성이 있는 코드를 try구문 안에 기술  
      - catch : 해당하는 exception 처리를 기술. 여러개의 exception 처리 가능(상속관계 고려)  
      - finally : exception 발생 여부에 관계없이 꼭 처리해야 하는 로직을 구현(System.exit(0)을 만나면 무조건 프로그램 종료)  
      
• [Exam_Exception4](https://github.com/icici0093/KH_Study/blob/main/code/Day_16_Exception/src/com/kh/exception/Exam_Exception4.java)  
• [Exam_Exception5](https://github.com/icici0093/KH_Study/blob/main/code/Day_16_Exception/src/com/kh/exception/Exam_Exception5.java)  
• [Exam_Exception6](https://github.com/icici0093/KH_Study/blob/main/code/Day_16_Exception/src/com/kh/exception/Exam_Exception6.java)  
throws ⬇️⬇️  
• [Exam_Exception6_2](https://github.com/icici0093/KH_Study/blob/main/code/Day_16_Exception/src/com/kh/exception/Exam_Exception6_2.java)  
throws ⬇️⬇️  
• [Run](https://github.com/icici0093/KH_Study/blob/main/code/Day_16_Exception/src/com/kh/exception/Run.java)  
• [Exam_Finally](https://github.com/icici0093/KH_Study/blob/main/code/Day_16_Exception/src/com/kh/exception/Exam_Finally.java)  

      
# 입출력(I/O)  
  - Input과 Output의 약자로, 컴퓨터 내부 또는 외부 장치와 프로그램간의 데이터를 주고받는 것  
  - 다양한 매체에 존재하는 데이터들을 사용하기 위해 입출력 데이터를 처리할 공통적인 방법으로 스트림을 이용  
  
# 스트림  
  - 입출력 장치에서 데이터를 읽고 쓰기 위해 자바에서 제공하는 class  
  - 각각의 장치마다 연결할 수 있는 각각의 스트림이 존재  
  - 하나의 스트림으로 입출력을 동시에 수행할 수 없고, 입출력을 동시에 수행하려면 2개의 스트림이 필요(단방향 통신)  
  
# InputStream  
  - 바이트 기반 입력 스트림의 최상위 클래스로 추상클래스임  
  
  
    
    
