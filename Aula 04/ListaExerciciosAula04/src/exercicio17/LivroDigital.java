package exercicio17;

public class LivroDigital {
	private String titulo;
	private String autor;
	private Double tamanhoArquivo;
	private boolean isOpen = false;
	
	//Constructor
	public LivroDigital(String titulo, String autor, Double tamanhoArquivo) {
		this.titulo = titulo;
		this.autor = autor;
		this.tamanhoArquivo = tamanhoArquivo;
	}
	
	//Getters
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public Double getTamanhoArquivo() {
		return tamanhoArquivo;
	}
	
	//Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setTamanhoArquivo(Double tamanhoArquivo) {
		this.tamanhoArquivo = tamanhoArquivo;
	}
	
	//Methods
	public void abrirLivro() {
		if(isOpen) {
			System.out.println("Não é possível abrir um livro digital já aberto :P");
			return;
		}
		isOpen = true;
		System.out.println("Livro digital aberto :D");
	}
	
	public void fecharLivro() {
		if(!isOpen) {
			System.out.println("Não é possível fechar um livro digital que já esteja fechado >:(");
			return;
		}
		isOpen = false;
		System.out.println("Livro Digital fechado :(");
	}
	
	@Override
	public String toString() {
		return "LivroDigital:{" +
				"Titulo: '" + titulo + '\'' +
				", Autor: '" + autor + '\'' +
				", TamanhoArquivo '" + tamanhoArquivo + '\'' +
				", IsOpen: '" + isOpen + '\'' +
				"}";
	}
}
