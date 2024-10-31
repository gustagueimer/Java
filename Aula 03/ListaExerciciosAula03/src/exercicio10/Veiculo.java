package exercicio10;

public class Veiculo {
	private String tipo;
	private String placa;
	private String cor;
	private int porcentagemCombustivel = 0;
	private boolean isLimpo = true;
	
	//Constructor
	public Veiculo(String tipo, String placa, String cor) {
		this.tipo = tipo;
		this.placa = placa;
		this.cor = cor;
	}
	
	//getters 
	public String getTipo() {
		return tipo;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public String getCor() {
		return cor;
	}
	
	public int getPorcentagemCombustivel() {
		return porcentagemCombustivel;
	}
	
	//setters 
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setPorcentagemCombustivel(int porcentagemCombustivel) {
		this.porcentagemCombustivel = porcentagemCombustivel;
	}
	
	//methods
	public void rodar() {
		if(porcentagemCombustivel <= 0) {
			System.out.println("O veiculo está sem gasosa :(");
			return;
		}
		System.out.println("Vroom Vroom");
		porcentagemCombustivel -= 10;
		isLimpo = false;
	}
	
	public void abastecerTank() {
		if(porcentagemCombustivel >= 100) {
			System.out.println("O tanque já está cheio :)");
			return;
		}
		System.out.println("Abastecendo o tanque...");
		porcentagemCombustivel = 100;
		System.out.println("Tanque abastecido!");
	}
	
	public void limparVeiculo() {
		if(isLimpo) {
			System.out.println("O veiculo já se encontra limpo :D");
			return;
		}
		System.out.println("Limpando o veiculo");
		isLimpo = true;
		System.out.println("Veiculo limpo!");
	}
	
	@Override
	public String toString() {
		return "Veiculo:{" +
				"tipo: '" + tipo + '\'' +
				", placa: '" + placa + '\'' +
				", cor: '" + cor + '\'' +
				", porcentagemCombustivel: '" + porcentagemCombustivel + '\'' +
				", isLimpo: '" + isLimpo + '\'' +
				"}";
	}
}
