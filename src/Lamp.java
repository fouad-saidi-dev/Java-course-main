
class Lamp {

	boolean isON;

	void turnOn() {
		isON = true;
		System.out.println("Light on ? " + isON);
	}

	void turnOff() {
		isON = false;
		System.out.println("Light on ? " + isON);
	}
}

class Somme {

	public int addNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int square(int num) {
		return num * num;
	}

	private static int getSquare(int x) {
		return x * x;
	}

	// surcharge
	private static void display(int a) {
		System.out.println("Arguments : " + a);
	}

	private static void display(int a, int b) {
		System.out.println("Arguments : " + a + " and " + b);
	}

	// constructor private

	int i;

	private Somme() {
		i = 5;
		System.out.println("Constructor is called ");
	}

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			int result = getSquare(i);
			System.out.println("Square of " + i + " is : " + result);
		}

		// surchage
		display(1);
		display(1, 3);

		// called constructor without parameter
		Somme obj = new Somme();
		System.out.println("Value of i : " + obj.i);
	}

}

class Test {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Test() {
		System.out.println("Constructor called :");
		name = "Fouad";
	}

}

class Animal {
	// protected

	protected void display() {
		System.out.println("I am an animal");
	}
}

class Dog extends Animal {
	public static void main(String[] args) {

		// create an object of Dog class
		Dog dog = new Dog();
		// access protected method
		dog.display();
	}
}
