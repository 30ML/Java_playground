package sec06_패키지와_접근_제한자.exam05_필드와_메소드의_접근_제한.package2;

import sec06_패키지와_접근_제한자.exam05_필드와_메소드의_접근_제한.package1.A;

public class C {
	public C() {
		A a = new A();
		
		a.field1 = 1; // (O)
//		a.field2 = 1; // (X): default 접근 제한: COMPILE ERROR!!
//		a.field3 = 1; // (X): private 접근 제한: COMPILE ERROR!!
		
		a.method1(); // (O)
//		a.method2(); // (X): default 접근 제한: COMPILE ERROR!!
//		a.method3(); // (X): private 접근 제한: COMPILE ERROR!!
	}
}
