package exercicio14;

public class Jogo {
	private String nome;
	private Genero genero;
	private Double preco;
	private boolean isRodando = false;
	private boolean isPausado = false;
	
	//Constructor
	public Jogo(String nome, Genero genero, Double preco) {
		this.nome = nome;
		this.genero = genero;
		this.preco = preco;
	}
	
	//Getters
	public String getNome() {
		return nome;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	//Methods
	public void iniciarJogo() {
		if(isRodando) {
			System.out.println("Não é possível começar um jogo que já está começado :p");
			return;
		}
		isRodando = true;
		System.out.println("Iniciando o jogo :D");
	}
	
	public void fecharJogo() {
		if(!isRodando) {
			System.out.println("Não dá pra fechar um jogo que não está aberto >:(");
			return;
		}
		isRodando = false;
		System.out.println("Jogo fechado :C");
	}
	
	public void pause() {
		if(!isRodando) {
			System.out.println("Obviamente não dá pra pausar um jogo que não está aberto :/");
			return;
		}
		if(isPausado) {
			isPausado = false;
			System.out.println("Despausando o jogo :D");
			return;
		} else {
			isPausado = true;
			System.out.println("Pausando o jogo :P");
		}
	}
	
	@Override
	public String toString() {
		return "Jogo:{" +
				"Nome: '" + nome + '\'' +
				", Genero: '" + genero + '\'' +
				", Preco: '" + preco + '\'' + 
				", IsRodando: '" + isRodando + '\'' +
				", IsPaudado: '" + isPausado + '\'' +
				"}";
	}

}	
