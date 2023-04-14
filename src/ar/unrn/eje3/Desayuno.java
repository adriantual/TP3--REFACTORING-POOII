package ar.unrn.eje3;

public class Desayuno extends Gasto {

	public Desayuno(String nombre, double monto) {
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
