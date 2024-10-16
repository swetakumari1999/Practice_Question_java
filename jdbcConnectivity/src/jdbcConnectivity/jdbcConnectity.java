package jdbcConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcConnectity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	           Class.forName("org.postgresql.Driver");
	           Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/emp", "postgres", "root");
	           Statement st = con.createStatement();
	           ResultSet rs = st.executeQuery("select * from employee ");

	           while (rs.next()) {
	               System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
	           }

	           con.close();
	       }
	           catch(Exception e1)
	           {
	               System.out.println(e1);
	           }

	}

}
