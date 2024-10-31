package projota;
import java.util.Scanner;

public class Exercicio10 {

	static boolean findPrimo(int number) {
	    int primo = 0;
	    if(number == 2){
	        primo = 1;
	    }
	    for(int i=number; i>2; i--){
	        if(number % (i-1) != 0 || number==3){
	            primo=1;
	        }else{
	            primo=0;
	            break;
	        }
	    }
	    if(primo==1){
	        return true;
	    }else{
	        return false;
	    }
	}
	
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("insira um número - ");
		int numero = scanf.nextInt();
		
		if(findPrimo(numero) == true) {
			System.out.print("o número é primo");
		} else {
			System.out.print("o número não é primo");
		}
	}
}
