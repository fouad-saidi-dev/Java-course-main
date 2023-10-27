
class Class1 {

	String lang;
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// no parameter
	Class1() {
		this.lang = "JAVA";
	}
	
	// with parameter
	Class1(String lang) {
		this.lang = lang;
	}
	
	public void getName() {
		System.out.println("Programming language: "+this.lang);
	}
	
	
	
	
	
	
   
}
