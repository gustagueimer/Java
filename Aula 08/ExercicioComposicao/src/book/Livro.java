package book;

import java.util.ArrayList;
import java.util.List;

public class Livro {
	private String titulo;
	private String autor;
	private List<Pagina> paginas = new ArrayList<Pagina>();
	
	//constructor 
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	//getters
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	//setters 
	public void setTitulo(String novoTitulo) {
		this.titulo = novoTitulo;
	}
	
	public void setAutor(String novoAutor) {
		this.autor = novoAutor;
	}
	
	//methods
	
	public void adicionarPagina(String conteudo) {
		int numeroPagina = this.paginas.size() + 1;
		Pagina novaPagina = new Pagina(numeroPagina, conteudo);
		this.paginas.add(novaPagina);
	}
	
	public void verPaginas() {
		int indexSize = this.paginas.size();
		for(int index=0; index<indexSize; index++) {
			System.out.print(this.paginas.get(index));
		}
	}
	
}
