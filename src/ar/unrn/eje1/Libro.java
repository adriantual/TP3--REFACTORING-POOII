package ar.unrn.eje1;

public abstract class Libro {

	private String nombre;
	private int codigoPrecio;// ver si cambiar a INTEGER

	public Libro(String nombre, int priceCode) {
		this.nombre = nombre;
		this.codigoPrecio = priceCode;
	}
// SE QUEDAN ESTOS GETTERS Y SETTER?

	public int codigoPrecio() {
		return codigoPrecio;
	}

	public String nombre() {
		return nombre;
	}

	public abstract double calcularMonto(int cantidadDias);

	public int puntosAlquilerFrecuente() {
		int puntos = 1;
		return puntos;
	}

}