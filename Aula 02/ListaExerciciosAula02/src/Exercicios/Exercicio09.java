package projota;
import java.util.Scanner;

public class Exercicio09 {
	
	static int calcDeluxe(int v1, int v2, String operation) {
		switch(operation) {
			case "+": {
				return v1 + v2;
			}
			case "-": {
				return v1 - v2;
			}
			case "*": {
				return v1 * v2;
			}
			case "/": {
				return v1 / v2;
			}
			default: {
				System.out.println("operação escolhida é inválida");
				return 1;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("insira o primeiro valor - ");
		int valor1 = scanner.nextInt();
		
		System.out.print("insira o segundo valor - ");
		int valor2 = scanner.nextInt();
		
		System.out.print("escolha a operação [+][-][*][/]: ");
		String ope = scanner.next();
		
		System.out.print("resultado: " + calcDeluxe(valor1, valor2, ope));
	}

}
