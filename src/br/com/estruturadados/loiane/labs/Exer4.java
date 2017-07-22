package br.com.estruturadados.loiane.labs;

import br.com.estruturadados.loiane.classes.Lista;

public class Exer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista<String> lista = new Lista<>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");

		System.out.println(lista.contem(0));
		System.out.println(lista.contem(2));
		System.out.println(lista.contem(4));
	}
}
