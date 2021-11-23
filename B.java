package overriding;

public class B extends A {
	public void m1(int a , int b) {
		System.out.println(a-b);
		
	}
	public static void main(String[] args) {
		//A a = new B();
		//a.m1(10, 20);
		A a = new A();
		a.m1(10, 20);
		
	}

}
