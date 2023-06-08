package generic;

public class GenericTest {
  public static void main(String[] args) {
    GenericBox<Integer> box1 = new GenericBox<>();
    box1.setValue(100);
    // 잘못된 값을 주면 컴파일 타임 때 그 오류를 잡아준다.
    // box1.setValue("동해물과 백두산이");

    int val = box1.getValue();
    System.out.println("박스에 저장된 값은 [ " + val + " ]");

    GenericBox<String> box2 = new GenericBox<>();
    box2.setValue("동해물과 백두산이 마르고 닳도록");
    
    String sval = box2.getValue();
    System.out.println("박스에 저장된 값은 [ " + sval + " ]");

    // 왼쪽에 제네릭 클래스의 적용할 타입이 명시되어 있기 때문에
    // 오른쪽 타입 파라미터 부분에서 생략가능
    // 타입 파라미터에 객체 생성 가능

    
  } 
}
