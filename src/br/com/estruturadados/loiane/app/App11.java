package br.com.estruturadados.loiane.app;

import br.com.estruturadados.loiane.classes.Lista;

public class App11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista<String> lista = new Lista<String>(1);
		
		lista.adiciona("Elemento");
		
		System.out.println(lista);

	}

}
