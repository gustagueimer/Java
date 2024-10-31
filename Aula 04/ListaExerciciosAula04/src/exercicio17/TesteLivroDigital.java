package exercicio17;

public class TesteLivroDigital {

	public static void main(String[] args) {
		LivroDigital book = new LivroDigital("A Volta Dos Que Não Foram", "Melon Musk", 17.07);
		
		System.out.println(book.toString());
		
		book.fecharLivro();
		
		book.abrirLivro();
		
		book.abrirLivro();
		
		book.fecharLivro();
		
		System.out.println(book.toString());

	}

}
