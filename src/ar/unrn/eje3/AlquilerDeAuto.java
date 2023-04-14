package ar.unrn.eje3;

public class AlquilerDeAuto extends Gasto {

	public AlquilerDeAuto(String nombre, double monto) {
		super(nombre, monto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double sumarComida(double total) {
		// TODO Auto-generated method stub
		return total;
	}

	public double sumarOtrosGastos(double total) {
		// TODO Auto-generated method stub
		return this.monto + total;
	}

	@Override
	public String nombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

}
