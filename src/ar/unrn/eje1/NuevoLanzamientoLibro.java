package ar.unrn.eje1;

public class NuevoLanzamientoLibro extends Libro {

	public NuevoLanzamientoLibro(String nombre) {
		super(nombre, 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularMonto(int cantidadDias) {
		double monto = cantidadDias * 3;
		return monto;
	}

	public int puntosAlquilerFrecuente(int cantidadDias) {
		int puntos = 1;
		if (cantidadDias > 1) {
			puntos++;
		}
		return puntos;
	}

}
