package ar.unrn.eje1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private List<Alquiler> alquileres = new ArrayList<Alquiler>();// QUE PASA CON ESTA COLLECCION?
	private String name;

	public Cliente(String nombre) {
		this.name = nombre;
	}

	public Object[] calcularDeudaYPuntosObtenidos() {
		Object[] resultado = new Object[2];
		double total = 0;
		int puntosAlquilerFrecuente = 0;
		for (Alquiler alquiler : alquileres) {
			total += alquiler.calcularPrecioAlquiler();
			puntosAlquilerFrecuente += alquiler.puntosPorAlquiler();
		}
		resultado[0] = total;
		resultado[1] = puntosAlquilerFrecuente;
		return resultado;
	}

	public void alquilar(Alquiler rental) {
		alquileres.add(rental);

	}

	public boolean alquiloLibro(Alquiler unAlquiler) {
		return this.alquileres.contains(unAlquiler);
	}

}
