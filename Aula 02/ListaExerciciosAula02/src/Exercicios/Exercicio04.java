package projota;
import java.util.Scanner;

public class Exercicio04 {
	
    static Boolean pares(int valor) {
    	if (valor % 2 == 0) {
    		return true;
    	} else {
    		return false;
    	}
	}
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("insira um número: ");
		int valor = scanner.nextInt();
		
		if (pares(valor) == true) {
			System.out.print("o número é par");
		} else {
			System.out.print("o número é impar");
		}
	} 
}
