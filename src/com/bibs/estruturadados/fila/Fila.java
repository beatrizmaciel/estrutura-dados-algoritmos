package com.bibs.estruturadados.fila;

import com.bibs.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica {

	public Fila() {
		super();
	}
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfileira(T elemento) {
//		this.elementos[this.tamanho] = elemento;
//		this.tamanho++;

		this.adiciona(elemento);
		
	}
	
	public T espiar() {
		if(this.estaVazio()) {
			return null;
		}
		return (T) this.elementos[0];
	}
	
public T desenfileira(){
		
		final int pos = 0;
		
		if (this.estaVazio()){
			return null;
		}
		
		T elementoASerRemovido = (T) this.elementos[pos];
		
		this.remove(pos);
		
		return elementoASerRemovido;
		
	}
	
}
