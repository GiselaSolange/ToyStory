package atributo;

public class Palo implements Atributo {
	private int ataque;
	
	public Palo() {
		this.ataque +=10;
	}

	public int getAtaque() {
		return ataque;
	}
}
