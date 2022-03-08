package sec06_패키지와_접근_제한자.exam05_필드와_메소드의_접근_제한.package1;

/* 클래스 내부에서 접근 제한자 별 필드/메소드 사용 확인 */
public class A {
	// Field
	public int field1;
	int field2;
	private int field3;
	
	// Constructor
	public A() {
		field1 = 1; // (O)
		field2 = 1; // (O)
		field3 = 1; // (O)
		
		method1(); // (O)
		method2(); // (O)
		method3(); // (O)
	}
	
	// Method
	public void method1() {}
	void method2() {}
	private void method3() {}
}
