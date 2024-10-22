import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteTable {

	public static void main(String[] args) {
	 
		try {
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/emp","postgres","root");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Delete table student where id=105");
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
