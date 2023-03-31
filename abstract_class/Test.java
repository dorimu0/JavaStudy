package abstract_class;

public class Test{

  public static void main(String[] args) {
    Rectangle r = new Rectangle();
    Circle c = new Circle();
    Triangle t = new Triangle();
    Shape s1;
    s1 = new Rectangle();

    s1.x = 0;
    s1.y = 0;
    // s1.width = 3;
    // s1.height = 2;

    r.draw();
    r.move(10, 20);
    c.draw();
    c.move(20, 30);
    t.draw();
  }
}