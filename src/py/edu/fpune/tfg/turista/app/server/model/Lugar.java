package py.edu.fpune.tfg.turista.app.server.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Lugar {
	private int id;
	private String nombre;
	private String descripcion;
	private String email; 
	private String telefono;
	private String web;
	private String direccion;
	private double latitud;
	private double logitud;
	private Categoria categoria;
	private int recomendacion;
	private List<Recurso> recursos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double x) {
		this.latitud = x;
	}
	public double getLongitud() {
		return logitud;
	}
	public void setLongitud(double y) {
		this.logitud = y;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public List<Recurso> getRecursos() {
		return recursos;
	}
	public void setRecursos(List<Recurso> recursos) {
		this.recursos = recursos;
	}
	public int getRecomendacion() {
		return recomendacion;
	}
	public void setRecomendacion(int recomendacion) {
		this.recomendacion = recomendacion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
