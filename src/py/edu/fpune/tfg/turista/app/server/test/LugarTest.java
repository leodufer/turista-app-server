package py.edu.fpune.tfg.turista.app.server.test;

import java.sql.SQLException;

import org.junit.Test;

import py.edu.fpune.tfg.turista.app.server.dao.LugarDao;
import py.edu.fpune.tfg.turista.app.server.model.Categoria;
import py.edu.fpune.tfg.turista.app.server.model.Lugar;

public class LugarTest {

	@Test
	public void insertarLugar() throws SQLException, ClassNotFoundException {
		Lugar l = new Lugar();
		l.setNombre("Calsone Dorado");
		l.setDescripcion("Los mejores calzones que puedas desear para cualquier ocacion");
		Categoria c = new Categoria();
		c.setId(1);
		l.setCategoria(c);
		l.setEmail("email@host.com");
		l.setTelefono("0078");
		l.setDireccion("Direccion");
		l.setWeb("web");
		l.setX(123);
		l.setY(123);
		LugarDao ldao = new LugarDao();
		ldao.insertar(l);
	}

}
