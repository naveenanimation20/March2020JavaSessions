package JavaSessions;

public class MethodChaining {

	public void m1() {

		m2();
	}

	public void m2() {
		m3();
	}

	public void m3() {
		
		m1();
		
		c1();
	}
	
	public static void c1(){
		c2();
	
	}
	
	public static void c2(){
		System.out.println("c2");
	}

	public static void main(String[] args) {

		MethodChaining obj = new MethodChaining();
//		obj.m1();
//		obj.m2();
//		obj.m3();
		
		MethodChaining.c1();

	}

}
