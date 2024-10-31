package car;

public class Motor {
	private int cilindradas;
	private String modelo;
	private TipoCombustivel tipoCombustivel;
	private int rpm = 0;
	private int potencia;
	private boolean isLigado = false;
	
	
	//constructor
	public Motor(int cilindradas, String modelo, TipoCombustivel tipoCombustivel, int potencia) {
		this.cilindradas = cilindradas;
		this.modelo = modelo;
		this.tipoCombustivel = tipoCombustivel;
		this.potencia = potencia;
	}
	
	//getters
	public int getCilindradas() {
		return this.cilindradas;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public TipoCombustivel getTipoCombustivel() {
		return this.tipoCombustivel;
	}
	
	public int getRPM() {
		return this.rpm;
	}
	
	public int getPotencia() {
		return this.potencia;
	}
	
	//setters
	
	public void setCilindradas(int novoCilindradas) {
		this.cilindradas = novoCilindradas;
	}
	
	public void setModelo(String novoModelo) {
		this.modelo = novoModelo;
	}
	
	public void setTipoCombustivel(TipoCombustivel novoTipoCombustivel) {
		this.tipoCombustivel = novoTipoCombustivel;
	}
	
	public void setPotencia(int novoPotencia) {
		this.potencia = novoPotencia;
	}
	
	//methods
	protected void ligarMotor() {
		System.out.print("Dando partida no motor... \n");
		this.isLigado = true;
	}
	
	protected void desligarMotor() {
		System.out.print("Desligando o motor... \n");
		this.isLigado = false;
	}
	
	protected void aumentarPotencia(int incremento) {
		this.potencia += incremento;
	}
	
	protected void reduzirPotencia(int decremento) {
		this.potencia -= decremento;
	}
	
	protected void acelerar(int incrementoRPM) {
		this.rpm += incrementoRPM;
	}
	
	protected void reduzirRPM(int decrementoRPM) {
		this.rpm -= decrementoRPM;
	}

}
