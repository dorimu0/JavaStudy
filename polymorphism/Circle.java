package polymorphism;

public class Circle extends Shape{
  public int radius;

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
