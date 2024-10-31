package exercicio15;

public class TesteLoja {

	public static void main(String[] args) {
		Loja atacadao = new Loja("Atacadão", "4269, rua elon musk da silva, curitiba - PR", "45 5555-6666");
		
		System.out.println(atacadao.toString());
		
		atacadao.fecharLoja();
		
		atacadao.abrirLoja();
		
		atacadao.abrirLoja();
		
		atacadao.fecharLoja();
		
		System.out.println(atacadao.toString());

	}

}
