package com.bibs.estruturadados.labs;

import com.bibs.estruturadados.List;

public class Ex02 {

	public static void main(String[] args) {
		
		List<String> lista = new List<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("A");
		
		System.out.println(lista.ultimoIndice("A"));

	}

}
