package py.edu.fpune.tfg.turista.app.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import py.edu.fpune.tfg.turista.app.server.dba.ConexionFactory;
import py.edu.fpune.tfg.turista.app.server.model.Categoria;
import py.edu.fpune.tfg.turista.app.server.model.Lugar;



public class LugarDao {
	
	private Connection conexion;
	
	public LugarDao() throws SQLException, ClassNotFoundException{
		ConexionFactory cf = new ConexionFactory();
		this.conexion = cf.getConection();
	}
	public void insertar(Lugar lugar) throws SQLException{
		String sql = "INSERT INTO lugares (nombre, descripcion, email, telefono, direccion, web, x, y, categoria, recomendacion) VALUES (?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = this.conexion.prepareStatement(sql);
		ps.setString(1, lugar.getNombre());
		ps.setString(2, lugar.getDescripcion());
		ps.setString(3, lugar.getEmail() );
		ps.setString(4, lugar.getTelefono());
		ps.setString(5, lugar.getDireccion());
		ps.setString(6, lugar.getWeb());
		ps.setDouble(7, lugar.getLatitud());
		ps.setDouble(8, lugar.getLongitud());
		ps.setInt(9, lugar.getCategoria().getId());
		ps.setInt(10, 0);
		ps.execute();
	}
	public Lugar obtener(Lugar lugar) throws SQLException{
		Lugar l = null;
		String sql = "SELECT * FROM lugares WHERE id = ?";
		PreparedStatement ps = this.conexion.prepareStatement(sql);
		ps.setInt(1, lugar.getId());
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			l = new Lugar();
			l.setId(lugar.getId());
			l.setNombre(rs.getString("nombre"));
			l.setDescripcion(rs.getString("descripcion"));
			l.setDireccion(rs.getString("direccion"));
			l.setLatitud(rs.getDouble("x"));
			l.setLongitud(rs.getDouble("y"));
			Categoria c = new Categoria();
			c.setId(rs.getInt("categoria"));
			if(c.getId()==1){
				c.setDescripcion("Hoteles");
			}else{
				c.setDescripcion("Restaurantes");
			}
			l.setCategoria(c);
			l.setRecomendacion(rs.getInt("recomendacion"));
		}
		return l;
	}
	
	public List<Lugar> obtenerPorCategoria(Categoria c) throws SQLException{
		List<Lugar> lugares = new ArrayList<Lugar>();
		String sql = "SELECT * FROM lugares WHERE categoria = ?";
		PreparedStatement ps = this.conexion.prepareStatement(sql);
		ps.setInt(1, c.getId());
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Lugar l = new Lugar();
			l.setId(rs.getInt("id"));
			l.setNombre(rs.getString("nombre"));
			l.setDescripcion(rs.getString("descripcion"));
			l.setDireccion(rs.getString("direccion"));
			l.setLatitud(rs.getDouble("x"));
			l.setLongitud(rs.getDouble("y"));
			l.setCategoria(c);
			l.setRecomendacion(rs.getInt("recomendacion"));
			lugares.add(l);
		}
		return lugares;
	}
	
	public List<Lugar> obtenerTodos() throws SQLException{
		List<Lugar> lugares = new ArrayList<Lugar>();
		String sql = "SELECT * FROM lugares";
		PreparedStatement ps = this.conexion.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Lugar l = new Lugar();
			l.setId(rs.getInt("id"));
			l.setNombre(rs.getString("nombre"));
			l.setDescripcion(rs.getString("descripcion"));
			l.setDireccion(rs.getString("direccion"));
			l.setLatitud(rs.getDouble("x"));
			l.setLongitud(rs.getDouble("y"));
			Categoria c = new Categoria();
			c.setId(rs.getInt("categoria"));
			if(c.getId()==1){
				c.setDescripcion("Hoteles");
			}else{
				c.setDescripcion("Restaurantes");
			}
			l.setCategoria(c);
			l.setRecomendacion(rs.getInt("recomendacion"));
			lugares.add(l);
		}
		return lugares;
	}
}

	