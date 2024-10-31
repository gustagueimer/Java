package exercicio11;

public class TesteCidade {

	public static void main(String[] args) {
		Cidade city = new Cidade("Neuiorq", 100000, "Texas");
		
		System.out.println(city.toString());
		
		city.diminuirPopulacao(120000);
		
		city.aumentarPopulacao(100000);
		
		city.diminuirPopulacao(36000);
		
		System.out.println(city.toString());

	}

}
