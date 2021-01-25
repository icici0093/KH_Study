### Day 15 (API)  

# API(Application Programming Interface)  
  - 프로그래밍을 할때 특정 기능을 처리할 수 있도록 만들어 놓은 클래스나 메소드(함수)의 집합  
  
# String, StringBuffer, StringBuilder  
  - String  
    - 문자열 값을 수정 못하는 immutable(불변)  
    - 수정시 수정된 문자열이 새로 할당되어 새 주소를 넘김  
  - StringBuffer  
    - 문자열 값을 수정할 수 있는 mutable(가변)  
    - 기존 문자열에 수정되어 적용(수정, 삭제 등)  
    - 기본 16문자 크기로 지정된 버퍼를 이용, 크기를 증가시킬 수 있음  
    - 쓰레드 safe 기능을 제공(성능저하요인)  
  - StringBuilder  
    - String Buffer와 동일  
    - 쓰레드 safe기능을 제공하지 않음  
    
• [Exam_String](https://github.com/icici0093/KH_Study/blob/main/code/Day_15_API/src/com/kh/javaapi/Exam_String.java)  
• [Exam_StringBuffer](https://github.com/icici0093/KH_Study/blob/main/code/Day_15_API/src/com/kh/javaapi/Exam_StringBuffer.java)  
• [Exam_StringTokenizer](https://github.com/icici0093/KH_Study/blob/main/code/Day_15_API/src/com/kh/javaapi/Exam_StringTokenizer.java)  

# Wrapper 클래스 형변환  
  - 오토박싱  
    - 기본자료형 -> Wrapper클래스 변환  
    Integer num = new Integer(3); -> Integer num = 3;
  - 오토언박싱  
    - Wrapper클래스 -> 기본자료형 변환  
    int n = num.intValue(); -> int n = num;  
    
  - String을 기본 자료형으로 바꾸기  
    - "3" -> 3
    - int i = Integer.parseInt("3")
    - Integer.parseInt("3") + 3 => 6

  - 기본 자료형을 String으로 바꾸기  
    - String i = Integer.valueOf(3).toString();
    - String.valueOf(1234), ""+1234 
    
• [Exam_WrapperClass](https://github.com/icici0093/KH_Study/blob/main/code/Day_15_API/src/com/kh/javaapi/Exam_WrapperClass.java)  
    
# Calendar  
  - java.util.Calendar  
    - 추상클래스. 생성자가 protected이기 때문에 new를 통해 객체 생성을 하지 못하고 getinstance()메소드를 통해 객체를 생성  
    - GregorianCalendar는 Calendar 클래스의 자식 클래스이고, 년 월 일 시 분 초 정보를 필드를 이용해 다룰 수 있음  
      - Calendar의 필드 Month는 값이 0부터 시작해 출력시 1을 더해줘야 함  
      
• [Exam_Calendar](https://github.com/icici0093/KH_Study/blob/main/code/Day_15_API/src/com/kh/javaapi/Exam_Calendar.java)  

# Date  
  - java.util.Date  
    - 시스템으로부터 현재 날짜와 시간 정보를 가져와 다룰 수 있게 만들어진 클래스  
    - 생성자 2개만 사용 가능하고 나머지는 deprecated  
    
# SimpleDateFormat  
  - java.text.SimpleDateFormat  
    - Date의 날짜, 시간 정보를 원하는 format으로 출력하도록 기능 제공을 하는 클래스  
    
• [Exam_SimpleDateFormat](https://github.com/icici0093/KH_Study/blob/main/code/Day_15_API/src/com/kh/javaapi/Exam_SimpleDateFormat.java)  
    
# Formatter  
  - java.util.Formatter(final class)  
    - 값 출력시 format을 적용해서 출력할 수 있음  
    - Formatter 객체를 생성시 변환된 결과를 보낼 곳의 정보를 생성자 인자로 전달  
      - Formatter f = new Formatter(System.out);
      - f.format("%s, %d, %d \n", "String", 10, 20);
        - 위 출력값과 유사한 결과 만들기 
        - System.out.printf("%s, %d, %d \n", "문자열", 10, 20);
        - System.out.println(String.format("%s, %d, %d \n", "문자열", 10, 20);
  
  
  
  
  
  
  
    
    
