package exercicio06;

public class Computador {
	private String processador;
	private int quantidadeRAM;
	private int quantidadeArmazenamento;
	private String sistemaOperacional;
	
	//constructor
	public Computador(String processador, int quantidadeRAM, int quantidadeArmazenamento, String sistemaOperacional) {
		this.processador = processador;
		this.quantidadeRAM = quantidadeRAM;
		this.quantidadeArmazenamento = quantidadeArmazenamento;
		this.sistemaOperacional = sistemaOperacional;
	}
	
	//getters 
	public String getProcessador() {
		return this.processador;
	}
	
	public int getQuantidadeRAM() {
		return this.quantidadeRAM;
	}
	
	public int getQuantidadeArmazenamento() {
		return this.quantidadeArmazenamento;
	}
	
	public String getSistemaOperacional() {
		return this.sistemaOperacional;
	}
	
	//setters
	public void setProcessador(String novoProcessador) {
		this.processador = novoProcessador;
	}
	
	public void setSistemaOperacional(String novoSistemaOperacional) {
		this.sistemaOperacional = novoSistemaOperacional;
	}
	
	//methods
	public void upgradeRAM(int novaRAM) {
		this.quantidadeRAM += novaRAM;
		System.out.print("Quantidade de memoria ram do pc atualizada com sucesso \n");
	}
	
	public void downgradeRAM(int removedRAM) {
		if(this.quantidadeRAM < removedRAM) {
			System.out.print("Erro: não é possível tirar uma quantidade de memória RAM  maior do que o pc tem \n");
		} else {
			this.quantidadeRAM -= removedRAM;
			System.out.print("quantidade de memória RAM removida com sucesso \n");
		}
	}
	
	public void upgradeArmazenamento(int novoArmazenamento) {
		this.quantidadeArmazenamento += novoArmazenamento;
		System.out.print("Quantidade de armazenamento do pc atualizada com sucesso \n");
	}
	
	public void downgradeArmazenamento(int removedArmazenamento) {
		if(this.quantidadeArmazenamento < removedArmazenamento) {
			System.out.print("Erro: não é possível tirar uma quantidade de armazenamento maior do que o pc tem \n");
		} else {
			this.quantidadeArmazenamento -= removedArmazenamento;
			System.out.print("Quantidade de armazenamento removida com sucesso \n");
		}
	}
	
	@Override
	public String toString() {
		return "Computador:{" +
				"Processador: '" + processador + '\'' +
				", QuantidadeRAM: '" + quantidadeRAM + '\'' +
				", QuantidadeArmazenamento: '" + quantidadeArmazenamento + '\'' +
				", SistemaOperacional: '" + sistemaOperacional + '\'' +
				"}";
	}
}
