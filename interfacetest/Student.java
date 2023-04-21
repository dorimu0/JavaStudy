package interfacetest;

public class Student implements Comparable {
  private String name;
  private String dept;
  
  public Student(String name, String dept) {
    this.name = name;
    this.dept = dept;
  }

  public String getName() {
    return name;
  }

  @Override
  public int compareTo(Comparable obj) {
    // null인 경우는 없다고 가정
    // interface는 class처럼 데이터 타입으로 사용 가능
    // 특정 interface 타입의 변수는 그 interface를 구현하는
    // 모든 클래스의 객체를 담을 수 있다.
    Student std = (Student)obj;
    // String 클래스는 java.lang 패키지의 Comparable 인터페이스를
    // 이미 구현하고 있다. 즉, 그 인터페이스의 추상 메소드 인
    // compareTo 메소드를 구현
    // String의 compareTo 메소드는 사전 순서에 따라 비교 대상보다
    // 사전 순서상 앞에 위치하면 -1, 같으면 0, 뒤에 위치하면 1을 반환
    return name.compareTo(std.getName());
  }
 }
