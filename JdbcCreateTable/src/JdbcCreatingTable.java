import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcCreatingTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/emp","postgres","root");
			Statement st = con.createStatement();
			int rs = st.executeUpdate("create table student(id int primary key, name varchar(20) not null, age int not null)");
			int rs1 = st.executeUpdate("Insert Into student values(105,'Aaryan',17)");
			int rs3 = st.executeUpdate("Insert Into student values(106,'Aarav',13)");
			ResultSet rs2 = st.executeQuery("select * from student");
			
			while(rs2.next())
			{
				System.out.println(rs2.getInt(1)+" "+rs2.getString(2)+" "+rs2.getInt(3));
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}

	}

}
