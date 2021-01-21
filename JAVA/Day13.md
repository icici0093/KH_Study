### Day 13  

# 컬렉션  
  - 메모리상에서 자료를 구조적으로 처리하는 방법을 **자료구조**라고 함(자료를 쉽게 찾기 위해 사용하는 방법)  
  - 자바에서 제공하는 **자료구조를 담당하는 프레임 워크**  
  - **추가, 삭제, 정렬**등의 기능처리가 간단하게 해결되어 자료구조적 알고리즘을 구현할 필요가 없음  
  
  - 배열의 문제점  
    1. 한번 크기를 지정하면 변경할 수 없음  
      - 할당시 넉넉한 크기로 할당하게되서 메모리 낭비를 부름  
      - 필요에 따라 늘리거나 줄일 수 없음 
    2. 데이터 중간 위치의 추가, 삭제가 불편함  
    3. 한 타입의 데이터만 저장 가능함  
    
  - 컬렉션의 장점  
    1. 저장하는 크기의 제약이 없음(가변)  
    2. 추가, 삭제, 정렬등 기능처리가 간단함  
      - 자료구조가 내장되어 알고리즘 구현이 필요 없음  
    3. 여러 타입 저장 가능  
      - 객체만 저장할 수 있기 때문에 기본 자료형을 저장해야하는 경우 Wrapper 클래스를 사용  
      
# List  
  - 자료들을 순차적으로 나열한 자료 구조  
  - 인덱스로 관리되며 중복해서 객체 저장이 가능함  
  - 구현 클래스 : ArrayList와 Vector, LinkedList  

  - ArrayList  
    - List의 후손  
    - 초기 저장 용량은 10으로 자동 설정되나 따로 지정할 수 있음  
    - 저장 용량을 초과한 객체들이 들어오면 자동적으로 늘어나며, 고정도 가능  
    - 동기화(Synchronization)를 제공하지 않음  
    예) List<E> list = new ArrayList<E>();
  
  - Vector  
    - List의 후손  
    - ArrayList와 동등하지만 동기화를 제공  
    - List 객체들 중에서 가장 성능이 좋지 않음  
  
  - LinkesdList  
    - List의 후손  
    - 인접 참조를 링크해서 체인처럼 관리함  
    - 인덱스에서 객체를 제거하거나 추가할때 바로 앞/뒤 링크만 변경하면 되기 때문에 
      객체 삭제와 삽입이 빈번하게 일어나는 곳에서는 ArrayList보다 성능이 좋음  
      
# Set  
  - **저장 순서가 유지되지 않고**, 중복 객체도 저장하지 못하게 하는 자료 구조  
  - Null도 중복 불가  
  - 구현 클래스 : HashSet, LinkedSet, TreeSet  
  
  - HashSet  
    - Set에 객체를 저장할 때 hash를 사용하여 처리 속도가 빠름  
    - 동일 객체뿐 아니라 동등 객체도 중복하여 저장하지 않는다  
  - LinkedHashSet  
    - HashSet과 거의 동일하지만 set에 추가되는 순서를 유지한다  

# Map  
  - 키(Key)와 값(Value)으로 구성  
  - 키와 값은 모두 객체  
  - 키는 중복 저장 불가, 값은 중복 저장 가능(list방식)  
  - 키가 중복되는 경우 기존에 있는 키에 해당하는 값을 덮어씀  
  - 구현 클래스 : HashMap, HashTable, LinkedHashMap, Properties, TreeMap  
  
  - HashMap  
    - 키 객체는 hashCode()와 equals()를 재정의해 동등 객체가 될 조건을 정해야 함  
    - 때문에 키 타입은 hashCode()와 equals()메소드가 재정의 되어 있는 String타입을 사용  
    예) Map<K, V> map = new HashMap<K, V>();
    
  - HashTable  
    - 키 객체 만드는 법은 HashMap과 동일  
    - 스레드 동기화가 된 상태이기 때문에 복수의 스레드가 동시에 HashTable에 접근해서 객체를 추가, 삭제하더라도 스레드에 안전하다(Thread safe)  
    예) Map<K, V> map = new HashTable<K, V>();  
    
  - Properties  
    - 키와 값을 String 타입으로 제한한 Map 컬렉션  
    - 주로 .properties 파일을 읽어들일때 주로 사용  
    
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
  
  
  
  
  
  
  
  
  
  
