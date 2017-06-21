package br.com.estruturadados.loiane.classes.teste;

import br.com.estruturadados.loiane.classes.Vetor;

public class AppS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("B"); //0
		vetor.adiciona("C"); //1
		vetor.adiciona("E"); //2
		vetor.adiciona("F"); //3
		vetor.adiciona("G"); //4
		vetor.adiciona("H"); //5
		
		System.out.println(vetor);
		
		vetor.adiciona(0, "A");
		
		System.out.println(vetor);
		
		vetor.adiciona(3, "D");
		
		System.out.println(vetor);

	}

}
