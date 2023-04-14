package staticoverriding;

public class Cat extends Animal {
  // Overriding 불가
  // @Override
  // public static void eat() {
  //   System.out.println("고양이가 밥을 먹습니다.");
  // }
  
  @Override  
  public void sound() {
    System.out.println("Sound of Cat");
  }
}
