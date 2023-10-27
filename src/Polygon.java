
interface Polygon {

	void getArea(int lenght, int breath);

	void getArea1();

	default void getParameter(int... sides) {
		int perimeter = 0;
		for (int side : sides) {
			perimeter += side;
		}

		System.out.println("Perimeter: " + perimeter);
	}
}

class Rectangle implements Polygon {

	@Override
	public void getArea(int lenght, int breath) {
		System.out.println("The area of the rectangle is " + (lenght * breath));
	}

	@Override
	public void getArea1() {

	}

}

class Triangle implements Polygon {

	private int a, b, c;
	private double s, area;

	Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		s = 0;
	}

	@Override
	public void getArea(int lenght, int breath) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getArea1() {
		s = (double) (a + b + c) / 2;
		area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("Area : " + area);
	}

}

class MainPoly {
	public static void main(String[] args) {
		Rectangle rct = new Rectangle();
		rct.getArea(2, 2);

		Triangle trg = new Triangle(2, 3, 4);
		trg.getArea1();

		trg.getParameter(2, 3, 4);
	}
}