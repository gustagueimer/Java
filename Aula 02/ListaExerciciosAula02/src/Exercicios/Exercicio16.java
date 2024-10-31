package projota;
import java.util.Scanner;

public class Exercicio16 {
	
	public static float converter(float temp, int op) {
		switch(op) {
			case 1: {
				temp = (temp * 1.8f) + 32;
				break;
			}
			case 2: {
				temp = (temp - 32) / 1.8f;
				break;
			}
			default: {
				System.out.println("opção escolhida não existe");
				return 0;
			}
		}
		
		return temp;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("conversor de temperaturas deluxe (agora em java)");
		System.out.println("escolha uma operação: 1-°C -> °F | 2-°F -> °C");
		int operasao = scanner.nextInt();
		
		System.out.println("insira a temperatura a ser convertida:");
		float temperature = scanner.nextFloat();
		
		System.out.print("resultado do conversor: " + converter(temperature, operasao));

	}

}
