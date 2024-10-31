package exercicio06;

public class TesteComputador {

	public static void main(String[] args) {
		Computador compiuter = new Computador("i7 12700K", 16, 500, "Windows 7");
		
		System.out.print(compiuter.toString() + "\n");
		
		System.out.print("Processador do pc: " + compiuter.getProcessador() + "\n");
		
		System.out.print("Sistema operacional do pc: " + compiuter.getSistemaOperacional() + "\n");
		
		compiuter.downgradeRAM(20);
		
		compiuter.upgradeRAM(16);
		
		System.out.print("Quantidade de memória RAM do pc: " + compiuter.getQuantidadeRAM() + "GB \n");
		
		compiuter.downgradeRAM(16);
		
		System.out.print("Quantidade de memória RAM do pc: " + compiuter.getQuantidadeRAM() + "GB \n");
		
		compiuter.downgradeArmazenamento(1000);
		
		compiuter.upgradeArmazenamento(500);
		
		System.out.print("Quantidade de armazenamento do pc: " + compiuter.getQuantidadeArmazenamento() + "GB\n");
		
		compiuter.downgradeArmazenamento(500);
		
		System.out.print("Quantidade de armazenamento do pc: " + compiuter.getQuantidadeArmazenamento() + "GB\n");
	}

}
