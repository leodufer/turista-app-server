package py.edu.fpune.tfg.turista.app.server.dba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionFactory {
	
	public Connection getConection() throws SQLException, ClassNotFoundException{
		String host = "jdbc:mysql://localhost/turista";
		String user = "root";
		String password = "";
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(host, user, password);
	}
}
