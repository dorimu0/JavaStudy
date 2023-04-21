package interfacetest;

public interface Comparable {
  // 기본적으로 인터페이스에는 추상 메소드만 존재
  // 하지만 JDK 8 이후에ㅔ는 추상 메소드 이외에도
  // 메소드 바디를 가지는 디폴트 메소드도 정의 가능
  // 인터페이스의 모든 메소드는 기본적으로 public
  // 왜냐하면 다른 클래스와 상호작용하기 위한 계약
  // 다른 클래스에서 사용할 수 있는 메소드의 리스트 나열
  int compareTo(Comparable obj);
  
}
