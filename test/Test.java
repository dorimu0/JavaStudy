package javaclass;

class A {
	private int a;
	int b;
	public int c;
}

public class Test {
	public static void main(String args[]) {
		
		A obj = new A();
		
		// obj.a = 10;	접근제어자를 통해 외부에서의 접근을 막아 멤버변수에 접근할 수 없다.
		obj.b = 20;
		obj.c = 30;
	}
}