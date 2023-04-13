package polymorphism;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Car {
  String brand;
  String model;

  public Car(String brand, String model){
    this.brand = brand;
    this.model = model;
  }

  public Car(){
    this("unknown", "unknown");
  }

  @Override
  public boolean equals(Object obj) {
    if(obj == null) return false;

    // obj가 car 클래스의 인스턴스가 아니면 바로 false 를 반환하자/
    // 자바에는 이 목적으로 사용하라 수 있는 연산자가 있다.
    // instanceof
    if (obj instanceof Car == false) return false;
    // obj는 car 클래스의 객체라 가정
    // 그래야, Car 클래스의 인서턴스의 brand, model 멤버에 접근
    Car yourCar = (Car)obj;
    if( brand == yourCar.brand && model == yourCar.model){
      return true;
    }

    return false;
    
  }
}
