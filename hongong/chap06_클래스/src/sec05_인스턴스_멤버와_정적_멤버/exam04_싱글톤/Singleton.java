package sec05_인스턴스_멤버와_정적_멤버.exam04_싱글톤;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {};
	
	static Singleton getInstance() {
		return singleton;
	}
}
