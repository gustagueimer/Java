package exercicio19;

public class Cozinha {
	private String tipo;
	private Integer quantidadePessoas;
	private String cor;
	private boolean isLimpa = true;
	
	//Constructor
	public Cozinha(String tipo, Integer quantidadePessoas, String cor) {
		this.tipo = tipo;
		this.quantidadePessoas = quantidadePessoas;
		this.cor = cor;
	}
	
	//Getters
	public String getTipo() {
		return tipo;
	}
	
	public Integer getQuantidadePessoas() {
		return quantidadePessoas;
	}
	
	public String getCor() {
		return cor;
	}
	
	//Setters
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setQuantidadePessoas(Integer quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	//Methods
	public void cozinhar(Integer qntPratos) {
		if(qntPratos <= 0) {
			System.out.println("Não é possível cozinhar 0 pratos (ou menos) >:(");
			return;
		}
		isLimpa = false;
		System.out.println(qntPratos + " pratos cozinhados :D");
	}
	
	public void limpar() {
		if(isLimpa) {
			System.out.println("Não tem porquê limpar a cozinha se ela já está limpa :P");
			return;
		}
		isLimpa = true;
		System.out.println("Cozinha limpa com sucesso :D");
	}
	
	@Override
	public String toString() {
		return "Cozinha:{" +
				"Tipo: '" + tipo + '\'' +
				", QuantidadePessoas: '" + quantidadePessoas + '\'' +
				", Cor: '" + cor + '\'' +
				", IsLimpa: '" + isLimpa + '\'' +
				"}";
	}
}
