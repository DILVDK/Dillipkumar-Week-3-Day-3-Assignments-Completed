package week3.day3;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connect to the Database");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect from the Database");		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute in the Database");		
	}

	public void exit() {
		System.out.println("Exit from the Database");
	}
	public static void main(String[] args) {
		JavaConnection db = new JavaConnection();
				db.connect();
				db.disconnect();
				db.executeUpdate();
				db.exit();
	}

}
