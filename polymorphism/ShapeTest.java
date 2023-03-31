package polymorphism;

public class ShapeTest {
  public static void main(String[] args) {
    Shape s1, s2, s3, s4;
    Shape[] shapes = new Shape[4];
  
    s1 = new Shape();
    shapes[0] = s1;
    s2 = new Rectangle();
    shapes[1] = s2;
    s3 = new Circle();
    shapes[2] = s3;
    s4 = new Triangle();
    shapes[3] = s4;
    // s1.draw();
    // s2.draw();
    // s3.draw();
    // s4.draw();

  }
  public static void drawShapes(Shape[] shapes) {
    for(Shape s : shapes){
      s.draw();
    }
    // for ( int i = 0; i < shapes.length; i++ ){
    //      Shape s = shapes[i];
    //}     s.draw();
  }
}
