### Day 07 (배열)  

# 배열이란?  
  - 동일한 자료형(같은 타입)의 여러 변수를 묶음  
  - 많은 양의 값(데이터)을 다룰 때 유용함  
  - 사용 목적 : 데이터에 순차 접근이 가능함. 
    많은 수의 변수를 하나의 문장으로 선언 가능  
    
# 배열의 선언과 할당
  - 배열의 선언  
    - 주소값을 가지지 않은 변수 생성(Stack)  
    - 자료형[] 변수이름; -> int[] arr;  
    - 자료형 변수이름[]; -> int arr[];  
  
  - 배열의 할당  
    - 배열객체 생성 후 변수에 주소값 할당(Heap)  
    - 변수이름(참조변수) = new 자료형[저장데이터개수]; -> int arr = new int[5];  

# 배열의 초기화  
  - 선언과 동시에 초기화  
    예) int[] arr = {1, 2, 3, 4, 5};  
       String arr[] = {"홍길동", "이순신", "세종대왕"};
       
       int[] arr = new int[]{1, 2, 3, 4, 5};
  - 할당과 동시에 자동적으로 기본값으로 초기화됨  
  **'배열이름.lengh'는 배열의 크기를 알려준다.**  
  
  - 방법 1. 인덱스를 이용한 직접 값 기록  
    예) arr[0] = 1;  
       arr[1] = 2;  
       arr[2] = 3;  
  - 방법 2. for문을 이용  
    예) for(int i = 0; i < arr.length; i++){  
          arr[i] = i + 1;  
        }  
    초기화 할 리터럴이 일정 규칙으로 증가한다면, 반복문의 index를 통해 배열에 값을 기록할 수 있다.  

# 배열값 출력  
  - 배열에 저장된 값을 호출(출력)하려면 인덱스를 이용  
  arr[인덱스번호]  
  - arr[인덱스번호]가 하나의 변수명이라고 생각하면 된다.  
  출력 : System.out.println(arr[인덱스번호]);  
        for(int i = 0; i < 배열이름.length; i++)  
        {  
            System.out.println(배열이름[i]);  
         }  

# 배열복사  
  - 얕은 복사 : 객체의 주소값만 가져와 참조형변수에 저장하고 하나의 객체를 두 변수가 참조하고 있는 것  
    - int[] arr1 = new int[4]  
      int[] arr2 = arr1;  
  - 깊은 복사 : 다른 객체를 생성하여 새로운 객체에 데이터 내용을 복사하는 것  
    - for문을 이용한 1:1복사  
    - System.arraycopy()메소드를 이용한 복사  
    - clone()메소드를 이용한 복사  
        
• [Exam_Array1](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Array1.java)  
• [Exam_Array2](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Array2.java)  
• [Exam_Array3](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Array3.java)  
• [Exam_Array4](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Array4.java)  
• [Exam_Array5](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Array5.java)  
• [Exam_Array6](https://github.com/icici0093/KH_Study/blob/main/code/Exam_Array6.java)  

• [Exercise_Array1](https://github.com/icici0093/KH_Study/blob/main/code/Exercise_Array1.java)  
• [Exercise_Array2](https://github.com/icici0093/KH_Study/blob/main/code/Exercise_Array2.java)  
• [Exercise_Array3](https://github.com/icici0093/KH_Study/blob/main/code/Exercise_Array3.java)  
         
         
