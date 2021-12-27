package sec06_패키지와_접근_제한자.exam04_생성자의_접근_제한.package1;

public class A {
	// Field
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	// constructor
	public A(boolean b) {} // public 접근 제한
	A(int i) {} // default 접근 제한
	private A(String s) {} // private 접근 제한
}
