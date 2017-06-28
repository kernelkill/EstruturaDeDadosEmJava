package br.com.estruturadados.loiane.classes;

public class Lista {
	
	private Object[] elemento;
	private int tamanho;
	
	
	public Lista(int capacidade){
		this.elemento = new Object[capacidade];
	}
	
	public boolean adiciona(Object elemento){
		
		this.aumentaCapacidade();
		
		if (this.tamanho < this.elemento.length) {
			this.elemento[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	
	public boolean adiciona(int posicao, Object elemento){
		
		this.aumentaCapacidade();
		
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao Invalida!");
		}
		
		for (int i = this.tamanho-1; i >=posicao; i--) {
			this.elemento[i+1] = this.elemento[i];
		}
		
		this.elemento[posicao] = elemento;
		this.tamanho++;

		return true;
	}
	
	
	//B G D E F  Posição a ser removido é 1 (G)
	//0 1 2 3 4  Tamanho do vetor é 5
	//vetor[1] = vetor[2];
	//vetor[2] = vetor[3];
	//vetor[3] = vetor[4];
	public void remove(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao Invalida!");
		}
		
		for (int i = posicao; i < tamanho-1; i++) {
			this.elemento[i] = this.elemento[i+1];
		}
		this.tamanho--;
		
	}
	
	public void aumentaCapacidade(){
		if (this.tamanho == elemento.length) {
			Object[] elementosNovos = new Object[elemento.length * 2];
			for (int i = 0; i < elemento.length; i++) {
				elementosNovos[i] = elemento[i];
			}
			
			elemento = elementosNovos;
		}
	}
	
//	public String busca(int posicao){
//		if (!(posicao >= 0 && posicao < tamanho)) {
//			throw new IllegalArgumentException("Posicao Invalida!");
//		}
//		return this.elemento[posicao];
//	}
	
	public int busca(Object elemento){
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elemento[i].equals(elemento)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public int getTamanho(){
		return this.tamanho;
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
