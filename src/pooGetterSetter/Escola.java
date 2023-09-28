package pooGetterSetter;

public class Escola {
	
	public static void main (String[] args) {
		
		Aluno pilar = new Aluno();
		pilar.setNome("Pilar");
		pilar.setIdade(1);
		
		Aluno ana = new Aluno();
		ana.setNome("Ana");
		ana.setIdade(37);
		
		System.out.println(pilar.getNome() + " tem " + pilar.getIdade() + " anos");
		System.out.println(ana.getNome() + " tem " + ana.getIdade() + " anos");
	}

}
