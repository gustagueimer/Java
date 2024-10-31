package exercicio18;

public class Bicicleta {
	private String marca;
	private String modelo;
	private Integer tamanhoRoda; 
	private boolean isPedalando = false;
	
	//Constructor
	public Bicicleta(String marca, String modelo, Integer tamanhoRoda) {
		this.marca = marca;
		this.modelo = modelo;
		this.tamanhoRoda = tamanhoRoda;
	}
	
	//Getters
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public Integer getTamanhoRoda() {
		return tamanhoRoda;
	}
	
	//Setters
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setTamanhoRoda(Integer tamanhoRoda) {
		this.tamanhoRoda = tamanhoRoda;
	}
	
	//Methods
	public void pedalar() {
		if(isPedalando) {
			System.out.println("Não dá pra pedalar a bicicleta se você já está pedalando a bicicleta :P");
			return;
		}
		isPedalando = true;
		System.out.println("Pedalando ~le bicicleta :D");
	}
	
	public void freiar() {
		isPedalando = false;
		System.out.println("Bicicleta freiada :P");
	}
	
	@Override
	public String toString() {
		return "Bicicleta:{" +
				"Marca: '" + marca + '\'' + 
				", Modelo: '" + modelo + '\'' +
				", TamanhoRoda: '" + tamanhoRoda + '\'' +
				", IsPedalando: '" + isPedalando + '\'' +
				"}";
	}
}
