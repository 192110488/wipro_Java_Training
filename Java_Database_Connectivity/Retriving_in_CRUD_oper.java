package wipro_java_database_connectivity;
import java.sql.*;
public class Retriving_in_CRUD_oper {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro","root","root");
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("SELECT * from wiproclass");
			while(rs.next()) {
				int i=rs.getInt(1);
				int r=rs.getInt(2);
				String str=rs.getString(3);
				System.out.print(i+" "+r+" "+str+"\n");
			}
			rs.close(); 			
		}
		catch(Exception e) {
			
		}

	}

}
