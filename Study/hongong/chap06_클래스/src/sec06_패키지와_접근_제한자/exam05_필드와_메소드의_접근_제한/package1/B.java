package sec06_패키지와_접근_제한자.exam05_필드와_메소드의_접근_제한.package1;

public class B {
	public B() {
		A a = new A();
		
		a.field1 = 1; // (O)
		a.field2 = 1; // (O)
//		a.field3 = 1; // (X): private 접근 제한: COMPILE ERROR!!
		
		a.method1(); // (O)
		a.method2(); // (O)
//		a.method3(); // (X): private 접근 제한: COMPILE ERROR!!
	}
}
