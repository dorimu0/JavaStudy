package class1;

public class TimeTest {
  public static void main(String args[]) {
    // 첫 번째 생성자 호출
    Time time = new Time();
    System.out.println("기본 생성자 호출 후 시간 : " + time.toString());

    //두 번째 생성자 호출
    Time time2 = new Time(13, 27, 6);
    System.out.println("두번째 생성자 호출 후 시간: " + time2.toString());
  }
  
}
