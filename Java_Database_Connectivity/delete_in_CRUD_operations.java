package wipro_java_database_connectivity;
import java.sql.*;
public class delete_in_CRUD_operations {
	public static void main(String []args) throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro","root","root");
			String sql="DELETE  FROM wiproclass WHERE regno='191212120' ";
			PreparedStatement s=c.prepareStatement(sql);
			int n=s.executeUpdate();
			if(n==0) System.out.println("not deleted");
			else System.out.println("deleted");
		}
		catch(Exception e) {
			
		}
	}

}
