package py.edu.fpune.tfg.turista.app.server.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import py.edu.fpune.tfg.turista.app.server.dao.LugarDao;
import py.edu.fpune.tfg.turista.app.server.model.Categoria;
import py.edu.fpune.tfg.turista.app.server.model.Lugar;

/**
 * Servlet implementation class LugarServlet
 */
@WebServlet(name = "lugares", urlPatterns = { "/lugares" })
public class LugarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Lugar l = new Lugar();
		l.setNombre(request.getParameter("nombre"));
		l.setDescripcion(request.getParameter("descripcion"));
		l.setTelefono(request.getParameter("telefono"));
		l.setEmail(request.getParameter("telefono"));
		l.setDireccion(request.getParameter("direccion"));
		l.setWeb(request.getParameter("web"));
		l.setLatitud(Double.parseDouble(request.getParameter("x")));
		l.setLongitud(Double.parseDouble(request.getParameter("y")));
		Categoria c = new Categoria();
		c.setId(Integer.parseInt(request.getParameter("categoria")));
		l.setCategoria(c);
		guardar(l);
		response.sendRedirect("index.jsp");
	}
	private void guardar(Lugar l) {
		try {
			LugarDao ldao = new LugarDao();
			ldao.insertar(l);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
