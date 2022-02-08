package com.bibs.estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {

	public static void main(String[] args) {

		Queue<Integer> fila = new LinkedList<>();
		
		//enqueue = enfileirar
		fila.add(1);
		fila.add(2);
		
		System.out.println(fila);

		// para  "espiar"
		System.out.println(fila.peek());
		
		// dequeue = desinfileirar
		System.out.println(fila.remove());
		
		System.out.println(fila);
	}

}
