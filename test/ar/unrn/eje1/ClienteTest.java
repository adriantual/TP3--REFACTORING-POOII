package ar.unrn.eje1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ClienteTest {

	@Test
	public void alquilerLibro() {
		Libro elTunel = new RegularesLibro("El Túnel");
		Libro antesDelFin = new RegularesLibro("Antes del Fin");
		CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
		CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
		Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
		Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
		Cliente yo = new Cliente("Javier");
		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);
		Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
		Object equals1 = 10.0;
		Object equals2 = 2;
		assertEquals(resultado[1], equals1);
		assertEquals(resultado[2], equals2);

	}

}
