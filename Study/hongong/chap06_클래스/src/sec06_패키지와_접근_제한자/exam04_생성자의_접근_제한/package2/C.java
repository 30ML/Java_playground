package sec06_패키지와_접근_제한자.exam04_생성자의_접근_제한.package2;

import sec06_패키지와_접근_제한자.exam04_생성자의_접근_제한.package1.*;

public class C {
	// Field
	A a1 = new A(true);
//	A a2 = new A(1); // default constructor: COMPILE ERROR!
//	A a3 = new A("문자열"); // private constructor: COMPILER ERROR!
}
