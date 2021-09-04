import java.sql.*;
class DropTableEmployee
{
    public static void main(String[] args) throws Exception {
      String driver="com.mysql.cj.jdbc.Driver";
	  String jdbc_url="jdbc:mysql://localhost:3306/practice";
	  String user="root";
	  String pwd="Query";
	  String sql_query="Drop table Practice.Employee";
      Class.forName(driver);
	  Connection con=DriverManager.getConnection(jdbc_url,user,pwd);
	  Statement st=con.createStatement();
	  st.executeUpdate(sql_query);
	 /* while(rs.next())
	  {
		  System.out.println(rs.getString(1));
	  }*/
      System.out.println("Table Deleted Sucessfully");
      con.close();
    } 
}