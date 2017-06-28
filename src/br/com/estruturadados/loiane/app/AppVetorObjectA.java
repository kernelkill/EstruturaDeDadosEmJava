package br.com.estruturadados.loiane.app;

import br.com.estruturadados.loiane.classes.Contato;
import br.com.estruturadados.loiane.classes.VetorObject;

public class AppVetorObjectA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VetorObject vetor = new VetorObject(3);
		
		Contato c1 = new Contato("Joao", "1234-5678", "contato1@gmail.com");
		Contato c2 = new Contato("Manuel", "5678-4321", "contato2@gmail.com");
		Contato c3 = new Contato("Pedro", "9876-1239", "contato3@gmail.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.getTamanho());
		System.out.println(vetor);

	}

}
