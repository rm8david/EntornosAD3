package modelo.dao;

public class Libro {

	private long isbn;
	private String titulo;
	private double precio;
	private int paginas;
	private Autor autor;
	//constructor vacio
	public Libro() {
		super();
	}
	//constructor con todo
	public Libro(long isbn, String titulo, double precio, int paginas, Autor autor) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.precio = precio;
		this.paginas = paginas;
		this.autor = autor;
	}
	//getter and setter
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	//metodo ToString
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", precio=" + precio + ", paginas=" + paginas + ", autor="
				+ autor + "]";
	}
	
	
	
}
