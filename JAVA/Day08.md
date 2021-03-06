# Day 08(정렬/2차원 배열)  

### 정렬  
• [Exam_ArraySort1](https://github.com/icici0093/KH_Study/blob/main/code/Exam_ArraySort1.java)  
• [Exam_ArraySort2](https://github.com/icici0093/KH_Study/blob/main/code/Exam_ArraySort2.java)  

  - 삽입정렬(Insertion Sort)  
    - 정렬 알고리즘에서 가장 간단하고 기본이 되는 알고리즘. 배열의 n번 인덱스값을 0번 ~ n-1번 인덱스까지 비교 (두 가지 for문이 필요함)  
		
• [Exam_ArraySort3](https://github.com/icici0093/KH_Study/blob/main/code/Exam_ArraySort3.java)  

  - 선택정렬 알고리즘  
		- 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬  
		- 특징  
      1. 데이터의 양이 적을 때 좋은 성능을 보여줌(교환 횟수 적음)  			 
      2. 데이터의 양이 많을 때 급격한 성능 저하를 보임  
		- 배열의 n번 인덱스값을 n+1번 ~ 마지막 인덱스까지 비교  
    
• [Exam_ArraySort4](https://github.com/icici0093/KH_Study/blob/main/code/Exam_ArraySort4.java)  

	- 버블정렬(Bubble Sort)  
		- 인접한 두개의 원소를 검사하여 정렬하는 방법   
		- 구현이 쉽다는 장점이 있고, 이미 정렬된 데이터를 정렬할 때 가장 빠름   
		- 다른 정렬에 비해 정렬 속도가 느리며, 역순으로 정렬할 때 가장 느림  
		
• [Exam_ArraySort5](https://github.com/icici0093/KH_Study/blob/main/code/Exam_ArraySort5.java)  

  - Array 클래스에 있는 명령어(메소드)로 정렬  
    - 내림차순이 없기 때문에 새로운 배열을 만들어 배열을 거꾸로 넣어야 함  
	  - Arrays.sort(arrs);  
	  
• [Exam_ArraySort6](https://github.com/icici0093/KH_Study/blob/main/code/Exam_ArraySort6.java)  

# 2차원 배열  
  - 1차원 배열 안에 다른 배열을 넣은 것  
  - 배열은 저장된 값마다 인덱스 번호 두 개로 설정됨 (앞번호는 행, 뒷번호는 열[n][a])  

### 선언과 할당  
  1. 자료형[][] 변수이름;  
  2. 자료형 변수이름 [][];  
  -> 자료형[][] 변수이름 = new 자료형[행크기][열크기];  
  예) int arr[][];  
      int[][] arr = new int[2][3];  

### 초기화  
  - 선언과 동시에 사용자 초기화  
  예) int[][] arr=**{**{1, 2, 3, 4}, {5, 6, 7, 8}**}**;  
      String arr[][]=**{**{"차", "장"}, {"배", "김"}**}**;  
      int[][] array = **{**{1}, {2, 3}, {4, 5, 6}**}**;  
      
• [Exam_DimArray1](https://github.com/icici0093/KH_Study/blob/main/code/Exam_DimArray.java)  
• [Exam_DimArray2](https://github.com/icici0093/KH_Study/blob/main/code/Exam_DimArray2.java)  
• [Exercise_DimArray1](https://github.com/icici0093/KH_Study/blob/main/code/Exercise_DimArray1.java)  
• [Exercise_DimArray2](https://github.com/icici0093/KH_Study/blob/main/code/Exercise_DimArray2.java)  
• [Exercise_DimArray3](https://github.com/icici0093/KH_Study/blob/main/code/Exercise_DimArray3.java)  
• [Exercise_DimArray4](https://github.com/icici0093/KH_Study/blob/main/code/Exercise_DimArray4.java)  
• [Exercise_DimArray5](https://github.com/icici0093/KH_Study/blob/main/code/Exercise_DimArray5.java)  
• [Exercise_DimArray6](https://github.com/icici0093/KH_Study/blob/main/code/Exercise_DimArray6.java)  
• [Exercise_DimArray7](https://github.com/icici0093/KH_Study/blob/main/code/Exercise_DimArray7.java)  

      

  
