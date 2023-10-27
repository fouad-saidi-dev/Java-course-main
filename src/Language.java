
abstract class Language {

	//abstraite
	public void display() {
		System.out.println("This is Java programming");
	}

}

class LangMain extends Language {

	public static void main(String[] args) {

		LangMain obj = new LangMain();
		obj.display();

	}
}
