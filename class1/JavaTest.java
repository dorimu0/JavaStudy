package class1;

class Test {
    int num;

    Test() {
        num = 3;
    }
    int square(int num) {
        return num * num;
    }
    double square(double num){
        return num * num;
    }
}

public class JavaTest {
    public static void main(String arg[]){
        Test jt = new Test();

        // System.out.println(jt.num);

        System.out.println(jt.square(3));
        System.out.println(jt.square(3.1));

        System.out.println(arg.length);

    }
    
}
