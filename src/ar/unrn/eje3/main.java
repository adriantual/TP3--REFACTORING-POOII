package ar.unrn.eje3;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// Crear una lista de gastos de ejemplo
		ArrayList<Gasto> gastos = new ArrayList<>();
		Gasto gasto1 = new Gasto();
		gasto1.tipoGasto = TipoDeGasto.CENA;
		gasto1.monto = 6000;
		gastos.add(gasto1);

		Gasto gasto2 = new Gasto();
		gasto2.tipoGasto = TipoDeGasto.DESAYUNO;
		gasto2.monto = 800;
		gastos.add(gasto2);

		Gasto gasto3 = new Gasto();
		gasto3.tipoGasto = TipoDeGasto.ALQUILER_AUTO;
		gasto3.monto = 3500;
		gastos.add(gasto3);

		// Crear una instancia de ReporteDeGastos y llamar al método imprimir
		ReporteDeGastos reporte = new ReporteDeGastos();
		reporte.imprimir(gastos);

	}

}
