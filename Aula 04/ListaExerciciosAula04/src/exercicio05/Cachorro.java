package exercicio05;

public class Cachorro {
	private String nome;
	private String raça;
	private int idade;
	private boolean isCorrendo = false;
	
	//constructor
	public Cachorro(String nome, String raça, int idade) {
		this.nome = nome;
		this.raça = raça;
		this.idade = idade;
	}
	
	//getters
	public String getNome() {
		return this.nome;
	}
	
	public String getRaça() {
		return this.raça;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	//setters
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	//methods
	public void latir() {
		System.out.print(this.nome + " diz: au au \n");
	}
	
	public void estado() {
		if(this.isCorrendo) {
			System.out.print(this.nome + " está correndo :D \n");
		} else {
			System.out.print(this.nome + " está parado \n");
		}
	}
	
	public void correr() {
		this.isCorrendo = true;
	}
	
	public void stopCorrer() {
		this.isCorrendo = false;
	}
	
	@Override
	public String toString() {
		return "Cachorro:{" +
				"Nome: '" + this.nome + '\'' +
				", Raça: '" + this.raça + '\'' +
				", Idade: '" + this.idade + '\'' +
				"}";
	}
}
