package exercicio15;

public class Loja {
	private String nome;
	private String endereco;
	private String telefone;
	private boolean isOpen = false;
	
	//Constructor
	public Loja(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	//Getters
	public String getNome() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//Methods
	public void abrirLoja() {
		if(isOpen) {
			System.out.println("Não é possível abrir a loja se ela já estiver aberta :P");
			return;
		}
		isOpen = true;
		System.out.println("Loja aberta :D");
	}
	
	public void fecharLoja() {
		if(!isOpen) {
			System.out.println("Não é possível fechar a loja se ela já estiver fechada >:(");
			return;
		}
		isOpen = false;
		System.out.println("Loja fechada :C");
	}
	
	@Override
	public String toString() {
		return "Loja:{" +
				"Nome:'" + nome + '\'' +
				", Endereco: '" + endereco + '\'' +
				", Telefone: '" + telefone + '\'' + 
				", IsOpen: '" + isOpen + '\'' +
				"}";
	}
}
