package polymorphism;

public class Circle extends Shape{
  public int radius;

  // 오버라이드
  @Override
  public void draw() {
    System.out.println("Rectangle Draw[" + radius +"]");
  }

  public int getRadius(){
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }
}
