package exercicio03;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa laurencio = new Pessoa("laurêncio", "Masculino", 22, 1.84, "100.000.222-44", "1.922.345");
		
		System.out.print(laurencio.toString());
		
		System.out.print("\n" + laurencio.estado());
		
		laurencio.kill();
		
		System.out.print("\n" + laurencio.estado());
		
		laurencio.revive();
		
		System.out.print("\n" + laurencio.estado());

	}

}
