package trilhaOperadores;

public class TestesComOperadores {

	public static void main(String[] args) {
		
		// Teste de concatenação
		
		String concatenacao = 1+1+1+"1";
		String concatenacao1 = 1+"1"+1+1;
		String concatenacao2 = 1+"1"+1+"1";
		String concatenacao3 = "1"+1+1+1;
		String concatenacao4 = "1"+(1+1+1);
		
		System.out.println(concatenacao);
		System.out.println(concatenacao1);
		System.out.println(concatenacao2);
		System.out.println(concatenacao3);
		System.out.println(concatenacao4);

	}

}
