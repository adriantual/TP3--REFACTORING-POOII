package ar.unrn.eje3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Gastos {
	// private List<Gasto> gastos;
	private ArrayList<Gasto> gastos;
	/*
	 * public Gastos(Gasto... gastos) { this.gastos = List.of(gastos); }
	 */

	public Gastos(ArrayList<Gasto> gastos) {
		super();
		this.gastos = gastos;
	}

	public String imprimir() {
		double total = 0;
		double gastosDeComida = 0;

		// System.out.println("Expenses " + LocalDate.now());

		for (Gasto gasto : gastos) {
			total = gasto.sumarComida(total);

			String nombreGasto = gasto.nombre;

			// que hace?
			String marcaExcesoComidas = gasto.tipoGasto == TipoDeGasto.CENA && gasto.monto > 5000
					|| gasto.tipoGasto == TipoDeGasto.DESAYUNO && gasto.monto > 1000 ? "X" : " ";

			// System.out.println(nombreGasto + "\t" + gasto.monto + "\t");// +
			// marcaExcesoComidas

			total += gasto.sumarOtrosGastos(total);
			String ticket = ("Expenses " + LocalDate.now() + "\t" + nombreGasto + "\t" + gasto.monto + "\t"
					+ "Gastos de comida: " + gastosDeComida + "\t" + "Total de gastos: " + total);
			return ticket;
		}

		String ticket = ("Expenses " + LocalDate.now() + "\t" + nombreGasto + "\t" + gasto.monto + "\t"
				+ "Gastos de comida: " + gastosDeComida + "\t" + "Total de gastos: " + total);
		return ticket;
		// System.out.println("Gastos de comida: " + gastosDeComida);
		// System.out.println("Total de gastos: " + total);
	}

}
