package br.com.empiricus.collections03;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		
		System.out.println("Quantos alunos vc deseja add: ");
		int numeroAlunos = sc.nextInt();
		
		for(int i = 0; i < numeroAlunos; i++) {
			System.out.println("Digite a idade do Aluno: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Digite o nome do Aluno: ");
			String nome = sc.nextLine();
			
			listaAlunos.add(new Aluno(idade, nome));
			
		}
		for(Aluno i: listaAlunos) {
			System.out.println(i);
		}

	}

}
