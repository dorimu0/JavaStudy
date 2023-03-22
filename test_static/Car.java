package test_static;

public class Car {
  private String name;
  private String color;
  private int speed;

  // 상수 : 한번 초기화되면 절대 값을 변경할 수 없는 값.
  // java에서 상수는 static으로 만드는 것이 바람직
  // 상수는 일반적으로 public으로 선언
  public static final int MAX_SPEED;

  static {
    MAX_SPEED = 350;
  }

  private int id;
  // 정적 멤버 변수로 만들어서, 모든 인스턴스가 이 변수를 공유
  static int numbers;

  public Car(String name, String color, int speed) {
    this.name = name;
    this.color = color;
    this.speed = speed;
  
    id = numbers++;
    // MAX_SPEED = 3;
  }

  // 인스턴스 메서드 접근 X
  public static int getNumbers() {
    // print();
    return numbers;
  }

  public void print() {
    System.out.println("hi~");
  }

  public static void main(String[] args) {
    Car c1, c2, c3;
    c1 = new Car("s600", "white", 80);
    c2 = new Car("E500", "blue", 20);
    c3 = new Car("E300", "gray", 160);

    // System.out.println("생성된 자동차 수 : " +c1.numbers);
    // System.out.println("생성된 자동차 수 : " +c2.numbers);
    // System.out.println("생성된 자동차 수 : " +c3.numbers);

    // 자바의 수학관련 라이브러리 클래스는 정적 메서드를 이용
    double d = Math.sqrt(9);
    System.out.println("9의 제곱근 : " + d);
    
    System.out.println(Car.MAX_SPEED);
  }
}
