import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DropTable {
	public static void main(String args[]) {

	try
	{
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/emp","postgres","root");
		Statement st = con.createStatement();
		int rs = st.executeUpdate("Drop table student");
		System.out.println("Table is Droped");
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

}