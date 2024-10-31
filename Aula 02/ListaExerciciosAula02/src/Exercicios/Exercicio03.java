package projota;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("insira um valor: ");
		float valor = scanner.nextFloat();
		
		System.out.print("insira mais um valor: ");
		float valor2 = scanner.nextFloat();
		
		System.out.println("Resultado soma: " + (valor + valor2));
		System.out.println("Resultado subtração: " + (valor - valor2));
		System.out.println("Resultado multiplicação: " + (valor * valor2));
		System.out.println("Resultado divisão: " + (valor / valor2));
	}

}
