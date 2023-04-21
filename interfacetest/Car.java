package interfacetest;

public class Car implements Comparable{
  private String brand;
  private String model;
  private int speed;
  private int price;

  public Car() {
    // brand = "UnKnown";
    // model = "UnKnown";
    // speed = 0;
    // price = 0;
    this("UnKnown", "UnKnown", 0, 0);

    toString();
  };

  @Override
  public String toString() {
    return "[브랜드 : " + brand + ", 모델 : " + model + ", 스피드 : " + speed + ", 가격 : " + price + "]";
  }

  public Car(String brand, String model, int speed, int price) {
    this.brand = brand;
    this.model = model;
    this.price = price;
    this.speed = speed;
  }
  public void setBrand( String brand) {
    this.brand = brand;
  }
  public String getBrand() {
    return brand;
  }

  public void setModel(String model) {
    this.model = model;
  }
  public String getModel() {
    return model;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }
  public int getSpeed() {
    return speed;
  }

  public void setPrice(int price) {
    this.price = price;
  }
  public int getPrice() {
    return price;
  }

  @Override
  public int compareTo(Comparable obj) {
    Car car = (Car)obj;

    if(price > car.getPrice()) {
      return 1;
    } else if (price == car.getPrice()){
      return 0;
    }else {
      return -1;
    }
  }
}
