package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import atributo.*;
import modelo.Garra;
import modelo.Juguete;
import modelo.Marciano;

public class jugueteTest {
	
	@Test
	public void atacar_UnJugueteAtacaUnMarciano_ElMarcianoEsDerrotado () {
		Marciano marciano = new Marciano();
		
		Juguete juguete = new Juguete();
		Atributo lazo = new Lazo(5);
		juguete.setAtributo(lazo);
		
		juguete.atacar(marciano);
		
		assertTrue("El marciano no fue derrotado", marciano.estaDerrotado());
	}
	
	@Test
	public void atacar_UnJugueteAtacaUnMarciano_ElMarcianoNoEsDerrotado () {
		Marciano marciano = new Marciano();
		
		Juguete juguete = new Juguete();
		Atributo antigüedad = new Antigüedad(2);
		juguete.setAtributo(antigüedad);
		
		juguete.atacar(marciano);

		assertFalse("El marciano fue derrotado", marciano.estaDerrotado());
	}
	
	@Test
	public void atacar_UnJugueteAtacaUnaGarra_LaGarraNoEsEliminada () {
		Garra garra = new Garra();
		
		Juguete juguete = new Juguete();
		Atributo metal = new Metal(5);
		juguete.setAtributo(metal);
		Atributo laser = new Laser(metal.getAtaque());
		juguete.setAtributo(laser);

		juguete.atacar(garra);

		assertFalse("La garra fue derrotada", garra.estaDerrotado());
	}
	

	@Test
	public void obtenerMonedas_UnJugueteAtacaAUnMarciano_RecibeMonedas () {
		Marciano marciano = new Marciano();
		
		Juguete juguete = new Juguete();
		Atributo lazo = new Lazo(5);
		juguete.setAtributo(lazo);
		
		juguete.atacar(marciano);

		assertEquals("No se obtuvieron monedas del ataque", juguete.obtenerMonedas(), (juguete.obtenerNivelDeAtaque())/2, 0.0);
	}
	
	@Test
	public void obtenerMonedas_UnJugueteAtacaAUnMarciano_NoRecibeMonedas () {
		Marciano marciano = new Marciano();
		
		Juguete juguete = new Juguete();
		Atributo antigüedad = new Antigüedad(2);
		juguete.setAtributo(antigüedad);
		
		juguete.atacar(marciano);

		assertEquals("Se obtuvieron monedas del ataque", juguete.obtenerMonedas(), 0, 0.0);
	}
	
	@Test
	public void obtenerMonedas_UnJugueteAtacaAUnaGarra_NoRecibeMonedas () {
		Garra garra = new Garra();
		
		Juguete juguete = new Juguete();
		Atributo metal = new Metal(5);
		juguete.setAtributo(metal);
		Atributo laser = new Laser(metal.getAtaque());
		juguete.setAtributo(laser);

		juguete.atacar(garra);

		assertEquals("Se obtuvieron monedas del ataque", juguete.obtenerMonedas(), 0, 0.0);
	}
}
