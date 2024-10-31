package projota;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int random = (int)(Math.random() * 101); // 0 to 100
		int tryes = 0;
		int guess = 0;
		
		do {
			System.out.print("adivinhe o número - ");
			guess = scanner.nextInt();
			if(guess == random) {
				System.out.println("acerto miserável");
			} else {
				System.out.println("errou bobão");
				if (guess < random) {
					System.out.println("é um número mais alto");
				} else {
					System.out.println("é um número mais baixo");
				}
			}
			tryes++;
		} while(guess != random);

	}

}
