package exercicio13;

public class Time {
	private String nome;
	private String tecnico;
	private Integer numeroDeJogadores;
	
	//constructor
	public Time(String nome, String tecnico, Integer numeroDeJogadores) {
		this.nome = nome;
		this.tecnico = tecnico;
		this.numeroDeJogadores = numeroDeJogadores;
	}
	
	//getters
	public String getNome() {
		return nome;
	}
	
	public String getTecnico() {
		return tecnico;
	}
	
	public Integer getNumeroDeJogadores() {
		return numeroDeJogadores;
	}
	
	//setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}
	
	public void setNumeroDeJogadores(Integer numeroDeJogadores) {
		this.numeroDeJogadores = numeroDeJogadores;
	}
	
	//methods
	public void adicionarJogadores(Integer numeroDeJogadores) {
		this.numeroDeJogadores += numeroDeJogadores;
		System.out.println("Numero de jogadores atualizado com sucesso!");
	}
	
	public void removerJogadores(Integer numeroDeJogadores) {
		if(numeroDeJogadores > this.numeroDeJogadores) {
			System.out.println("Não é possível remover mais jogadores do que o time tem :/");
			return;
		}
		this.numeroDeJogadores -= numeroDeJogadores;
		System.out.println("Número de jogadores atualizado com sucesso!");
	}
	
	@Override
	public String toString() {
		return "Time:{" +
				"Nome: '" + nome + '\'' +
				", Tecnico: '" + tecnico + '\'' +
				", NumeroDeJogadores: '" + numeroDeJogadores + '\'' +
				"}";
	}
	
}
