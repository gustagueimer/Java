package exercicio05;

public class TesteCachorro {

	public static void main(String[] args) {
		Cachorro tobias = new Cachorro("Tobias", "albino", 12);
		
		System.out.print(tobias.toString() + "\n");
		
		tobias.estado();
		
		tobias.correr();
		
		tobias.estado();
		
		tobias.stopCorrer();
		
		tobias.estado();

	}

}
