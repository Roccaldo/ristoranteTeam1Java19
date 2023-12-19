package prodotti;

import java.util.ArrayList;

public class Antipasti extends Prodotti{

	private PortataEnum portata;
	public Antipasti(String nomePiatto, Double prezzo) {
		super(nomePiatto, prezzo);
		this.portata = PortataEnum.ANTIPASTO;
	}

	public Antipasti(String nomePiatto, Double prezzo, ArrayList<AllergeniEnum> allergeni) {
		super(nomePiatto, prezzo, allergeni);
		this.portata = PortataEnum.ANTIPASTO;
	}

	public PortataEnum getPortata() {
		return portata;
	}

	public void setPortata(PortataEnum portata) {
		this.portata = portata;
	}

	@Override
	public void stampaDettagli() {
		super.stampaDettagli();
		System.out.println(" ");
	}
}