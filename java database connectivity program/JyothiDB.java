import java.sql.*;
public class JyothiDB
{
  public static void main(String args[]) throws Exception
  {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jyothi","root");
    statement st=con.createStatement();
    
    st.executeUpdate("insert into student values(1,'Amal','cse',7.0)");
    st.executeUpdate("insert into student values(2,'dia','cse',9.0)");
    st.executeUpdate("insert into student values(3,'joel','cse',8.5)");
    system.out.println("*****inserted 3 records******");
    
    Resultset rs=st.executeQuery("select * from student");
    string str=" ";
    while(rs.next())
    {
      str=rs.getInt("rollno")+":"+rs.getString("name")+":"+rs.getString("branch")+":"+rs.getFloat("cgpa");
      system.out.println(str);
    }
    
    st.executeUpdate("delete from student where rollno=3");
    system.out.println("***deleted 1 record***");
    
    Resultset rs2=st.executeQuery("select * from student");
    string str2=" ";
    while(rs2.next())
    {
      str2=rs2.getInt("rollno")+":"+rs2.getString("name")+":"+rs2.getString("branch")+":"+rs2.getFloat("cgpa");
      system.out.println("str2");
    }
    st.close();
    con.close();
  }
}
