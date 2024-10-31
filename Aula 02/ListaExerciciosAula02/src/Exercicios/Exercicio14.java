package projota;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("digite uma palavra - ");
		String palavra = scanner.nextLine();
		palavra.toLowerCase();
		int vog = 0;
		
		for(int i=0; i<palavra.length(); i++) {
			switch(palavra.charAt(i)) {
				case 'a': vog++; break;
				case 'e': vog++; break;
				case 'i': vog++; break;
				case 'o': vog++; break;
				case 'u': vog++; break;
			}
		}
		
		System.out.print("vogais na palavra " + palavra + ": " + vog);

	}

}
