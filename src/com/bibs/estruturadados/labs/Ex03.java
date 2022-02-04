package com.bibs.estruturadados.labs;

import com.bibs.estruturadados.List;

public class Ex03 {

	public static void main(String[] args) {
		
		List<String> lista = new List<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		
		System.out.println(lista);
		
		lista.remove("A");
		
		System.out.println(lista);
		
		lista.remove("E");
		
		System.out.println(lista);
		
		lista.remove("C");
		
		System.out.println(lista);
		
	}

}
