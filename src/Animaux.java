
class Animaux {

	String name;
    protected String lname;
	
    protected void call() {
		System.out.println("protected method");
	}
	
	public void eat() {
		System.out.println("I can eat");
	}
	
	// access specifier in Overriding
	protected void displayInfo() {
		System.out.println("access specifier in Overriding");
	}
	
	public void methodoverride() {
		System.out.println("method override !!");
	}
	
	// default constructor of class animal
	Animaux() {
		System.out.println("I am an animal");
	}
	
	// parameterized constructor
	Animaux(String type) {
		System.out.println("Type : "+type);
	}
}

// inherit form animal

class Chien extends Animaux {

	// new method in subclass
	public void display() {
		System.out.println("My name is " + name);
	}
	
	@Override
	public void eat() {
		
		// call method from superClass
		super.eat();
		System.out.println("I eat dog food");
	}
	
	public void getInfo() {
		System.out.println("Is protected ?"+lname);
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("displayInfo");
	}
	
	@Override
	public void methodoverride() {
		System.out.println("method override sur subclass !!");
	}
	
	public void printMsg() {
		methodoverride();
	}
	
	
}

class Cat extends Animaux {

	// default constructor 
	Cat() {
	
		//super();
		super("Animal");
		System.out.println("I am a cat");
	}
	
}

class Main1 {
	public static void main(String[] args) {
		
		// create an object 
		Chien chien = new Chien();
		
		// access field
		chien.name = "Rohu";
		chien.display();
		chien.lname = "NO";
		chien.getInfo();
		chien.eat();
		chien.displayInfo();
		chien.printMsg();
		
		Cat cat = new Cat();
		
	}
}
