package exercicio08;

public class Professor {
	//attributes
	private String nome;
	private String disciplina;
	private Double salario;
	
	//constructor
	public Professor(String nome, String disciplina, Double salario) {
		this.nome = nome;
		this.disciplina = disciplina;
		this.salario = salario;
	}
	
	//getters
	public String getNome() {
		return this.nome;
	}
	
	public String getDisciplina() {
		return this.disciplina;
	}
	
	public Double getSalario() {
		return this.salario;
	}
	
	//setters
	public void setNome(String newNome) {
		this.nome = newNome;
	}
	
	public void setDiscilina(String newDisciplina) {
		this.disciplina = newDisciplina;
	}
	
	public void setSalario(Double newSalario) {
		this.salario = newSalario;
	}
	
	//methods
	public void darAula() {
		System.out.println("começando aula...");
		System.out.println("terminando aula...");
	}
	
	public void corrigirProvas() {
		System.out.println("corrigindo provas...");
		System.out.println("provas corrigidas.");
	}
	
	@Override
	public String toString() {
		return "Professor:{" +
				"Nome: '" + nome + '\'' +
				", Disciplina: '" + disciplina + '\'' +
				", Salario: R$" + salario + '\'' +
				"}";
	}
}
