package modelo;

import java.util.ArrayList;
import java.util.List;

import atributo.Atributo;

public class Juguete {
	private List<Atributo> atributos =  new ArrayList<>();
	private double monedas;

	public void setAtributo(Atributo atributo) {
		atributos.add(atributo);
	}

	public double obtenerMonedas() {
		return monedas;
	}
	
	public void agregarMonedas(double monedas) {
		this.monedas += monedas;
	}

	public double obtenerNivelDeAtaque() {
		double nivelDeAtaque = 0;
		for(Atributo atributo : atributos) {
			nivelDeAtaque += atributo.getAtaque();
		}
		return nivelDeAtaque;
	}
	

	public void atacar(Marciano marciano) {
		marciano.serAtacado(obtenerNivelDeAtaque());
		if (marciano.estaDerrotado()) {
			monedas = obtenerNivelDeAtaque()/2;
		}
	}
	
}
