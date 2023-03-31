package overriding;

public class Child extends Parent{
  public void print(){
    System.out.println("자식 클래스의 print() 메소드 출력");
  }

  public static void main(String[] args) {
    Child obj = new Child();
    obj.print();
  }
}
