package exercicio01;

/**
 * 1 - Crie uma classe chamada Livro com atributos como titulo,
 * autor, e numeroDePaginas.
 * Adicione métodos para abrir o livro e ler uma página.
 */
public class Livro {
    private String titulo;
    private String autor;
    private Integer numeroPaginas;
	private Integer paginaPercorrida = 0;
	private Boolean livroAberto = false;

    public Livro() {
    }

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    //getters
    public String getTitulo() {
    	return titulo;
    }
    
    public String getAutor() {
    	return autor;
    }
    
    public Integer getNumeroPaginas() {
    	return numeroPaginas;
    }
    
    public Integer getPaginaPercorrida() {
    	return paginaPercorrida;
    }
    
    public boolean getLivroAberto() {
    	return livroAberto;
    }
    
    
    //setters
    public void setTitulo(String titulo) {
    	this.titulo = titulo;
    }
    
    public void setAutor(String autor) {
    	this.autor = autor;
    }
    
    public void setNumeroPaginas(Integer numeroPaginas) {
    	this.numeroPaginas = numeroPaginas;
    }
    
    //methods
    public void lerPagina(){
        paginaPercorrida += 1;
    }

    public void abrirLivro(){
        livroAberto = true;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroDePaginas=" + numeroPaginas +
                '}';
    }
}
