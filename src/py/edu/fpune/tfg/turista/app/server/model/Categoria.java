package py.edu.fpune.tfg.turista.app.server.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Categoria {
	private int id;
	private String descripcion;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
