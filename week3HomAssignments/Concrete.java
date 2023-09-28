package week3HomAssignments;

public abstract class Concrete implements DatabseConnection {
	public void connect() {
		System.out.println("Connected in concrete");
	}
	public void disconnect() {
		System.out.println("disconnected in concrete");
	}
	public void executeUpdate() {
		System.out.println("Updated in concrete");
	}
	public static void main(String[] args) {
		
	}
	

}
