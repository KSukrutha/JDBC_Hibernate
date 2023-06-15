package Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetDetCond {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring","root","root");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from hiring where salary>=50000 and expirence>=20");
			while(resultSet.next()) {
				System.out.println("the employee id is"+resultSet.getInt(1));
				System.out.println("the employee name is"+resultSet.getString(2));
				System.out.println("the employee age is"+resultSet.getInt(3));
				System.out.println("the employee designation is"+resultSet.getString(4));
				System.out.println("the employee salary is"+resultSet.getString(6));
				System.out.println("the employee expirence is"+resultSet.getInt(5));
				System.out.println("=============================================");
			}
		}catch( ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
