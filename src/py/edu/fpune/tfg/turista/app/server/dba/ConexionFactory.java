package py.edu.fpune.tfg.turista.app.server.dba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionFactory {
	
	public Connection getConection() throws SQLException, ClassNotFoundException{
		//String host = "jdbc:mysql://ec2-50-19-213-178.compute-1.amazonaws.com/turista";
		//String user = "turista";
		//String password = "turista123456";
		
		String host = "jdbc:mysql://localhost/turista";
		String user = "root";
		String password = "";
		
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(host, user, password);
	}
}
