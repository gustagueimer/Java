package book;

public class TesteLivro {

	public static void main(String[] args) {
		
		Livro livraoDaMassa = new Livro("A Volta Dos Que Não Foram", "Dim Todd");
		
		livraoDaMassa.adicionarPagina("omaga");
		
		livraoDaMassa.adicionarPagina("é o shadou vei");
		
		livraoDaMassa.verPaginas();

	}

}
