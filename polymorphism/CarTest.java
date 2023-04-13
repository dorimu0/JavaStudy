package polymorphism;
import javax.swing.plaf.synth.SynthPasswordFieldUI;

import test.Circle;

public class CarTest {
  public static void main(String[] args) {
    // Car car = new Car();
    // Class classVar = car.getClass();
    // System.out.println(classVar.getName());

    // System.out.println("브랜드 : " + car.brand + ", 모델 : " + car.model);

    Car car1 = new Car("현대", "그랜져");
    Car car2 = new Car("현대", "그랜져");

    Car car3 = null;

    // equals - 호출한 객체와 전달받은 인자의 값을 비교 (객체 비교 시 주소 비교 )
    System.out.println(car1.equals(car2));
    System.out.println(car1 == car2);
    
    System.out.println(car1.equals(car3));

    Circle box = new Circle(null, 3);
    System.out.println(car1.equals(box));
    
    System.out.println("프로그램 종료");
  }
}
