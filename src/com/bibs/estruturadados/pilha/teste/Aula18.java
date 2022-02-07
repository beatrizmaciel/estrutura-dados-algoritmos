package com.bibs.estruturadados.pilha.teste;

import java.util.Stack;

import com.bibs.estruturadados.pilha.Pilha;

public class Aula18 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack.isEmpty());
		
		// push para empilhar
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack);
		// peek para "espiar"
		System.out.println(stack.peek());
		// pop para desempilhar
		System.out.println(stack.pop());
		
		System.out.println(stack);
	}

}
