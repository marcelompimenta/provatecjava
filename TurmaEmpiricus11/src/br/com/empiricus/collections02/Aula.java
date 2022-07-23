package br.com.empiricus.collections02;

public class Aula {
	
	private String titulo;
	private int tempo;
		
	public Aula(String titulo, int tempo) {
		super(); // --> referencia a super Classe acima...Object
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	
	public String toString() {
		return "Aula: " + this.titulo + " | " + this.tempo + " minutos";
	}

}
