package generic;

public class Test {
    public static void main(String[] args) {
  //   IntBox ib1 = new IntBox();
  //   ib1.setValue(10); 
  
  //   IntBox ib2 = new IntBox();
  //   ib2.setValue(20);
  
  //   int result = ib1.getValue() + ib2.getValue();
  //   System.out.println(result);

    // StrBox sb1 = new StrBox();
    // sb1.setValue("동해물과");
    // StrBox sb2 = new StrBox();
    // sb2.setValue("백두산이");
    // String result = sb1.getValue() + sb2.getValue();
    // sb1.setValue(result);

    // int idx = result.indexOf("백두산이");
    // System.out.println(result.substring(idx));

    // Box b1 = new Box();
    // b1.setValue(20);
    // Box b2 = new Box();
    // b2.setValue(30);

    // int result = (int)b1.getValue() + (int)b2.getValue();
    // System.out.println(result);

    Box strBox = new Box();
    strBox.setValue("마르고 닳도록 하느님이 보우하사 우리나라 만세!");
    Object v = strBox.getValue();
    int idx = ((String)v).indexOf("우리나라");
    System.out.println(((String)v).substring(idx));

    int val = (int)strBox.getValue();
    System.out.println(val);
    System.out.println("프로그램을 종료합니다.");

  }
}
