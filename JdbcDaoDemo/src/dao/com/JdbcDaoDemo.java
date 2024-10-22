package dao.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class EmployeeDAO
{
	public  Employee getEmployee(int id)
	{
		try {
			String sql = "Select name from Employee where id="+id;
		Employee s = new Employee();
		s.id = id;
		Class.forName("org.postgresql.Driver");
        Connection  con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/emp", "postgres", "root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		rs.next();
		String name = rs.getString(1);
		s.name = name;
         return s;
	}
		catch(Exception e)
		{
			System.out.print(e);
		}
		return null;
		
}}
class Employee 
{
	int id;
	String name;
	int age;
}

public class JdbcDaoDemo {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		Employee s1 =  dao.getEmployee(102);
		System.out.println(s1.name);
	}



}
