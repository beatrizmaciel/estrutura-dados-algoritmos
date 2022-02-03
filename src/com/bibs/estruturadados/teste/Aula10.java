package com.bibs.estruturadados.teste;

import com.bibs.estruturadados.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjetos vetorObj = new VetorObjetos(3);
		
		Contato c1 = new Contato("Contato 1", "9876543", "cont1@email.com");
		Contato c2 = new Contato("Contato 2", "9853243", "cont2@email.com");
		Contato c3 = new Contato("Contato 3", "9235643", "cont3@email.com");
		Contato c4 = new Contato("Contato 1", "9876543", "cont1@email.com");
						
		vetorObj.adiciona(c1);
		vetorObj.adiciona(c2);
		vetorObj.adiciona(c3);
		
		System.out.println("Tamanho = " + vetorObj.tamanho());
		
		int pos = vetorObj.busca(c4);
		if (pos > -1) {
			System.out.println("O elemento existe no vetor");
		} else {
			System.out.println("O elemento não existe no vetor");
		}
		
		System.out.println(vetorObj);

	}

}
