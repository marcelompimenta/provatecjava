package br.com.empiricus.collections03;

public class Aluno {
	
	private int idade;
	private String nome;
	
	public Aluno(int idade, String nome) {
		super();
		this.idade = idade;
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Aluno [idade=" + idade + ", nome=" + nome + "]";
	}
	
	
	

}
