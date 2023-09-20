package contaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);	
		
		int numero;
		String agencia;
		String nomeCliente = "Mario de Andrade";
		double saldo = 237.48;
		
		System.out.println("Por favor, digite o número da agência");
		agencia = sc.next();
		
		System.out.println("Por favor, digite o número do usuário");
		numero = sc.nextInt();
		

		
		System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ". Sua conta é " + numero + ". Você possui R$" + saldo + " disponível para saque" );
		
	
		// System.out.println(agencia);
		

	}

}
