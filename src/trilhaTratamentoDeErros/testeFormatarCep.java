package trilhaTratamentoDeErros;

public class testeFormatarCep {

	public static void main(String[] args) {
		
		try {
		String cepFormatado = formatarCep ("23765064");
		System.out.println(cepFormatado);
		}
		catch (cepInvalidoException e) {
			e.printStackTrace();
			System.out.println("O CEP não corresponde com um CEP válido");
		}

	}
	static String formatarCep(String cep) throws cepInvalidoException{
        if(cep.length() != 8)
          throw new cepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
