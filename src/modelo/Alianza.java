package modelo;
import java.util.ArrayList;
import java.util.List;

public class Alianza {
	private List<Juguete> juguetes =  new ArrayList<>();
	private double monedas;
	
	public void setJuguete(Juguete juguete) {
		juguetes.add(juguete);
	}

	public double obtenerNivelDeAtaque() {
		double nivelDeAtaque = 0;
		for (Juguete juguete : juguetes) {
			nivelDeAtaque += juguete.obtenerNivelDeAtaque();	
		}
		return nivelDeAtaque;
	}
	
	public void atacar(Marciano marciano) {
		marciano.serAtacado(obtenerNivelDeAtaque());
		if (marciano.estaDerrotado()) {
			repartirMonedasGanadas(obtenerNivelDeAtaque()/2);
		}
	}

	private void repartirMonedasGanadas(double monedasGanadas) {
		for (Juguete juguete : juguetes) {
			juguete.agregarMonedas(monedasGanadas/(juguetes.size()));	
		}
		
	}

	public double obtenerMonedas() {
		for (Juguete juguete : juguetes) {
			monedas += juguete.obtenerMonedas();
		}
		return monedas;
	}
	
}
