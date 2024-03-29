package com.bibs.estruturadados;

import java.lang.reflect.Array;

//   \/ generics
public class List<T> {

	private T[] elementos;
	public int tamanho;

	// java não permite construtor com <T>, então usamos o casting
	public List(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0; 
	}

	public boolean adiciona(T elemento){
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	public boolean adiciona(int posicao, T elemento) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}

		this.aumentaCapacidade();

		// mover todos os elementos
		for (int i = this.tamanho-1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		// atribuir o elemento para a posição certa
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[])new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public T busca(int posicao) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return elementos[posicao];
	}

	public int busca(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for(int i = posicao; i < this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;

	}


	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");

		return s.toString();
	}

	public boolean contem(T elemento) {

		int pos = busca(elemento);
		if (pos > -1) {
			return true;
		}

		return false;
	}

	public int ultimoIndice(T elemento) {

		for (int i = this.tamanho - 1; i >= 0; i--) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}


	// minha tentativa \/ tentativa correta /\

	//	public int ultimoIndice(int posicao) {
	//		for (int i = 0; i >= tamanho; i++) {
	//			if (i == tamanho) {
	//				i = posicao;
	//				return posicao;
	//			}
	//		}
	//		
	//		return -1;
	//	}

	public void remove(T elemento) {
		int pos = this.busca(elemento);
		if (pos > -1) {
			this.remove(pos);
		}
	}

	public T obtem(int posicao) {
		return this.busca(posicao);
	}

	// minha tentativa \/ tentativa correta /\

	//	public int obtem(int posicao) {
	//		int pos = this.busca(posicao);
	//		if (pos > -1) {
	//			return pos;
	//		}
	//	}


	public void limpa() {

		// opção 3 (ajuda o garbage colector)

		for (int i = 0; i < this.tamanho; i++) {
			this.elementos[i] = null;
		}

		this.tamanho = 0;
	}

	// minha tentativa \/ tentativa correta /\

	//	public void limpa() {
	//		int posicao = 0;
	//		if (posicao < this.tamanho) {
	//			for(int i = posicao; i < this.tamanho-1; i++) {
	//				this.elementos[i] = this.elementos[i+1];
	//				posicao++;
	//			}
	//		}
	//		this.tamanho--;
}