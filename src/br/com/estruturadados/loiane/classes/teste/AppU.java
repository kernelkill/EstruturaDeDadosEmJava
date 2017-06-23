package br.com.estruturadados.loiane.classes.teste;

import br.com.estruturadados.loiane.classes.Vetor;

public class AppU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vetor vetor = new Vetor(3);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		vetor.adiciona("elemento 4");
		vetor.adiciona("elemento 5");
		vetor.adiciona("elemento 6");
		
		System.out.println(vetor);

	}

}
