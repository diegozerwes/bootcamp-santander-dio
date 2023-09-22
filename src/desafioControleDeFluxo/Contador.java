package desafioControleDeFluxo;

import java.util.Locale;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		
		System.out.println("Digite um número inteiro: ");
		
		int parametroUm = sc.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		int parametroDois = sc.nextInt();
		
		try {
			contar (parametroUm, parametroDois);
		} catch (ParametrosInvalidosException exception) {
			System.out.println("O primeiro número deve ser menor que o segundo");
		}
			
		}
		
	static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		
		
		for (int i = 1; i <= contagem; i++) {
			
			System.out.println(i);
		}
	
		
		
	}

}
