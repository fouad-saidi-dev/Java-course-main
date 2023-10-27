enum Size {

	// enum constants calling the enum constructors
	
	SMALL("The size is small"),
	MEDIUM("The size is medium"),
	LARGE("The size is large"),
	EXTRALARGE("The size is extra large");
	
	
	
	
	private final String pizzaSize;
	
	private Size(String pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	
	public String getSize() {
		return pizzaSize;
	}
	
}

enum StringSize {
	OUI,NON,
	ACTIF {
		public String toString() {
			return "is active";
		}
	},
	DESACTIF {
		public String toString() {
			return "not active";
		}
	}
}

class MainEnum {
	
	public static void main(String[] args) {
		System.out.println("string value of OUI "+StringSize.ACTIF.toString());
		Size size = Size.LARGE;
		System.out.println(size.getSize());
	}
}