package br.com.estruturadados.loiane.app;

import java.util.ArrayList;

public class App12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("A");
		arrayList.add("C");
		
		System.out.println(arrayList);
		
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		boolean existe = arrayList.contains("B");
		
		if (existe) {
			System.out.println("Elemento existe no array");
		}else{
			System.out.println("Elemento não existe no array");
		}
		
		int pos = arrayList.indexOf("F");
		
		if (pos > -1) {
			System.out.println("Elemento existe no array " + pos);
		} else {
			System.out.println("Elemento não existe no array " + pos);
		}
		
		System.out.println(arrayList.get(2));
		
		arrayList.remove(0);
		arrayList.remove("B");
		
		System.out.println(arrayList);
	}
}
