package atributo;

public class Lazo implements Atributo {
	private int ataque;

	public Lazo(int fuerza){
		this.ataque = fuerza*2;
	}
	
	public int getAtaque() {
		return ataque;
	}
}