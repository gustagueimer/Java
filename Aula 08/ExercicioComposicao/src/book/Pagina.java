package book;

public class Pagina {
	private int numero;
	private String conteudo;
	
	//constructor
	public Pagina(int numero, String conteudo) {
		this.numero = numero;
		this.conteudo = conteudo;
	}
	
	public String toString() {
		return "página " + numero + "\n\n" + conteudo + ".\n\n";
	}
}
