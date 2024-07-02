package wipro_java_database_connectivity;
import java.sql.*;
public class create_table_CRUD_in_database {

	public static void main(String[] args) throws SQLException  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/wipro";
			String uname="root";
			String pass="root";
			Connection c=DriverManager.getConnection(url,uname,pass);
			String sql=" CREATE TABLE shivaclass "+"(eid INTEGER,"+"ename VARCHAR(50),"+"salary INTEGER"+")";
			Statement s=c.createStatement();
			s.execute(sql);
			
		}
		catch (Exception e) {
			
		}
	}

}
