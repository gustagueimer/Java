package exercicio04;

public class ContaBancaria {
	private int numeroConta;
	private String nomeAssociado;
	private double saldo;
	
	//constructors
	public ContaBancaria(int numeroConta, String nomeAssociado, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeAssociado = nomeAssociado;
		this.saldo = saldo;
	}
	
	//getters
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	public String getNomeAssociado() {
		return this.nomeAssociado;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	//setters
	public void setSaldo(int novoSaldo) {
		this.saldo = novoSaldo;
	}
	
	//methods
	public void sacar(double valorSaque) {
		if(valorSaque > this.saldo) {
			System.out.print("Erro: valor do saque maior que o saldo na conta \n");
		} else {
			this.saldo -= valorSaque;
			System.out.print("Saque realizado com sucesso :D \n");
		}
	}
	
	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
		System.out.print("Depósito realizado com sucesso :D \n");
	}
	
	@Override
	public String toString() {
		return "ContaBancaria:{" +
				"numeroConta: '" + numeroConta + '\'' +
				", nomeAssociado: '" + nomeAssociado + '\'' +
				", saldo: '" + saldo + '\'' +
				"}";
	}
}

