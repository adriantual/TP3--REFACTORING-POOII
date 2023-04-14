package ar.unrn.eje1;

import java.util.Objects;

public class Alquiler {
	private CopiaLibro copia;
	private int diasAlquilados;

	public Alquiler(CopiaLibro copia, int diasAlquilados) {
		this.copia = copia;
		this.diasAlquilados = diasAlquilados;
	}

	public int diasAlquilados() {
		return this.diasAlquilados;
	}

	public CopiaLibro copia() {
		return this.copia;
	}

	public double calcularPrecioAlquiler() {
		double monto = copia.calcularMonto(diasAlquilados);
		return monto;

	}

	public int puntosPorAlquiler() {
		int puntosAlquilerFrecuente = copia.puntosPorAlquielerFrecuente();
		return puntosAlquilerFrecuente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(copia, diasAlquilados);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alquiler other = (Alquiler) obj;
		return Objects.equals(copia, other.copia) && diasAlquilados == other.diasAlquilados;
	}

}
