package modelo;

public class Marciano {
	private int vida;
	
	public Marciano() {
		this.vida = 10;
	}
	
	public void serAtacado (double nivelDeAtaque) {
		vida -= nivelDeAtaque;
	}
	
	public boolean estaDerrotado () {
		return vida <= 0;
	}
	
}
