package javabean;

import java.util.Objects;

public class Bebida {

	private String nombreBebida;
	private double precio;
	public Bebida() {
		super();
	}
	public Bebida(String nombreBebida, double precio) {
		super();
		this.nombreBebida = nombreBebida;
		this.precio = precio;
	}
	public String getNombreBebida() {
		return nombreBebida;
	}
	public void setNombreBebida(String nombreBebida) {
		this.nombreBebida = nombreBebida;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Bebida [nombreBebida=" + nombreBebida + ", precio=" + precio + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombreBebida);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bebida other = (Bebida) obj;
		return Objects.equals(nombreBebida, other.nombreBebida);
	}
	
	
}
