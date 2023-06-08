package generic;

public class GenericTest2{
  public static void main(String[] args) {
    // GnericPair 클래스 객체 2개 생성해서 값을 넣고 빼보세요.
    GenericPair<String, Integer> gp = new GenericPair<String,Integer>(20, "홍길동");
    String val = gp.getValue();
    int key = gp.getKey();

    

  }
}