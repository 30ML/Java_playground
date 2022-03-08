package sec01_상속.exam02_부모_생성자_호출;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		
		System.out.println("name: " + student.name); // inherited field
		System.out.println("ssn: " + student.ssn); // inherited field
		System.out.println("studentNo: " + student.studentNo);
	}

}
