package com.bibs.estruturadados.labs;

import com.bibs.estruturadados.List;

public class Ex01 {
	
	public static void main(String[] args) {
		
		List<String> lista = new List<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("E"));
	}

}
