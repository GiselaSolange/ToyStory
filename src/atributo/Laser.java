package atributo;

public class Laser implements Atributo {
	private int ataque;
	
	public Laser(int metal) {
		this.ataque = metal;
	}

	public int getAtaque() {
		return ataque;
	}
}
