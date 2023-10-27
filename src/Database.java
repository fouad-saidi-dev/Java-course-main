//Singleton
class Database {

	private static Database dbObject;

	private Database() {

	}

	public static Database getInstance() {

		// create object if it's not already created
        if (dbObject == null) {
			dbObject = new Database();
		}
        
        // return the singleton object
		return dbObject;
	}
	
	public void getConnection() {
		System.out.println("You are connected !!");
	}

}


class SinglMain {
	
	public static void main(String[] args) {
		
		Database d1;
		
		d1 = Database.getInstance();
		
		d1.getConnection();
	}
}
