package exercicio09;

public class TesteProduto {

	public static void main(String[] args) {
		Produto produto = new Produto("oreo", 2.99 , 200);
		
		produto.changeEstoque(-4);
		
		produto.changeEstoque(204);
		
		System.out.print(produto.toString());

	}

}
