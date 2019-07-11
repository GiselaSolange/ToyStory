package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import atributo.*;
import modelo.Alianza;
import modelo.Garra;
import modelo.Juguete;
import modelo.Marciano;

public class alianzaTest {
	@Test
	public void atacar_UnaAlianzaAtacaUnMarciano_ElMarcianoEsDerrotado () {
		Marciano marciano = new Marciano();

		Juguete juguete1 = new Juguete();
		Atributo lazo = new Lazo(5);
		juguete1.setAtributo(lazo);

		Juguete juguete2 = new Juguete();
		Atributo antigüedad = new Antigüedad(2);
		juguete2.setAtributo(antigüedad);

		Juguete juguete3 = new Juguete();
		Atributo metal = new Metal(5);
		juguete3.setAtributo(metal);
		Atributo laser = new Laser(metal.getAtaque());
		juguete3.setAtributo(laser);

		Alianza alianza = new Alianza();
		alianza.setJuguete(juguete1);
		alianza.setJuguete(juguete2);
		alianza.setJuguete(juguete3);

		alianza.atacar(marciano);
		
		assertTrue("El marciano no fue derrotado", marciano.estaDerrotado());
	}
	
	@Test
	public void atacar_UnaAlianzaAtacaUnMarciano_ElMarcianoNoEsDerrotado () {
		Marciano marciano = new Marciano();

		Juguete juguete1 = new Juguete();
		Atributo lazo = new Lazo(1);
		juguete1.setAtributo(lazo);

		Juguete juguete2 = new Juguete();
		Atributo antigüedad = new Antigüedad(1);
		juguete2.setAtributo(antigüedad);

		Juguete juguete3 = new Juguete();
		Atributo metal = new Metal(1);
		juguete3.setAtributo(metal);
		Atributo laser = new Laser(metal.getAtaque());
		juguete3.setAtributo(laser);

		Alianza alianza = new Alianza();
		alianza.setJuguete(juguete1);
		alianza.setJuguete(juguete2);
		alianza.setJuguete(juguete3);

		alianza.atacar(marciano);
		
		assertFalse("El marciano fue derrotado", marciano.estaDerrotado());
	}
	
	@Test
	public void atacar_UnaAlianzaAtacaUnaGarra_LaGarraNoEsEliminada () {
		Garra garra = new Garra();
		
		Juguete juguete1 = new Juguete();
		Atributo lazo = new Lazo(1);
		juguete1.setAtributo(lazo);

		Juguete juguete2 = new Juguete();
		Atributo antigüedad = new Antigüedad(1);
		juguete2.setAtributo(antigüedad);

		Juguete juguete3 = new Juguete();
		Atributo metal = new Metal(1);
		juguete3.setAtributo(metal);
		Atributo laser = new Laser(metal.getAtaque());
		juguete3.setAtributo(laser);

		Alianza alianza = new Alianza();
		alianza.setJuguete(juguete1);
		alianza.setJuguete(juguete2);
		alianza.setJuguete(juguete3);

		alianza.atacar(garra);

		assertFalse("La garra fue derrotada", garra.estaDerrotado());
	}
	
	@Test
	public void obtenerMonedas_UnaAlianzaAtacaAUnMarciano_RecibeMonedas () {
		Marciano marciano = new Marciano();

		Juguete juguete1 = new Juguete();
		Atributo lazo = new Lazo(5);
		juguete1.setAtributo(lazo);

		Juguete juguete2 = new Juguete();
		Atributo antigüedad = new Antigüedad(2);
		juguete2.setAtributo(antigüedad);

		Juguete juguete3 = new Juguete();
		Atributo metal = new Metal(5);
		juguete3.setAtributo(metal);
		Atributo laser = new Laser(metal.getAtaque());
		juguete3.setAtributo(laser);

		Alianza alianza = new Alianza();
		alianza.setJuguete(juguete1);
		alianza.setJuguete(juguete2);
		alianza.setJuguete(juguete3);

		alianza.atacar(marciano);
		
		assertEquals("No se obtuvieron monedas del ataque", alianza.obtenerMonedas(), (alianza.obtenerNivelDeAtaque())/2, 0.0);
	}
	
	@Test
	public void obtenerMonedas_UnaAlianzaAtacaAUnMarciano_NoRecibeMonedas () {
		Marciano marciano = new Marciano();

		Juguete juguete1 = new Juguete();
		Atributo lazo = new Lazo(1);
		juguete1.setAtributo(lazo);

		Juguete juguete2 = new Juguete();
		Atributo antigüedad = new Antigüedad(1);
		juguete2.setAtributo(antigüedad);

		Juguete juguete3 = new Juguete();
		Atributo metal = new Metal(1);
		juguete3.setAtributo(metal);
		Atributo laser = new Laser(metal.getAtaque());
		juguete3.setAtributo(laser);

		Alianza alianza = new Alianza();
		alianza.setJuguete(juguete1);
		alianza.setJuguete(juguete2);
		alianza.setJuguete(juguete3);

		alianza.atacar(marciano);
		
		assertEquals("Se obtuvieron monedas del ataque", alianza.obtenerMonedas(), 0, 0.0);
	}
	
	@Test
	public void obtenerMonedas_UnaAlianzaAtacaAUnaGarra_NoRecibeMonedas () {
		Garra garra = new Garra();
		
		Juguete juguete1 = new Juguete();
		Atributo lazo = new Lazo(1);
		juguete1.setAtributo(lazo);

		Juguete juguete2 = new Juguete();
		Atributo antigüedad = new Antigüedad(1);
		juguete2.setAtributo(antigüedad);

		Juguete juguete3 = new Juguete();
		Atributo metal = new Metal(1);
		juguete3.setAtributo(metal);
		Atributo laser = new Laser(metal.getAtaque());
		juguete3.setAtributo(laser);

		Alianza alianza = new Alianza();
		alianza.setJuguete(juguete1);
		alianza.setJuguete(juguete2);
		alianza.setJuguete(juguete3);

		alianza.atacar(garra);

		assertEquals("Se obtuvieron monedas del ataque", alianza.obtenerMonedas(), 0, 0.0);
	}
}
