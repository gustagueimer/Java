package exercicio16;

public class Animal {
	private String especie;
	private Integer idade;
	private Double peso;
	private boolean isAcordado = true;
	
	//constructor
	public Animal(String especie, Integer idade, Double peso) {
		this.especie = especie;
		this.idade = idade;
		this.peso = peso;
	}
	
	//Getters
	public String getEspecie() {
		return especie;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public Double getPeso() {
		return peso;
	}
	
	//Setters
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	//Methods
	public void alimentar() {
		if(!isAcordado) {
			System.out.println("Não dá pra alimentar o animal se ele estiver dormindo :/");
			return;
		}
		System.out.println("Animal alimentado com sucesso :D");
	}
	
	public void porPraDormir() {
		if(!isAcordado) {
			System.out.println("Não dá pra por o animal pra dormir se ele já estiver dormindo :P");
			return;
		}
		isAcordado = false;
		System.out.println("Animal botado pra mimir");
	}
	
	public void acordar() {
		if(isAcordado) {
			System.out.println("Não é possível acordar o animal que já está acordado >:(");
			return;
		}
		isAcordado = true;
		System.out.println("Animal acordado com sucesso :D");
	}
	
	@Override
	public String toString() {
		return "Animal:{" +
				"Especie: '" + especie + '\'' +
				", Idade: '" + idade + '\'' + 
				", Peso: '" + peso + '\'' +
				", IsAcordado: '" + isAcordado + '\'' +
				"}";
	}
}
