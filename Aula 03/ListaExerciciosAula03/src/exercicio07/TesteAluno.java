package exercicio07;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno jeej = new Aluno("jeej", 202242, "curso");
		
		System.out.println(jeej.toString());
		
		jeej.addNota(50);
		jeej.addNota(69);
		jeej.addNota(90);
		
		jeej.calcularMedia();
	}

}
