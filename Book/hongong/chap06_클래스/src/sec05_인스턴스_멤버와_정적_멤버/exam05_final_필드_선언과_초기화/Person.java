package sec05_인스턴스_멤버와_정적_멤버.exam05_final_필드_선언과_초기화;

public class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
