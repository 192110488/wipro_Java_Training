package wipro_java_database_connectivity;
import java.sql.*;
public class create_database_2 {

	public static void main(String[] args)  throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro","root","root");
			String sql=" CREATE TABLE wiproclass "+" (sno INTEGER,"+" regno INTEGER, "+" name VARCHAR(50) "+" ) ";
			Statement s=c.createStatement();	
			s.execute(sql);
		}
		catch(Exception e) {
			
		}
		// TODO Auto-generated method stub

	}

}
