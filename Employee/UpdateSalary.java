package Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateSalary {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring","root","root");
			Statement statement = connection.createStatement();
			statement.execute(" update hiring set salary =78000 where expirence>=20 ");
			connection.close();
			System.out.println("data updated");
		}catch( ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
