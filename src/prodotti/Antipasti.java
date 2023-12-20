package prodotti;

import java.util.ArrayList;

public class Antipasti extends Prodotti{

	//TODO è in comune a tutti, Ubaldo ha già la soluzione
	//portataEnum
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
		System.out.print("\u001B[36m");
		super.stampaDettagli();
		System.out.println("\u001B[0m ");
	}
}