package exercicio03;

public class Pessoa {
	private String nome;
	private String sexo;
	private int idade;
	private double altura;
	private String CPF;
	private String RG;
	private boolean isAlive = true;
	
	//constructor
	public Pessoa(String nome, String sexo, int idade, double altura, String CPF, String RG) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
		this.CPF = CPF;
		this.RG = RG;
	}
	
	//getters
	public String getNome() {
		return this.nome;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public String getCPF() {
		return this.CPF;
	}
	
	public String getRG() {
		return this.RG;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	//setters
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	//methods
	public void kill() {
		this.isAlive = false;
	}
	
	public void revive() {
		this.isAlive = true;
	}
	
	public String estado() {
		if(this.isAlive) {
			return "A pessoa está viva :D";
		} else {
			return "A pessoa morreu :(";
		}
	}
	
	@Override
	public String toString() {
		return "Pessoa:{" +
				"nome: '" + this.nome + '\'' +
				", sexo: '" + this.sexo + '\'' +
				", idade: '" + this.idade + '\'' +
				", altura: '" + this.altura + '\'' +
				", CPF: '" + this.CPF + '\'' + 
				", RG: '" + this.RG + '\'' +
				"}";
	}
}
