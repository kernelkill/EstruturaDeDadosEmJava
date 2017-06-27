package br.com.estruturadados.loiane.app;

import br.com.estruturadados.loiane.classes.Vetor;

public class AppW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		System.out.printf("Foi adicionado " + vetor.getTamanho() + " elementos." );
		System.out.println( );
		System.out.println(vetor.toString());
		//System.out.println("Vc fez a busca pela posicão de " + vetor.busca(3));

	}

}
