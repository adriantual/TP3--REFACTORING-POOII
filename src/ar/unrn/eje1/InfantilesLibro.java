package ar.unrn.eje1;

public class InfantilesLibro extends Libro {

	public InfantilesLibro(String nombre) {
		super(nombre, 2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularMonto(int cantidadDias) {
		double monto = 1.5;
		if (cantidadDias > 3)
			monto += (cantidadDias - 3) * 1.5;
		return monto;
	}

}
