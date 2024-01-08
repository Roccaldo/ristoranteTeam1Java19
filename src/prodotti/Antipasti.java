package prodotti;

import java.util.ArrayList;

public class Antipasti extends Prodotti{

	//Costruttore
	public Antipasti(String nomePiatto, Double prezzo, PortataEnum portata, ArrayList<AllergeniEnum> allergeni) {
		super(nomePiatto, prezzo, portata, allergeni);
	}
	//Metodo Stampa Dettagli portata
	@Override
	public void stampaDettagli() {
		super.stampaDettagli();
		System.out.println();
	}
}