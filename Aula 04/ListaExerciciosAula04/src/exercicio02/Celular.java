package exercicio02;

public class Celular {
	private String marca;
	private String modelo;
	private int capacidadeBateria;
	private boolean isLigado = false;

	//construtor
	public Celular(String marca, String modelo, int capacidadeBateria) {
		this.marca = marca;
		this.modelo = modelo;
		this.capacidadeBateria = capacidadeBateria;
	}
	
	//getters
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public int getCapacidadeBateria() {
		return this.capacidadeBateria;
	}
	
	public String estado() {
		if(this.isLigado) {
			return "Está ligado";
		} else {
			return "Está desligado";
		}
	}
	
	public void ligarCelular() {
		this.isLigado = true;
	}
	
	public void desligarCelular() {
		this.isLigado = false;
	}
	
	@Override
	public String toString() {
		return "Celular{" + 
				"Marca: '" + marca + '\'' + 
				", Modelo: '" + modelo + '\'' +
				", Capacidade da bateria: " + capacidadeBateria + 
				'}';
	}
}
