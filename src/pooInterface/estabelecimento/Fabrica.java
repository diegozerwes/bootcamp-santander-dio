package pooInterface.estabelecimento;

import pooInterface.equipamentos.impressora.Deskjet;
import pooInterface.equipamentos.impressora.Impressora;

public class Fabrica {
	
	public static void main (String[] args) {
		
		Impressora imp = new Deskjet();
		
		imp.imprimir();
	}

}
