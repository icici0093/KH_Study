# Day 02 변수와 자료형  

### Data와 정보  
  - 데이터(Data)  
    - 데이터란 관찰의 결과로 나타난 정량적 혹은 정성적인 **실제 값**을 의미한다.  
  - 정보(Information)  
    - 정보란 데이터를 기반으로 하여 의미를 부여한 것이다.  
  **JAVA에서 변수는 반드시 선언 후에 값을 대입해야 한다.**  
  
• [Exam_01](https://github.com/icici0093/KH_Study/blob/main/code/Exam_01.java)  
 
### 변수의 선언 / 변수의 초기화  
  - 메모리 상에 데이터를 저장할 수 있는 공간을 할당하는 것  
    int smallNum;  
  - 변수를 사용하기 전에 처음으로 값을 저장하는 것  
    int smallNum = 25;  
    
    **필수사항**  
    1. 대소문자가 구분되며 길이 제한이 없다.  
    2. 예약어를 사용하면 안 된다.  
    3. 숫자로 시작하면 안 된다.  
      예) age1은 가능하짐나 1age는 불가능  
    4. 특수문자는 '_'와 '$'만 허용한다.  
      예) sh@rp는 불가는하지만 $harp는 가능  
    
    **권장사항**  
    1. 클래스 이름의 첫 글자는 항상 대문자로  
      - 변수와 메서드 첫글자는 항상 소문자!  
    2. 여러 단어 이름은 단어의 첫 글자를 대문자로  
      예)lastIndexof, stringBuffer  
    3. 상수의 이름은 대문자, 단어는 _로 구분한다.  
      예) MAX_VALUE  
      
### 변수의 자료형  
  - 정수 : 소수점을 포함하지 않은 수 (음수, 0, 양수)  
  - 소수 : 소수점을 포함한 수 (소수)  
  - 문자 : ' '안에 표현한 문자  
  - 문자열 : " "안에 표현한 문자  
  * 문자는 1글자만 표기할 수 있고, 문자열은 1글자 이상을 표기할 수 있음  
  * 문자는 사실상 하나의 숫자값임 (아스키코드값)  
  
• [Exam_02](https://github.com/icici0093/KH_Study/blob/main/code/Exam_02.java)  
• [Exam_03](https://github.com/icici0093/KH_Study/blob/main/code/Exam_03.java)  
  
  - 기본형(Primitive type)  
    - **실제 데이터값을 저장**  
    - 논리형, 문자형, 정수형, 실수형으로 나눠지고 8개의 자료형이 있다.  
    - 각 자료형별 데이터 저장크기가 다름  
  - 참조형(Reference type)  
    - 데이터가 저장되어 있는 **주소를 저장**(객체의 주소)  
    - 기본형을 제외한 나머지(String 등), **사용자정의 자료형**(class)  
    - 4byte의 공간을 저장공간으로 할당  
    
• [Exercise_01](https://github.com/icici0093/KH_Study/blob/main/code/Exercise_01.java)  

### 상수  
  상수란?  
  - 수학에서 변하지 않는 값을 의미하고, 컴퓨터에서는 **한번만 저장할 수 있는 공간**으로 초기화 이후 다른 데이터값을 대입할 수 없다.  
    final int AGE = 20;  
    
### 리터럴  
  리터럴이란?
   - 변수에 대입되는 값 자체를 의미  
   
### 컴퓨터의 동작 원칙  
  1. 반드시 같은 데이터타입 간에 연산을 한다.  
  2. 반드시 동일한 데이터타입의 값을 동일한 데이터타입의 변수에 대입한다.  
  3. 결과값 또한 동일한 데이터타입의 값을 가진다.  
    위의 기본원칙이 지켜지지 않을 경우 **프로그래밍언어가 암묵적으로, 혹은 사용자에 의해 명시적으로 형변환을 해야한다.**  
### 자동 형변환이 일어나는 경우  
  1. 작은 데이터 타입에서 큰 데이터 타입으로는 자동 형변환이 가능하다.  
  2. 정수형은 실수형으로 자동 형변환이 가능하다.  
  3. char형은 int형으로 자동 형변환이 가능하다.  

  byte ➡️ short ➡️ int ➡️ long ➡️ float ➡️ double  

  예) int a = 12;  
      double d = 3.3;  
      double result = a + d;  
      a + d ➡️ 12 + 3.3 ➡️ 12.0 + 3.3 ➡️ 15.3  
  주의점 : 데이터가 큰 자료형에서 작은 자료형으로 변경 시 데이터 손실이 있을 수 있어 유의해야 한다.  

• [Exam_Casting](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Casting.java)  


### 입력 Scanner Class  
  - 사용자로부터 입력되는 정수, 실수, 문자열을 처리하는 클래스  
  - 사용할 떈 Scanner Class import 작성  
    - import.java.util.Scanner;  
  - Scanner 객체 생성 후 사용  
    - Scanner scanner = new Scanner(System.in);  
    
  - 키보드 입력값 받기  
    - 정수 : scanner.nextInt();  
    - 실수 : scanner.nextFloat();, scanner.nextDouble();  
    - 문자열 : scanner.next();, scanner.nextLine();  

  - 문자를 입력받는 법 : Scanner.next().charAt(0); <-- 첫번째 값 하나만 가져옴.  
• [Exam_Scanner](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Scanner.java)  
• [Exercise_Character](https://github.com/icici0093/KH_Study/blob/main/code/Exercise_Character.java)  

### 출력 메소드  
  - System.out.print(); : ()안의 변수, 문자, 숫자, 논리값을 모니터에 출력해주는 메소드  
  - System.out.println(); : print와 동일하게 출력해주지만 출력 후 자동으로 출력창에 줄바꿈을 해주는 메소드  
  - System.out.printf("%형식", 변수); : 정해져있는 형식에 맞춰서 그 형식에 맞는 값(변수)를 줄바꿈 하지 않고 출력  

  - 정수표현 : %d(정수형), %o(8진수), %x(16진수)  
  - 실수표현 : %f(실수. 소수점 아래 6자리), %e(지수형태표현), %g(%e와 %f중 더 짧은 표현을 사용), %A(16진수 실수)  
  - 문자/문자열 : %c(문자), %s(문자열)  
  - 불린형 : %b(논리형)  
  
  - 너비 및 정렬방법  
    - %5d : 5칸을 확보하고 오른쪽정렬  
    - %-5d : 5칸을 확보하고 왼쪽정렬  
    - %.2f : 소수점 아래 2자리까지만 표시  
