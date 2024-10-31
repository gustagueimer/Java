package exercicio08;

public class TesteProfessor {

	public static void main(String[] args) {
		
		Professor psor = new Professor("joni", "java", 4200.00);
		
		System.out.print(psor.toString() + '\n');
		
		psor.darAula();
		
		psor.corrigirProvas();
	}

}
