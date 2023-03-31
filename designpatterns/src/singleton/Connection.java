package singleton;

public class Connection {
	static Connection con;
	private Connection() {
		
	}
	public static Connection getConnection() {                    //it is used if we require only 1 object(eg in a company only 1 ceo is needed) 
		if(con != null)
			return con;
		else
			con = new Connection();
			return con;
		
		//return new Connection();
	}

}
