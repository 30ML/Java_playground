package sec04_메소드.exam06_메소드_오버로딩;

public class Calculator {
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}

	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
