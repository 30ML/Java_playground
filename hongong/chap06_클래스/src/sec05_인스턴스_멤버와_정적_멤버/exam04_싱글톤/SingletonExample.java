package sec05_인스턴스_멤버와_정적_멤버.exam04_싱글톤;

public class SingletonExample {

	public static void main(String[] args) {
		/*
		Singleton obj1 = new Singleton(); // COMPILE ERROR!!
		Singleton obj2 = new Singleton(); // COMPILE ERROR!!
		*/
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}

}
