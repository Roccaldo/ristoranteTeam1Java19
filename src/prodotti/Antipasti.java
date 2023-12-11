package prodotti;

public class Antipasti extends Prodotti{

	private PortataEnum portata;
	public Antipasti(PortataEnum portata, String nomePiatto, Double prezzo) {
		super(nomePiatto, prezzo);
		this.portata = portata;
	}

}