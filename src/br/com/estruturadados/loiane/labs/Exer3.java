package br.com.estruturadados.loiane.labs;

import br.com.estruturadados.loiane.classes.Lista;

public class Exer3 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		
		System.out.println(lista);
		
		lista.remove("E");
		
		System.out.println(lista);
		
		lista.remove("B");
		
		System.out.println(lista);
		
		lista.remove("D");
		
		System.out.println(lista);
	}
}
