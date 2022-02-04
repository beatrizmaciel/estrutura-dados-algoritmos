package com.bibs.estruturadados.teste;

import com.bibs.estruturadados.VetorObjetos;
import com.bibs.estruturadados.List;

public class Aula11 {

	public static void main(String[] args) {
		
		List<String> vetor = new List<String>(1);
		vetor.adiciona("Elemento 1");
		vetor.adiciona("Elemento 2");
		
		System.out.println(vetor);

	}

}
