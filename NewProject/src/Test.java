
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.Scanner;

public class Test {
    private static Connection con = null;
   
    public static void main(String[] args) {
      
        Test test = new Test();
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/emp", "postgres", "root");
            System.out.println("Enter choice");
            System.out.println("1: Insert Record");
            System.out.println("2: Select Record");
            System.out.print("3: Callable Statement: Select Record");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    test.insertRecord(sc);
                    break;
                case 2:
                	test.selectRecord();
                case 3:
                	//test.procedureRecord;
                	test.procedureRecord();
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
            sc.close(); // Close the scanner
        }
    

    private void insertRecord(Scanner sc) throws SQLException {
        System.out.println("Insert record()");

        // Collecting input from user
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(sc.nextLine());
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Joining Date (YYYY-MM-DD): ");
        String joiningDateString = sc.nextLine();
        Date joiningDate = Date.valueOf(joiningDateString);

        // Using prepared statement with placeholders
        String sql = "INSERT INTO employeedata(id, name, address, joining_date) VALUES(?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, address);
            ps.setDate(4, joiningDate);
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Record is inserted.");
            } else {
                System.out.println("Record insertion failed.");
            }
        }
    
    }
    public void selectRecord() throws SQLException {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter id to find result:");
        int n = Integer.parseInt(sc.nextLine());
        
        String sql = "SELECT * FROM employeedata WHERE id = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, n); // Set the parameter value
        
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String address = rs.getString("address");
            Date date = rs.getDate("joining_date");
            
            System.out.println("id is: " + id);
            System.out.println("Name is: " + name);
            System.out.println("Address is: " + address);
            System.out.println("Joining date is: " + date);
        } 
        else {
            System.out.println("No record found");
        
    }
    }
    
//   
    public void procedureRecord() throws SQLException {
        CallableStatement cst = con.prepareCall("CALL GetEmployeesJoinedAfter(?,?,?,?)");

        // Set the parameter for the stored procedure
       // cst.setDate(1, joinDate);

        // Execute the procedure
        boolean hasResults = cst.execute();

        // Process the result set
        while (hasResults) {
            try (ResultSet rs = cst.getResultSet()) {
                while (rs.next()) {
                    System.out.print("Id number is " + rs.getInt("id"));
                    System.out.println(" name: " + rs.getString("name"));
                    System.out.println(" address: " + rs.getString("address"));
                    System.out.println(" Joining date: " + rs.getDate("joining_date"));
                }
            }
            hasResults = cst.getMoreResults();
        }

        cst.close();
    }


    
}
