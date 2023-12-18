package prodotti;

public class Antipasti extends Prodotti{

	private PortataEnum portata;
	public Antipasti(String nomePiatto, Double prezzo, PortataEnum portata) {
		super(nomePiatto, prezzo);
		this.portata = PortataEnum.ANTIPASTO;
	}

	public PortataEnum getPortata() {
		return portata;
	}

	public void setPortata(PortataEnum portata) {
		this.portata = portata;
	}
}