package sec05_인스턴스_멤버와_정적_멤버.exam05_final_필드_선언과_초기화;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa"; // COMPILE ERROR!!
//		p1.ssn = "654321-7654321"; // COMPILE ERROR!!
		p1.name = "강감찬";
	}

}
