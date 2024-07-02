package wipro_java_database_connectivity;
import java.sql.*;
public class DBProgram {	
	public static void main(String[] args) throws SQLException{
	
		try
		{
			/* step 1= creatre a driver loader.."Class.forName("com.mysql.cj.jdbc.Driver")"
			 * 
			 * step 2= establish the connection between the java code(eclipse) and the database mysql"
			 *			using the command "Connection con=DriverManager.getConnection(url,username,password);
			 * 			-->url=" jdbc:mysql://localhost:3306/Database_name_optional ";
			 * 			-->username= "sql_username_optional" (eg:: 'root')
			 * 			-->password= "sql_password" (eg:: 'root')
			 * 
			 * step 3= creating Sql statements: 3 types...
			 * 			-->1. Statement s= con.createStatement();----> should be used only for "DDL" language.
			 * 			-->2. PreparedStatement ps=con.prepareStatement(sql);----> should be used only for "DML" language. 
			 * 			-->3. CallableStatement;
			 * 
			 * step 4 = execution of query: 3 types...
			 * 			-->1. s.executeQuery(sql);------>should be used only for "DDL" language.
			 * 			-->2. s.execute(sql);------>should be used only for "DDL" & "DML" language.
			 * 			-->3. ps.executeUpdate();------>should be used only for "DML" language.
			 */
			Class.forName("com.mysql.cj.jdbc.Driver");//loader of driver
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro","root","root");//connection establishment
			String s="INSERT INTO students(regno,name,mobile) VALUES(?,?,?)";
			PreparedStatement ps=con.prepareStatement(s);//creating SQL statements
			ps.setInt(1, 599);
			ps.setString(2, "vinay");
			ps.setInt(3, 87905); 
			int q=ps.executeUpdate();//execution of query
			if(q==0)
				System.out.println("Not Inserted");
			else
				System.out.println("Inserted Successfully!");
    	}
		catch(ClassNotFoundException e)
		{
			
		}

	}

}
