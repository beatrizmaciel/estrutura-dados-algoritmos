package com.bibs.estruturadados.pilha.labs;

import java.util.Scanner;

import com.bibs.estruturadados.pilha.Pilha;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i <= 10; i++) {
			System.out.println("Escreva um número:");
			int num = sc.nextInt();
			
			if (num % 2 == 0) {
				System.out.println("Empilhando o número " + num);
				pilha.empilha(num);
			} else {
				
				Integer desempilhado = pilha.desempilha();
				
				if(desempilhado == null) {
					System.out.println("Pilha está vazia");
				} else {
					System.out.println("Número ímpar, desempilhando o elemento da pilha "
							+ desempilhado);
				}
			}
		}
		
		System.out.println("Todos os números foram lidos, desempilhando números da pilha");
		
		while(!pilha.estaVazio()) {

				System.out.println("Desempilhando o elemento da pilha "
						+ pilha.desempilha());
			}
		
		System.out.println("Todos os elementos foram desempilhados");
		
	}

}
