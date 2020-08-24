//Create_Insert_Mysql.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
class Create_Emp 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","root");
		Statement stmt=con.createStatement();
		String create="create table emp(empno int,fname varchar(10),midname varchar(10),lname varchar(10),dept varchar(10),phoneno varchar(10), hireDate Date,jobTitle varchar(10),level int)";

		String insert1="insert into emp values(10,'john','I','HASS','A00',9822135443,1/1/1996,'PRESS',18)";
		String insert2="insert into emp values(20,'SALLY','L','THOMSON','B01',9822657890,4/5/1975,'MANAGER',18)";
		String insert3="insert into emp values(30,'JOHN','B','KWAN','C01',9689234312,9/4/1966,'MANAGER',20)";
		System.out.println("Executed Succesfully");

		stmt.executeUpdate(create);
		stmt.executeUpdate(insert1);
		stmt.executeUpdate(insert2);
		stmt.executeUpdate(insert3);

		String select="select * from emp where dept='A00'";

		ResultSet rs=stmt.executeQuery(select);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ " " +rs.getString(2)+ " " +rs.getString(3));
		}
		rs.close();
		stmt.close();
		con.close();
	}
		stmt.close();
		con.close();

	}
}
