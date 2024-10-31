package projota;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("informe o seu nome - ");
		String nome = scanner.nextLine();

		System.out.print("informe a sua idade - ");
		int idade = scanner.nextInt();

		System.out.println("olá, " + nome);
		System.out.println("você tem " + idade + " anos");
		
		

	}

}
