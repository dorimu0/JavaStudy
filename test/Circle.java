package test;

public class Circle {
  private Point p;
  private int radius;

  public Circle(Point p, int radius){
    this.p = p;
    this.radius = radius;
  }

  public static void main(String args[]){
    Point p;
    p = new Point(3, 4);
    Circle c = new Circle(p, 4);


    // 부모로부터 상속받은 메소드를 재정의 하는 것을 오버라이딩이라고 한다.
    // overriding
    // @Override
    // public String toString(){
    //   return " X: " +  x + ", Y: " + y;
    // }
  }
}
