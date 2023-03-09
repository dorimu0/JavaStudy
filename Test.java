package Study.src.class1;

class JavaTest {
    int num;

    JavaTest() {
        num = 3;
    }
    int square(int num) {
        return num * num;
    }
    double square(double num){
        return num * num;
    }
}

public class Test {
    public static void main(String arg[]){
        JavaTest jt = new JavaTest();

        // System.out.println(jt.num);

        System.out.println(jt.square(3));
        System.out.println(jt.square(3.1));

        System.out.println(arg.length);

    }
    
}
