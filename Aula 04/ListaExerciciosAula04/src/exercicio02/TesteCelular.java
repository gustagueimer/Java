package exercicio02;

public class TesteCelular {

	public static void main(String[] args) {
		Celular mobile = new Celular("semsung", "galaxy s22", 15000);
		
		System.out.print(mobile.toString());
		
		String maybe = mobile.getModelo();
		
		System.out.print("\n" + maybe);
		
		System.out.print("\n" + mobile.getMarca());
		
		System.out.print("\n" + mobile.getCapacidadeBateria() + "mAh");
		
		System.out.print("\n" + mobile.estado());
		
		mobile.ligarCelular();
		
		System.out.print("\n" + mobile.estado());

	}

}
