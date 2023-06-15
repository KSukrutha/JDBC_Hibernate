package Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HiringPerson {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring","root","root");
			Statement statement = connection.createStatement();
			statement.execute("insert into hiring values(1,'Jevvi',21,'Developer',22,90000) ");
			statement.execute("insert into hiring values(2,'Sakshii',22,' Developer',19,65000) ");
			statement.execute("insert into hiring values(3,'Sumukh',26,'chef',15,120000) ");
			statement.execute("insert into hiring values(4,'Sukrutha',30,'Architect',25,150000) ");
			statement.execute("insert into hiring values(5,'Stuthi',30,'ACCA',40,250000) ");
			statement.execute("insert into hiring values(6,'Nikitha',30,'Developer',12,100000) ");
			statement.execute("insert into hiring values(7,'Roopak',30,'Docotor',5,50000) ");
			statement.execute("insert into hiring values(8,'Santhosh',30,'Swimmer',2,25000) ");
			connection.close();
			System.out.println("data saved");
		}catch( ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
