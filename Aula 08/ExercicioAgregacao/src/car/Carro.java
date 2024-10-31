package car;

public class Carro {
	private String modelo;
	private Motor motor;
	
	//constructor
	public Carro(String modelo, Motor motor) {
		this.modelo = modelo;
		this.motor = motor;
	}
	
	//getters
	public String getModelo() {
		return this.modelo;
	}
	
	//setters
	public void setModelo(String novoModelo) {
		this.modelo = novoModelo;
	}
	
	public void setMotor(Motor novoMotor) {
		this.motor = novoMotor;
	}
	
	//methods
	public void acionarAcelerador(int incrementoRPM) {
		System.out.print("O Carro está acelerando... \n");
		motor.acelerar(incrementoRPM);
	}
	
	public void acionarFreio(int decrementoRPM) {
		System.out.print("O Carro está desaceleradno... \n");
		motor.reduzirRPM(decrementoRPM);
	}
	
	public void trocarMarcha() {
		System.out.print("Passando mais uma marcha... \n");
	}
	
	public void ligarCarro() {
		System.out.print("Ligando o car... \n");
		motor.ligarMotor();
	}
	
	public void desligarCarro() {
		motor.desligarMotor();
		System.out.print("desligando o carro... \n");
	}
	
	public void turboBoost() {
		System.out.print("Soltando o nitro... \n");
		motor.aumentarPotencia(200);
	}
	
	public void reduzirPotencia() {
		System.out.print("Reduzindo a potência do monstro... \n");
		motor.reduzirPotencia(200);
	}
}
