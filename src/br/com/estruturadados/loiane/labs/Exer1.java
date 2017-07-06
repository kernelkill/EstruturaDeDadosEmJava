package br.com.estruturadados.loiane.labs;

import br.com.estruturadados.loiane.classes.Lista;

public class Exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista<String> lista = new Lista<>(4);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("E"));

	}

}
