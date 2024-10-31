package exercicio20;

public class TesteEmpresa {

	public static void main(String[] args) {
		Empresa tesla = new Empresa("Tesla", "170720202020-24", 200);
		
		System.out.println(tesla.toString());
		
		tesla.contratarFuncionarios(0);
		
		tesla.contratarFuncionarios(-2);
		
		tesla.contratarFuncionarios(1);
		
		tesla.contratarFuncionarios(99);
		
		System.out.println(tesla.toString());
		
		tesla.demitirFuncionarios(0);
		
		tesla.demitirFuncionarios(-2);
		
		tesla.demitirFuncionarios(301);
		
		tesla.demitirFuncionarios(1);
		
		tesla.demitirFuncionarios(43);
		
		System.out.println(tesla.toString());

	}

}
