package pooInterface.equipamentos.multifuncional;

import pooInterface.equipamentos.copiadora.Copiadora;
import pooInterface.equipamentos.digitalizadora.Digitalizadora;
import pooInterface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora  {

	
	public void digitalizar() {
		
		System.out.println("Digitalizando via Equipamento Multifuncional");
	}

	
	public void copiar() {
		System.out.println("Copiando via Equipamento Multifuncional");
		
		
	}

	
	public void imprimir() {
		
		System.out.println("Imprimindo via Equipamento Multifuncional");
	}

}
