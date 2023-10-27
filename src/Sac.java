
abstract class Sac {

	abstract void makeSound();

	public void get() {
		System.out.println("prend votre cartable");
	}

}

class Livre extends Sac {

	public void makeSound() {
		System.out.println("prend livre");

	}

}

class SacMain {

	public static void main(String[] args) {

		Livre obj = new Livre();

		obj.get();
		obj.makeSound();
	}
}
