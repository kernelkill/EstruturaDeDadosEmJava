package br.com.estruturadados.loiane.labs;

import java.util.ArrayList;

import br.com.estruturadados.loiane.classes.Lista;

public class Exer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> arrayList = new ArrayList<>(5);
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		
		System.out.println(arrayList);
		
		arrayList.clear();
		
		System.out.println(arrayList);
		
		Lista<String> lista = new Lista<>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		
		System.out.println(lista);
		
		lista.limpar();
		
		System.out.println(lista);
	}

}
