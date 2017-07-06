package br.com.estruturadados.loiane.labs;

import java.util.ArrayList;

import br.com.estruturadados.loiane.classes.Lista;

public class Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("A");
		
		System.out.println(arrayList.lastIndexOf("A"));
		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("A");
		
		System.out.println(lista.ultimoIndice("A"));

	}

}
