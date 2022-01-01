package sec02_타입_변환과_다형성.exam05_인터페이스_상속;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
//		ia.methodB();
//		ia.methodC();
		System.out.println();
		
		InterfaceB ib = impl;
//		ib.methodA();
		ib.methodB();
//		ib.methodC();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
