package projota;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    int array[] = {0, 0, 0, 0, 0};
	    
	    for(int i=0; i<5; i++) {
	    	System.out.print("insira um número - ");
	        array[i] = scanner.nextInt();
	    }
	    
	    Arrays.sort(array);
	    
	    for (int i=0; i<5; i++) {
	    	System.out.println((i+1) + "° posição do array: " + array[i]);
	    }
	  
	}

}
