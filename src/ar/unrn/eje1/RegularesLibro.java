package ar.unrn.eje1;

public class RegularesLibro extends Libro {

	public RegularesLibro(String nombre) {
		super(nombre, 0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularMonto(int cantidadDias) {
		double monto = 2;// monto = monto +2;
		if (cantidadDias > 2)
			monto += (cantidadDias - 2) * 1.5;
		return monto;
	}

}
