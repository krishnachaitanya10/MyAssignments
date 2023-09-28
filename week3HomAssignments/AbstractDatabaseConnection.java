package week3HomAssignments;

public interface AbstractDatabaseConnection {

	
	public void connect() ;
	public void disconnect() ;
	public void executeUpdate();
}
