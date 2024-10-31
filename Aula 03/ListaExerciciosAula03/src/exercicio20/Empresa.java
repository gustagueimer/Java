package exercicio20;

public class Empresa {
	private String nome;
	private String cnpj;
	private Integer numeroFuncionarios;
	
	//Constructor
	public Empresa(String nome, String cnpj, Integer numeroFuncionarios) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	//Getters
	public String getNome() {
		return nome;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	//Methods
	public void contratarFuncionarios(Integer numeroFuncionarios) {
		if(numeroFuncionarios <= 0) {
			System.out.println("Não é possível contratar 0 funcionarios (ou menos) >:(");
			return;
		}
		this.numeroFuncionarios += numeroFuncionarios;
		if(numeroFuncionarios == 1) {
			System.out.println(numeroFuncionarios + " contratado com sucesso :D");
			return;
		}
		System.out.println(numeroFuncionarios + " contratados com sucesso :D");
	}
	
	public void demitirFuncionarios(Integer numeroFuncionarios) {
		if(numeroFuncionarios <= 0) {
			System.out.println("Não é possível demitir 0 funcionarios (ou menos) >:(");
			return;
		}
		if(numeroFuncionarios > this.numeroFuncionarios) {
			System.out.println("Não é possível demitir mais funcionarios do que a empresa tem no momento :/");
			return;
		}
		this.numeroFuncionarios -= numeroFuncionarios;
		if(numeroFuncionarios == 1) {
			System.out.println(numeroFuncionarios + " demitido com sucesso >:)");
			return;
		}
		System.out.println(numeroFuncionarios + " demitidos com sucesso >:)");
	}
	
	@Override
	public String toString() {
		return "Empresa:{" +
				"Nome: '" + nome + '\'' +
				", Cnpj: '" + cnpj + '\'' + 
				", NumeroFuncionarios: '" + numeroFuncionarios + '\'' +
				"}";
	}

}
