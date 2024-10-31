package exercicio09;

public class Produto {
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	//constructor
	public Produto(String nome, double preco, int quantidadeEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	//getters
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	
	//setters
	public void setNome(String newNome) {
		this.nome = newNome;
	}
	
	public void setPreco(double newPreco) {
		this.preco = newPreco;
	}
	
	public void setQuantidadeEStoque(int newQuantidadeEstoque) {
		this.quantidadeEstoque = newQuantidadeEstoque;
	}
	
	//methods
	public void changeEstoque(int changedAmount) {
		quantidadeEstoque = quantidadeEstoque + changedAmount;
		System.out.println("Quantidade alterada com sucesso");
		System.out.println("Quantidade em estoque: " + quantidadeEstoque + ".");
	}
	
	@Override
	public String toString() {
		return "Produto:{" +
				"nome: '" + nome + '\'' +
				", preco: '" + preco + '\'' +
				", quantidadeEstoque: '" + quantidadeEstoque + '\'' +
				"}";
	}
}
