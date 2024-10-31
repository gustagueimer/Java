package projota;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("digite uma palavra - ");
		String estringue = scanner.nextLine();
		
		estringue = estringue.toLowerCase();
		
		String reverse = "";
		
		for (int i=0; i<estringue.length(); i++) {
			reverse = estringue.charAt(i) + reverse;
		}
		
		/*
		System.out.println("string original: " + estringue);
		System.out.println("string reverse: " + reverse);
		*/
		
		if(estringue.equals(reverse)) {
			System.out.print("a palavra é um polímero");
		} else {
			System.out.print("a palavra não é um polímero");
		}

	}

}
