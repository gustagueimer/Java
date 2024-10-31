package projota;

public class Exercicio06 {

	static void arrayPrinter(int array[], int size) {
		for (int i = 0; i < size; i++) {
			System.out.println((i + 1) + "° posição do array: " + array[i]);
		}
	}

	public static void main(String[] args) {

		int[] arrayy = { 5, 4, 3, 2, 1 };

		arrayPrinter(arrayy, 5);

	}

}
