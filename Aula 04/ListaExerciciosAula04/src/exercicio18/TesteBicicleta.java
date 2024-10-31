package exercicio18;

public class TesteBicicleta {

	public static void main(String[] args) {
		Bicicleta bikosa = new Bicicleta("Caloi", "Explorer", 29);
		
		System.out.println(bikosa.toString());
		
		bikosa.freiar();
		
		bikosa.pedalar();
		
		bikosa.pedalar();
		
		bikosa.freiar();
		
		System.out.println(bikosa.toString());
	}

}
