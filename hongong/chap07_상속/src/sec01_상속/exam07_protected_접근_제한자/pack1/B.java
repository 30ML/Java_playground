package sec01_상속.exam07_protected_접근_제한자.pack1;

public class B {
	public void method() {
		// protected - 같은 package 내의 class는 모두 접근 가
		A a = new A();
		a.field = "value";
		a.method();
	}
}
