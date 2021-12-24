package sec06_패키지와_접근_제한자.exam02_import문.mycompany;

import sec06_패키지와_접근_제한자.exam02_import문.hankook.SnowTire;
import sec06_패키지와_접근_제한자.exam02_import문.hyundai.Engine;
import sec06_패키지와_접근_제한자.exam02_import문.kumho.BigWidthTire;

public class Car {
	public static void main(String[] args) {
		// Field
		Engine engine = new Engine();
		SnowTire tire1 = new SnowTire();
		BigWidthTire tire2 = new BigWidthTire();
		sec06_패키지와_접근_제한자.exam02_import문.hankook.Tire tire3 = new sec06_패키지와_접근_제한자.exam02_import문.hankook.Tire();
		sec06_패키지와_접근_제한자.exam02_import문.kumho.Tire tire4 = new sec06_패키지와_접근_제한자.exam02_import문.kumho.Tire();
	}
}
