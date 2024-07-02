package wipro_java_database_connectivity;
import java.sql.*;
public class update_in_CRUD_operations {
	public static void main(String []args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro","root","root");
			String sql=" UPDATE wiproclass SET name='subhash' WHERE regno='111' ";
			PreparedStatement s=c.prepareStatement(sql);
			int q=s.executeUpdate();
			if(q==0) System.out.print("no");
			else System.out.print("yes");
			}
		catch(Exception e) {
			
		}
	}
	

}
