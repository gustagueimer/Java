package projota;
import java.util.Scanner;

public class Exercicio15 {
	
	public static long fatoriadorDefault(long fatoriado) {
		long result = 1;
		
	    for (int i=2; i<=fatoriado; i++) {
	        result = result * i;
	    }
	    
		return result;
	}
	
	public static long fatoriadorRecursado(long fatoriado) {
		if (fatoriado == 1) {
			return 1;
		} else {
			return (fatoriado * fatoriadorRecursado(fatoriado-1));
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("insira um número a ser fatoriado - ");
		long fato = scanner.nextInt();
		
		System.out.println("resultado da fatoriação padrão: " + fatoriadorDefault(fato));
		System.out.println("resultado da fatoriação recursiva: " + fatoriadorRecursado(fato));

	}

}
