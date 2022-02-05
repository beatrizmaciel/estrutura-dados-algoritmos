package com.bibs.estruturadados.labs;

import java.util.ArrayList;

import com.bibs.estruturadados.List;

public class Ex05 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>(5);
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		
		System.out.println(arrayList);
		
		arrayList.clear();
		
		System.out.println(arrayList);
		
		List<String> lista = new List<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		
		System.out.println(lista);
		
		lista.limpa();
	
		System.out.println(lista);

	}

}
