package desafios;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class BancoAPP {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;
        

        

        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        
        for (int i = 0; i < periodo; i++) {
        	valorInicial = valorFinal * taxaJuros;
        	valorFinal = valorInicial + valorFinal;
        }
        
        DecimalFormat df = new DecimalFormat("#.00");	

        System.out.println("Valor final do investimento: " + df.format(valorFinal));
        
        scanner.close();
    }
	
	private static double parseInputDouble(String input) {
        input = input.replace(',', '.');
        return Double.parseDouble(input);
    }

}
