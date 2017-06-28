package br.com.estruturadados.loiane.app;

import br.com.estruturadados.loiane.classes.VetorObject;

public class AppVetorObjectA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VetorObject vetor = new VetorObject(3);
		
		vetor.adiciona(1);
		vetor.adiciona(2);
		vetor.adiciona(3);
		
		System.out.println("Tamanho = " + vetor.getTamanho());
		System.out.println(vetor);

	}

}
