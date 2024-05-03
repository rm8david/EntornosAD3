package modelo.dao;

public class Autor {
	private String nombre;
	private String biografia;
	private String genero;
	//Constructor vacio
	public Autor() {
		super();
	}
	//Constructor con todo
	public Autor(String nombre, String biografia, String genero) {
		super();
		this.nombre = nombre;
		this.biografia = biografia;
		this.genero = genero;
	}
	//getter and setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getBiografia() {
		return biografia;
	}
	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	// Metodo ToString
	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", biografia=" + biografia + ", genero=" + genero + "]";
	}
	
	
	

}
