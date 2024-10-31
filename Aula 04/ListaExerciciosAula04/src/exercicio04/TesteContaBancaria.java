package exercicio04;

public class TesteContaBancaria {

	public static void main(String[] args) {
		ContaBancaria bankaccount = new ContaBancaria(0001, "joãozinho da silva", 0.0);
		
		System.out.print(bankaccount.toString() + "\n");
		
		System.out.print("Saldo atual: " + bankaccount.getSaldo() + "\n"); 
		
		bankaccount.sacar(2.50);
		
		System.out.print("Saldo atual: " + bankaccount.getSaldo() + "\n");
		
		bankaccount.depositar(12.50);
		
		System.out.print("Saldo atual: " + bankaccount.getSaldo() + "\n");
		
		bankaccount.sacar(2.50);
		
		System.out.print("Saldo atual: " + bankaccount.getSaldo() + "\n");

	}

}
