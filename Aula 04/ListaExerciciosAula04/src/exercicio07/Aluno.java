package exercicio07;

import java.util.ArrayList;

public class Aluno {
	//attributes
	private String nome;
	private Integer matricula;
	private String curso;
	private ArrayList<Integer> notas = new ArrayList<Integer>();
	
	//constructor
	public Aluno(String nome, Integer matricula, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}
	
	//getters
	public String getNome() {
		return this.nome;
	}
	
	public Integer getMatricula() {
		return this.matricula;
	}
	
	public String getCurso() {
		return this.curso;
	}
	
	//setters
	public void setNome(String newNome) {
		this.nome = newNome;
	}
	
	public void setMatricula(Integer newMatricula) {
		this.matricula = newMatricula;
	}
	
	public void setCurso(String newCurso) {
		this.curso = newCurso;
	}
	
	//methods
	
	public void addNota(Integer newNota) {
		notas.add(newNota);
	}
	
	public void calcularMedia() {
		int temp = 0;
		for(int i=0; i<notas.size(); i++) {
			temp = temp + notas.get(i);
		}
		int result = temp / notas.size();
		System.out.print("a média das notas é: " + result + ".");
	}
	
	@Override
	public String toString() {
		return "Aluno:{" +
				"Nome: '" + nome + '\'' +
				", Matricula: '" + matricula + '\'' +
				", Curso: '" + curso + '\'' +
				"}";
				
	}
}