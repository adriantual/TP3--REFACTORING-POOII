package ar.unrn.eje1;

public class CopiaLibro {
	private Libro libro;

	public CopiaLibro(Libro libro) {
		this.libro = libro;
	}

	public Libro libro() {
		return libro;
	}

	public double calcularMonto(int cantidadDeDias) {
		return this.libro.calcularMonto(cantidadDeDias);
	}

	public int puntosPorAlquielerFrecuente() {
		return this.libro.puntosAlquilerFrecuente();
	}
}