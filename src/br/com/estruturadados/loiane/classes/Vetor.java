package br.com.estruturadados.loiane.classes;

import java.util.Arrays;

public class Vetor {
	
	private String[] elemento;
	private int tamanho;
	
	
	public Vetor(int capacidade){
		this.elemento = new String[capacidade];
	}
	
//	public void adiciona(String elemento){
//		for (int i = 0; i < this.elemento.length; i++) {
//			if (this.elemento[i] == null) {
//				this.elemento[i] = elemento;
//				break;
//			}
//		}
//	}
	
//	public void adiciona(String elemento) throws Exception{
//		if (this.tamanho < this.elemento.length) {
//			this.elemento[this.tamanho] = elemento;
//			this.tamanho++;
//			
//		}else{
//			throw new Exception("Não é possivel adicionar mais elementos"); 
//		}
//	}
	
	public boolean adiciona(String elemento){
		if (this.tamanho < this.elemento.length) {
			this.elemento[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
//	public String busca(int posicao){
//		if (!(posicao >= 0 && posicao < tamanho)) {
//			throw new IllegalArgumentException("Posicao Invalida!");
//		}
//		return this.elemento[posicao];
//	}
	
	public int busca(String elemento){
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elemento[i].equals(elemento)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public int getTamanho(){
		return this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append(" [ ");
		
		for (int i = 0; i < this.tamanho-1; i++) {
			s.append(elemento[i]);
			s.append(", ");
		}
		
		if (this.tamanho>0) {
			s.append(elemento[this.tamanho-1]);
		}
		s.append("]");
		
		return s.toString();
		//return Arrays.toString(elemento);
	}
	
	
}
