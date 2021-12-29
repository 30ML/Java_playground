package sec02_타입_변환과_다형성.exam01_자동_타입_변환;

class A {}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// inheritance 관계에 있지 않기 때문에 COMPILE ERROR 발
//		B b2 = e;
//		C c2 = d;
	}
}
