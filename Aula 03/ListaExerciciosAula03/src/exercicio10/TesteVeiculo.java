package exercicio10;

public class TesteVeiculo {

	public static void main(String[] args) {
		Veiculo car = new Veiculo("tesla", "OLL64Y", "amarelo");
		
		System.out.println(car.toString());
		
		car.rodar();
		
		car.abastecerTank();
		
		car.limparVeiculo();
		
		car.rodar();
		
		System.out.println(car.toString());

	}

}
