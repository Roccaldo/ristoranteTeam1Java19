package prodotti;

import java.util.ArrayList;

public class Antipasti extends Prodotti{

	//TODO è in comune a tutti, Ubaldo ha già la soluzione
	//portataEnum
	private PortataEnum portata;

	//Costruttore
	public Antipasti(String nomePiatto, Double prezzo, ArrayList<AllergeniEnum> allergeni) {
		super(nomePiatto, prezzo, allergeni);
		this.portata = PortataEnum.ANTIPASTO;
	}

	//Getter e Setter
	public PortataEnum getPortata() {
		return portata;
	}

	public void setPortata(PortataEnum portata) {
		this.portata = portata;
	}

	//Metodo Stampa Dettagli portata
	@Override
	public void stampaDettagli() {
		super.stampaDettagli();
		System.out.println();
	}
}