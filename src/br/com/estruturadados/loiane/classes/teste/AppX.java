package br.com.estruturadados.loiane.classes.teste;

import br.com.estruturadados.loiane.classes.Vetor;

public class AppX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Vetor vetor = new Vetor(10);
		
		vetor.adiciona("B"); //0
		vetor.adiciona("G"); //1
		vetor.adiciona("D"); //2
		vetor.adiciona("E"); //3
		vetor.adiciona("F"); //4
		
		System.out.println(vetor);
		
		vetor.remove(1);
		
		System.out.println(vetor);
		
		int pos = vetor.busca("E");
		System.out.println("Removendo elemento " + pos);
		
		if (pos > -1) {
			vetor.remove(pos);
		}else{
			System.out.println("Elemento não encontrado!!!");
		}
		
		System.out.println(vetor);
		

	}

}
