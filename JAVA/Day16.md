# Day 16  

### 예외처리  
  - 오류(Error)  
    1. 프로그램 수행시 치명적 상황이 발생한 것  
    2. 소스상 해결이 불가능한 것을 에러라고 하며, 프로그램이 비정상적으로 종료됨  
  - 예외(Exception)  
    - 프로그램 오류 중 코드 수정을 통해 수습될 수 있는 오류  

### 오류의 종류  
  - 컴파일 에러 : 소스상의 문법 Error  
  - 논리 에러 : 문법상 문제가 없고, 런타임에러도 발생하지 않지만 개발자 의도대로 작동하지 않음  
  - 런타임 에러 : 입력값이 틀리거나 계산식의 오류로 발생  
  - 시스템 에러 : 컴퓨터 오작동으로 인한 에러  
  
### 예외처리(try ~ catch)의 목적  
  - 목적 : 프로그램의 비정상 종료를 막고 정상적인 실행상태를 유지함  
  - 어떻게 : 예외상황이 발생된 경우에 처리로직을 만듬  
    
### Exception 클래스 상속도  
  - 소스코드상에서 반드시 예외처리해야되는 **Checked Exception**  
  - 소스코드상에서 명시적인 처리를 강제하지 않는 **Unchecked Exception**  

### finally 사용 이유  
  - App과 DB를 연결해서 사용하는 경우 finally를 통해 DB 연결해제 처리를하여 DB에 영향을 주지 않도록 설정  
  
### Exception 처리 방법  
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

      
### 입출력(I/O)  
  - Input과 Output의 약자로, 컴퓨터 내부 또는 외부 장치와 프로그램간의 데이터를 주고받는 것  
  - 다양한 매체에 존재하는 데이터들을 사용하기 위해 입출력 데이터를 처리할 공통적인 방법으로 스트림을 이용  
  
### 스트림  
  - 입출력 장치에서 데이터를 읽고 쓰기 위해 자바에서 제공하는 class  
  - 각각의 장치마다 연결할 수 있는 각각의 스트림이 존재  
  - 하나의 스트림으로 입출력을 동시에 수행할 수 없고, 입출력을 동시에 수행하려면 2개의 스트림이 필요(단방향 통신)  
  
#### InputStream  
  - 바이트 기반 입력 스트림의 최상위 클래스로 추상클래스  
![InputStream](https://user-images.githubusercontent.com/68003227/105964394-76082080-60c5-11eb-92d6-10cc1371849b.png)  

• [Exam_Read](https://github.com/icici0093/KH_Study/blob/main/code/Day_16_Stream/src/com/kh/inputstream/Exam_Read.java)  
• [Exam_ReadByte](https://github.com/icici0093/KH_Study/blob/main/code/Day_16_Stream/src/com/kh/inputstream/Exam_ReadByte.java)  
• [Exam_ReadByteOff](https://github.com/icici0093/KH_Study/blob/main/code/Day_16_Stream/src/com/kh/inputstream/Exam_ReadByteOff.java)  

#### OutputStream  
  - 바이트 기반 출력 스트림의 최상위 클래스로 추상클래스  
![OutputStream](https://user-images.githubusercontent.com/68003227/105964404-799ba780-60c5-11eb-8e68-28184553f33c.png)  

• [Exam_Write](https://github.com/icici0093/KH_Study/blob/main/code/Day_16_Stream/src/com/kh/outputstream/Exam_Write.java)  
• [Exam_Write2](https://github.com/icici0093/KH_Study/blob/main/code/Day_16_Stream/src/com/kh/outputstream/Exam_Write2.java)  
• [Exam_WriteByte](https://github.com/icici0093/KH_Study/blob/main/code/Day_16_Stream/src/com/kh/outputstream/Exam_WriteByte.java)  
• [Exam_WriteByteOff](https://github.com/icici0093/KH_Study/blob/main/code/Day_16_Stream/src/com/kh/outputstream/Exam_WriteByteOff.java)  

#### Reader  
  - 문자 기반 입력 스트림의 최상위 클래스로 추상클래스  
![Reader](https://user-images.githubusercontent.com/68003227/105964407-7a343e00-60c5-11eb-851a-f69f196bfbbe.png)  
  
• [Exam_Read](https://github.com/icici0093/KH_Study/blob/main/code/Day_17_Stream/src/com/kh/reader/Exam_Read.java)  
• [Exam_ReadChar](https://github.com/icici0093/KH_Study/blob/main/code/Day_17_Stream/src/com/kh/reader/Exam_ReadChar.java)  
• [Exam_ReadCharOff](https://github.com/icici0093/KH_Study/blob/main/code/Day_17_Stream/src/com/kh/reader/Exam_ReadCharOff.java)  

#### Writer  
  - 문자 기반 출력 스트림의 최상위 클래스로 추상클래스  
![Writer](https://user-images.githubusercontent.com/68003227/105964411-7b656b00-60c5-11eb-962b-c7d6fb65d781.png)  

• [Exam_OutputStream](https://github.com/icici0093/KH_Study/blob/main/code/Day_16_Stream/src/com/kh/stream/Exam_OutputStream.java)  
• [Exam_Write](https://github.com/icici0093/KH_Study/blob/main/code/Day_17_Stream/src/com/kh/writer/Exam_Write.java)  
• [Exam_WriteChar](https://github.com/icici0093/KH_Study/blob/main/code/Day_16_Stream/src/com/kh/stream/Exam_WriteChar.java)  
• [Exam_WriteCharOff](https://github.com/icici0093/KH_Study/blob/main/code/Day_16_Stream/src/com/kh/stream/Exam_WriteCharOff.java)  
• [Exam_WriteStr](https://github.com/icici0093/KH_Study/blob/main/code/Day_16_Stream/src/com/kh/stream/Exam_WriteStr.java)  

#### File  
  - 파일 시스템의 파일을 표현하는 클래스  
  - 파일의 크기, 속성, 이름 등 정보를 제공하며 생성 및 삭제 기능도 제공  
  - File file = new File("c:\\temp\\file.txt");
  
#### 보조스트림(프로세스 스트림)  
  - 스트림의 기능을 향상시키거나 새로운 기능을 추가하기 위해 사용  
  - **실제 데이터를 주고받는 스트림이 아니기 때문에 입출력 처리를 할 수 없고**, 스트림을 먼저 생성한 다음 이를 이용해서 **보조스트림을 생성**해야 함  
  - 종류 :  
    - 문자 변환(Input/OutputStreamReader) :  
      - 소스 스트림이 바이트 기반 스트림이지만 데이터가 문자일 경우 사용  
      - Reader와 Writer는 문자 단위로 입출력을 하기 때문에 데이터가 문자인 경우에 바이트 기반 스트림보다 편리하게 사용 가능  
    - 입출력 성능 향상(BufferedInput/OutputStream) :  
      - 입출력 소스와 직접 작업하지 않고 버퍼(Buffer)에 데이터를 모아 한꺼번에 작업을 하여 실행 성능이 향상된다(입출력 횟수 줄임)  
    - 기본 데이터 타입 출력(DataInput/OutputStream) :  
      - 기본 자료형별 데이터의 읽고 쓰기가 가능하도록 기능을 제공  
      - 입력된 자료형의 순서와 출력될 자료형의 순서가 일치해야 함  
    - 객체 입출력(ObjectInput/OutputStream) :  
      - 객체를 파일 또는 네트워크로 입출력 할 수 있는 기능을 제공  
      - 객체는 문자가 아니므로 바이트 기반 스트림으로 데이터를 변경해 주는 작업인 직렬화를 반드시 해야 함  
      
  - 사용 예시 )  
    // 기반 스트림 생성  
    FileInputStream fis = new FileInputStream("sample.txt");  
    // 보조스트림 생성  
    BufferedInputStream bis = new BufferedInputStream(fis);  // new BufferedInputStream(new FileInputStream(“sam.txt”));와 같음  
    // 보조스트림으로부터 데이터 읽어옴  
    bis.read();  
  
  
• [Exam_File](https://github.com/icici0093/KH_Study/blob/main/code/Day_17_Stream/src/com/kh/fileexam/Exam_File.java)  
• [Exam_File2](https://github.com/icici0093/KH_Study/blob/main/code/Day_17_Stream/src/com/kh/fileexam/Exam_File2.java)  

• [Exam_FileInputStream](https://github.com/icici0093/KH_Study/blob/main/code/Day_17_Stream/src/com/kh/filestream/Exam_FileInputStream.java)  
• [Exam_FileOutputStream](https://github.com/icici0093/KH_Study/blob/main/code/Day_17_Stream/src/com/kh/filestream/Exam_FileOutputStream.java)  
• [Excercise_ByteStream](https://github.com/icici0093/KH_Study/blob/main/code/Day_17_Stream/src/com/kh/filestream/Excercise_ByteStream.java)  
  
#### 직렬화  
  - Serializable 인터페이스를 implements하여 구현  
  - 객체 직렬화시 private 필드를 포함한 모든 필드를 바이트로 변환하지만 transient키워드를 사용한 필드는 직렬화에서 제외  
  - 역직렬화 :  
    - 직렬화된 객체를 역직렬화 할 때는 직렬화 했을 때와 같은 클래스를 사용  
    - 하지만 클래스의 이름이 같더라도 클래스의 내용이 변경된 경우 역직렬화에 실패함  
  
  
  
  
  
  
    
    
