package exercicio19;

public class TesteCozinha {

	public static void main(String[] args) {
		Cozinha letThemCook = new Cozinha("Cozinha", 13, "Roxo");
		
		System.out.println(letThemCook.toString());
		
		letThemCook.limpar();
		
		letThemCook.cozinhar(0);
		
		letThemCook.cozinhar(-2);
		
		letThemCook.cozinhar(17);
		
		letThemCook.limpar();
		
		letThemCook.setCor("Amarelo");
		
		System.out.println(letThemCook.toString());

	}

}
