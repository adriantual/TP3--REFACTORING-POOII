package ar.unrn.eje3;

public class Cena extends Gasto {

	public Cena(String nombre, double monto) {
		super(nombre, monto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double sumarComida(double total) {
		return this.monto + total;
	}

	@Override
	public double sumarOtrosGastos(double total) {
		return total;
	}

	@Override
	public String nombre() {
		return this.nombre;
	}

}
