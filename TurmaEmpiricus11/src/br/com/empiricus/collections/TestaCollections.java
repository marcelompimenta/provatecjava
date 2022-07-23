package br.com.empiricus.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaCollections {

	public static void main(String[] args) {
		//Collections --> é um objeto que serve pra armamzenar muitos elementos...
		
		String aula1 = "D - Code - Tank";
		String aula2 = "A - SpringBoot";
		String aula3 = "C - Java - Mobile";
		String aula4 = "1 - Java - Redes";

		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1); // --> [0]
		aulas.add(aula2); // --> [1]
		aulas.add(aula3); // --> [2]
		aulas.add(aula4); // --> [3]
		
		/*System.out.println(aulas);
		aulas.remove(2);
		System.out.println(aulas);
		System.out.println(aulas.get(2));*/
		
		//for each
		/*for(String i : aulas) {
			System.out.println(i);
		}*/
		
		/*System.out.println(aulas.get(1));
		
		String aulaQualquer = aulas.get(3);
		
		System.out.println(aulaQualquer);*/
		
		/*for(int i = 0; i < aulas.size(); i++) {
			System.out.println(aulas.get(i));
		}*/
		
		//System.out.println(aulas.size());
		
		Collections.sort(aulas);//Ordem crescente da lista...
		
		System.out.println(aulas);
		
		Collections.shuffle(aulas);//Lista embaralhada
		
		System.out.println(aulas);
		
	}

}
