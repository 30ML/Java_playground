package sec01_상속.exam02_부모_생성자_호출;

public class Student extends People {
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
