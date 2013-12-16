package py.edu.fpune.tfg.turista.app.server.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import py.edu.fpune.tfg.turista.app.server.dao.LugarDao;
import py.edu.fpune.tfg.turista.app.server.model.Categoria;
import py.edu.fpune.tfg.turista.app.server.model.Lugar;

@Path("/lugares")
public class LugaresService {
	
	@GET	
	@Produces(MediaType.APPLICATION_JSON)
	public List<Lugar> getAllJSON() throws SQLException, ClassNotFoundException{
		LugarDao ldao = new LugarDao();
		
		return ldao.obtenerTodos();
	}
	
	@GET
	@Path("/{categoria}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Lugar> getProducto(@PathParam("categoria") String categoria) throws SQLException, ClassNotFoundException{
		List<Lugar> lugares = new ArrayList<Lugar>();
		LugarDao ldao = new LugarDao();
		if(categoria.equals("hoteles")){
			Categoria c = new Categoria();
			c.setId(1);
			c.setDescripcion("Hoteles");
			lugares = ldao.obtenerPorCategoria(c);
		}
		if(categoria.equals("restaurantes")){
			Categoria c = new Categoria();
			c.setId(2);
			c.setDescripcion("Restaurantes");
			lugares = ldao.obtenerPorCategoria(c);
		}
		return lugares;
	}
	

}
