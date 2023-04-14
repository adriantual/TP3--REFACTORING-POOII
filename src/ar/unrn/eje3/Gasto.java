package ar.unrn.eje3;

public abstract class Gasto {
	protected String nombre;
	protected double monto;

	public Gasto(String nombre, double monto) {
		super();
		this.nombre = nombre;
		this.monto = monto;
	}

	public abstract double sumarComida(double total);

	public abstract double sumarOtrosGastos(double total);

	public abstract String nombre();

}
