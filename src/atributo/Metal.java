package atributo;

public class Metal implements Atributo{
	private int ataque;

	public Metal(int cantidad){
		this.ataque = cantidad;
	}
	
	public int getAtaque() {
		return ataque;
	}

}
