package exercicio13;

public class TesteTime {

	public static void main(String[] args) {
		Time sfc = new Time("Santos", "Neymar", 32);
		
		System.out.println(sfc.toString());
		
		sfc.adicionarJogadores(64);
		
		sfc.removerJogadores(128);
		
		sfc.removerJogadores(32);
		
		System.out.println(sfc.toString());

	}

}
