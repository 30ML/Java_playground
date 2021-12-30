package sec03_추상_클래스.exam02_추상_메소드와_재정의;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		// variable's type promotion
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-----");
		
		// method's polymorphism
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
