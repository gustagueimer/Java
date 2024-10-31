package exercicio12;

public class TesteFilme {

	public static void main(String[] args) {
		Filme absoluteCinema = new Filme("A volta dos que não foram", "Oppenheimer", 120);
		
		System.out.println(absoluteCinema.toString());
		
		absoluteCinema.endWatch();
		
		absoluteCinema.startWatch();
		
		absoluteCinema.endWatch();
		
		System.out.println(absoluteCinema.toString());

	}

}
