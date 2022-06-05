// 상속 관계 만들기
class A {
}

class B extends A {

}

class C extends B {

}

class D extends B {

}

public class Polymorphism {
  public static void main(String[] args) {
    // A 타입의 다형적 표현
    A a1 = new A();
    A a2 = new B();
    A a3 = new C();
    A a4 = new D();

    // B 타입의 다형적 표현
    // B b1 = new A(); // (X)
    B b2 = new B();
    B b3 = new C();
    B b4 = new D();

    // C 타입의 다형적 표현
    // C c1 = new A(); // (X)
    // C c2 = new B(); // (X)
    C c3 = new C();
    // C c4 = new D(); // (X)

    // D 타입의 다형적 표현
    // D d1 = new A(); // (X)
    // D d2 = new B(); // (X)
    // D d3 = new C(); // (X)
    D d4 = new D();
  }
}
