package sec02_타입_변환과_다형성.exam03_강제_타입_변환;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare();
		
		Bus bus = (Bus)vehicle;
		
		bus.run();
		bus.checkFare();
	}

}
