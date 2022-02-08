package com.bibs.estruturadados.fila.teste;

import com.bibs.estruturadados.fila.Fila;

public class Aula21 {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<Integer>();
		
		fila.enfileira(1);
		fila.enfileira(2);
		
		System.out.println(fila.espiar());
		
		System.out.println(fila.toString());
		
	}

}
