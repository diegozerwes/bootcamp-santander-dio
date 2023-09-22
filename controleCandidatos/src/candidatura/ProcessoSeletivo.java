package candidatura; 
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
	public static void main(String[] args) {
		selecaoDeCandidatos();
		
		for (String candidato : candidatos) {
			entrandoEmContato(candidato);
		}
		
		
		
	}
	
		
	static void selecaoDeCandidatos() {
		// Array com a lista de candidatos

		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
				
			}
			candidatosAtual++;
			
		}
		
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do { 
			atendeu = atender();
			continuarTentando = !atendeu;
			
			if (continuarTentando) {
				tentativasRealizadas++;
			} else
				System.out.println("Tentativa realizada com sucesso");
			
		} while(continuarTentando && tentativasRealizadas < 3);
		
		if (atendeu) {
			System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "tentativa");
		} else {
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		}
		
		
		
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}
		else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para candidato com contra proposta");
		} 
		else {
			System.out.println("Aguardado resultado dos demais resultados");
			
		}
	}
	
	

}
