package atributo;

public class Antigüedad implements Atributo{
	private int ataque;
	
	public Antigüedad(int anios) {
		this.ataque = anios;
	}

	public int getAtaque() {
		return ataque;
	}
}
