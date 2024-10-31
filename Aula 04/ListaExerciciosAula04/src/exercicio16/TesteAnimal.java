package exercicio16;

public class TesteAnimal {

	public static void main(String[] args) {
		Animal luan = new Animal("mongol", 18, 74.50);
		
		System.out.println(luan.toString());
		
		luan.acordar();
		
		luan.porPraDormir();
		
		luan.porPraDormir();
		
		luan.alimentar();
		
		luan.acordar();
		
		System.out.println(luan.toString());

	}

}
