package exercicio12;

public class Filme {
	private String nome;
	private String diretor;
	private Integer duracao;
	private boolean isAssistindo = false;
	
	//constructor
	public Filme(String nome, String diretor, Integer duracao) {
		this.nome = nome;
		this.diretor = diretor;
		this.duracao = duracao;
	}
	
	//getters
	public String getNome() {
		return nome;
	}
	
	public String getDiretor() {
		return diretor;
	}
	
	public Integer getDuracao() {
		return duracao;
	}
	
	//setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}
	
	//methods 
	public void startWatch() {
		if(isAssistindo) {
			System.out.println("O filme já esta sendo assistido :D");
			return;
		}
		System.out.println("Começando a assistir o filme :D");
		isAssistindo = true;
	}
	
	public void endWatch() {
		if(!isAssistindo) {
			System.out.println("Não tem como parar de assistir o filme se você nem está assistindo o filme :p");
			return;
		}
		System.out.println("Parando de assistir o filme :(");
		isAssistindo = false;
	}
	
	@Override
	public String toString() {
		return "Filme:{" +
				"nome: '" + nome + '\'' +
				", diretor: '" + diretor + '\'' +
				", duracao: '" + duracao + '\'' +
				", isAssistindo: '" + isAssistindo + '\'' +
				"}";
	}
}
