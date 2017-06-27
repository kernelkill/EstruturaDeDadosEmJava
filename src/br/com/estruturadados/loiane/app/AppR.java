package br.com.estruturadados.loiane.app;

import br.com.estruturadados.loiane.classes.Vetor;

public class AppR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vetor vetor = new Vetor(6);
		
		vetor.adiciona("elemento 1"); //0
		vetor.adiciona("elemento 2"); //1
		vetor.adiciona("elemento 3"); //2
		vetor.adiciona("elemento 4"); //3
		vetor.adiciona("elemento 5"); //4
		vetor.adiciona("elemento 6"); //5
		
		System.out.println(vetor.busca("elemento 4"));
		System.out.println(vetor.busca("elemento 6"));
		System.out.println(vetor.busca("elemento 8"));

	}

}
