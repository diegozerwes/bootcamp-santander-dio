package trilhaControledeFluxo;

public class SimplesCaixaEletronico {

	public static void main(String[] args) {
		double saldo = 25.0;
		double valorSolicitado = 24.5;
		
		if(valorSolicitado < saldo) {
			saldo = saldo - valorSolicitado;
			System.out.println("Seu saldo atualizado é:");
			System.out.println(saldo);

		}
		else {
			System.out.println("Valor insuficiente");
		}
		
		
	}

}
