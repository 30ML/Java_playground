package sec01_상속.exam02_부모_생성자_호출;

public class People {
	public String name;
	public String ssn;
	
	// no default constructor
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
