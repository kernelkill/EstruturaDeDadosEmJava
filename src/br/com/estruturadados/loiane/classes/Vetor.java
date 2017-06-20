package br.com.estruturadados.loiane.classes;

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
}
