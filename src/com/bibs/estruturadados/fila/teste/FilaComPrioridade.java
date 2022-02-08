package com.bibs.estruturadados.fila.teste;

import com.bibs.estruturadados.fila.Fila;

public class FilaComPrioridade<T> extends Fila<T> {

	public void enfileira(T elemento){

		Comparable<T> chave = (Comparable<T>) elemento;

		int i;
		for (i=0; i<this.tamanho; i++){
			if (chave.compareTo((T) this.elementos[i]) < 0){
				break;
			}
		}
		this.adiciona(i, elemento);
	}
}
