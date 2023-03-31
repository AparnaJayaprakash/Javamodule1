package singleton;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//	Math math = new Math()        not possible because constructor Math() is not visible
		
		for(int i=1;i<=10;i++) {
		Connection con1 = Connection.getConnection();
		Connection con2 = Connection.getConnection();
		
		
		if(con1.hashCode()==con2.hashCode()) {                                    // to check the hashcode of con1 and con2
			System.out.println("Connection is Singleton");
		}
		else {
			System.out.println("Connection is not Singleton");
		}
		
		

	}
	}

}
