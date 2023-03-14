package class1;

public class StringTest {
  public static void main(String arg[]) {
    String proverb = "A barking dog";
    String s1, s2, s3, s4;

    System.out.println("문자열의 길이 = " + proverb.length());

    s1 = proverb.concat("never Bites!");
    s2 = proverb.replace('B', 'b');
    s3 = proverb.substring(2, 5);
    s4 = proverb.toUpperCase();

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);

    int x = 20;
    System.out.println("결과값은 " + x);
    String s = "1234";
    Integer.parseInt(s);
    
    // 예제
//     String str;
// 		Scanner scan = new Scanner(System.in);
		
// 		while (true) {
// 			System.out.println("문자열을 입력하세요 > ");
// 			str = scan.next();
// 			if ( str.equals("quite") == true) 
// 				break;
// 			if (str.matches("^www\\.(.+)")) {
// 			System.out.println(str + " 은 'www'로 시작합니다.");
// 			} else {
// 				System.out.println(str + " 은 'www'로 시작하지 않습니다.");
// 			}
// 		}

  }
  
}
