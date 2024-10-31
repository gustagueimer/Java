package projota;
import java.util.Scanner;

public class Exercicio07 {

	public static int somador(int v1, int v2) {
		return v1 + v2;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira um valor - ");
		int valor1 = scanner.nextInt();
		
		System.out.print("Informe outro valor - ");
		int valor2 = scanner.nextInt();
		
	    System.out.print("Resultado da soma: " + somador(valor1, valor2));
	}

}
