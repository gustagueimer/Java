package exercicio14;

public class TesteJogo {

	public static void main(String[] args) {
		Jogo totk = new Jogo("The Legend of Zelda Tears of the Kingdom", Genero.ACTION_ADVENTURE, 299.99);
		
		System.out.println(totk.toString());
		
		totk.fecharJogo();
		
		totk.pause();
		
		totk.iniciarJogo();
		
		totk.pause();
		
		totk.pause();
		
		totk.iniciarJogo();
		
		totk.fecharJogo();
		
		System.out.println(totk.toString());
	}

}
