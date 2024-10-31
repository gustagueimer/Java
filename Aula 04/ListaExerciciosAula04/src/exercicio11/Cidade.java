package exercicio11;

public class Cidade {
	private String nome;
	private Integer populacao;
	private String estado;
	
	//constructor
	public Cidade(String nome, Integer populacao, String estado) {
		this.nome = nome;
		this.populacao = populacao;
		this.estado = estado;
	}
	
	//getters
	public String getNome() {
		return nome;
	}
	
	public Integer getPopulacao() {
		return populacao;
	}
	
	public String getEstado() {
		return estado;
	}
	
	//setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPopulacao(Integer populacao) {
		this.populacao = populacao;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	//methods
	public void aumentarPopulacao(Integer quantidade) {
		populacao += quantidade;
		System.out.println("População aumentada com sucesso!");
	}
	
	public void diminuirPopulacao(Integer quantidade) {
		if(populacao <= 0) {
			System.out.println("Não é possível diminuir uma população que não existe :/");
			return; 
		}
		if(quantidade > populacao) {
			System.out.println("Não é possivel remover uma população maior que a atual :/");
			return;
		}
		populacao -= quantidade;
		System.out.println("População reduzida com sucesso!");
	}
	
	@Override
	public String toString() {
		return "Cidade:{" +
				"nome: '" + nome + '\'' +
				", populacao: '" + populacao + '\'' +
				", estado: '" + estado + '\'' +
				"}";
	}
	
}
