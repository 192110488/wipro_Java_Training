package wipro_java_database_connectivity;
import java.sql.*;
import java.util.*;
public class Insert_multiple_values_by_user {

	public static void main(String[] args) throws SQLException {
			try {
				Scanner obj=new Scanner(System.in);
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro","root","root");
				String sql="INSERT INTO wiproclass VALUES(?,?,?)";
				PreparedStatement p=c.prepareStatement(sql);
				System.out.print("Enter the values:\n");
				int i=0;
				while(true){
					System.out.print("Enter '0'-->insert || '-1'-->exit:\n");
					int n=obj.nextInt();
					i++;
					if(n==-1) break;
					p.setInt(1,obj.nextInt());
					p.setInt(2,obj.nextInt());
					p.setString(3,obj.nextLine());
					int q=p.executeUpdate();
					if(q==0) System.out.print("Not Inserted value"+ i+"\n");
					else {System.out.print("Inserted value"+i+"\n");q=0;}
					
				}
				
			}
			catch(Exception e) {
				
			}

	}

}
