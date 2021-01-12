### Day 06  

# 분기문 - break문  
  break  
  - 반복문을 빠져나가는 구문  
    break구문이 있는 곳에서 곧장 반복문을 빠져 나옴  
  
  continue  
  - 반복문 실행시 continue 아래 부분은 실행하지 않고 반복문을 다시 실행  
    (for 문의 증감식으로 이동)  
    
# 난수  
  난수란 무엇인가?  
    - 난수  
     - 임의의 값 또는 무작위로 만들어지는 알 수 없는 값  
    - 난수 생성 클래스  
      - Random class  
    - 난수 생성 메소드  
      - nextInt(값); // 인자값을 넣게 되면 해당되는 값의 범위까지  
      - Random r = new Random();  
        data = r.nextInt(100); // 0 ~ 99까지의 수를 출력함  
        - sleep은 Thread.sleep(milisecond);
