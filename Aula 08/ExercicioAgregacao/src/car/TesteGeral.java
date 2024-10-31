package car;

public class TesteGeral {

	public static void main(String[] args) {
		Motor monstro = new Motor(1200, "ST 2.0", TipoCombustivel.GASOLINA, 500);
		Carro mito = new Carro("Tesla 2", monstro);
		
		mito.ligarCarro();
		
		mito.acionarAcelerador(100);
		
		mito.trocarMarcha();
		
		mito.acionarAcelerador(100);
		
		mito.trocarMarcha();
		
		mito.acionarFreio(200);
		
		mito.turboBoost();
		
		mito.reduzirPotencia();
		
		mito.desligarCarro();
		
	}

}
