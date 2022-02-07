package com.bibs.estruturadados.labs;

import java.util.Scanner;
import java.util.ArrayList;

import com.bibs.estruturadados.teste.Contato;

public class Ex07 extends Ex06 {

	public static void main(String[] args) {
		
		// criação de variáveis
		Scanner sc = new Scanner(System.in);

		// criar vetor com 20 de capacidade
		ArrayList<Contato> lista = new ArrayList<Contato>(20);

		// criar e adicionar contatos
		criarContatosDinamicamente(5, lista);

		// criar um menu para que o usuário escolha a opção
		int opcao = 1;
		while (opcao != 0) {
			opcao = obterOpcaoMenu(sc);

			switch (opcao) {
			case 1:
				adicionarContatoFinal(sc, lista);
				break;
			case 2:
				adicionarContatoPosicao(sc, lista);
				break;
			case 3:
				obtemContatoPosicao(sc, lista);
				break;
			case 4:
				obtemContato(sc, lista);
				break;
			case 5:
				pesquisarUltimoIndice(sc, lista);
				break;
			case 6:
				pesquisarContatoExiste(sc, lista);
				break;
			case 7:
				excluirPorPosicao(sc, lista);
				break;
			case 8:
				excluirContato(sc, lista);
				break;
			case 9:
				imprimeTamanhoVetor(lista);
				break;
			case 10:
				limparVetor(lista);
				break;
			case 11:
				imprimeVetor(lista);
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
		}
		System.out.println("Usuário digitou 0, programa terminado9");
	}
	
	private static void imprimeVetor(ArrayList<Contato> lista) {
		System.out.println(lista);
	}
	
	private static void limparVetor(ArrayList<Contato> lista) {
		lista.clear();
		System.out.println("Todos os contatos foram excluídos");
	}
	
	private static void imprimeTamanhoVetor(ArrayList<Contato> lista) {
		System.out.println("Tamanho do vetor é " + lista.size());
	}

	private static void excluirContato(Scanner sc, ArrayList<Contato> lista) {
		int pos = leInformacaoInt("Entre com a posição a ser removida", sc);
		try {
			Contato contato = lista.get(pos);
			lista.remove(contato);
		} catch (Exception e) {
			System.out.println("Contato excluído");
		}
	}

	private static void excluirPorPosicao(Scanner sc, ArrayList<Contato> lista) {
		int pos = leInformacaoInt("Entre com a posição a ser removida", sc);
		try {
			lista.remove(pos);
		} catch (Exception e) {
			System.out.println("Contato excluído");
		}
	}

	private static void pesquisarContatoExiste(Scanner sc, ArrayList<Contato> lista) {
		int pos = leInformacaoInt("Entre com a posição", sc);
		try {
			Contato contato = lista.get(pos);
			System.out.println("Contato existe, seguem dados");
			System.out.println(contato);

			boolean existe = lista.contains(contato);

			if(existe) {
				System.out.println("Contato existe, seguem dados:");
				System.out.println(contato);
			} else {
				System.out.println("Contato não existe");
			}

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void pesquisarUltimoIndice(Scanner sc, ArrayList<Contato> lista) {
		int pos = leInformacaoInt("Entre com a posição", sc);
		try {
			Contato contato = lista.get(pos);
			System.out.println("Contato existe, seguem dados");
			System.out.println(contato);
			System.out.println("Fazendo pesquisa do último índice contato encontrado: ");
			pos = lista.lastIndexOf(contato);

			System.out.println("Contato encontrado na posição " + pos);
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void obtemContato(Scanner sc, ArrayList<Contato> lista) {
		int pos = leInformacaoInt("Entre com a posição", sc);
		try {
			Contato contato = lista.get(pos);
			System.out.println("Contato existe, seguem dados");
			System.out.println(contato);
			System.out.println("Fazendo pesquisa do contato encontrado: ");
			pos = lista.indexOf(contato);

			System.out.println("Contato encontrado na posição " + pos);
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void obtemContatoPosicao(Scanner sc, ArrayList<Contato> lista) {
		int pos = leInformacaoInt("Entre com a posição", sc);
		try {
			Contato contato = lista.get(pos);
			System.out.println("Contato existe, seguem dados");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void adicionarContatoFinal(Scanner sc, ArrayList<Contato> lista) {
		System.out.println("Criando um contato. Insira as informações: ");
		String nome = leInformacao("Digite o nome", sc);
		String telefone = leInformacao("Digite o telefone", sc);
		String email = leInformacao("Digite o email", sc);

		Contato contato = new Contato(nome, telefone, email);

		lista.add(contato);
		System.out.println("Contato adicionado com sucesso");
		System.out.println(contato);
	}

	private static void adicionarContatoPosicao(Scanner sc, ArrayList<Contato> lista) {
		System.out.println("Criando um contato. Insira as informações: ");
		String nome = leInformacao("Digite o nome", sc);
		String telefone = leInformacao("Digite o telefone", sc);
		String email = leInformacao("Digite o email", sc);

		Contato contato = new Contato(nome, telefone, email);

		int pos = leInformacaoInt("Entre com a posição a adicionar o contato", sc);

		try {
			lista.add(pos, contato);
			System.out.println("Contato adicionado com sucesso");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida, contato não adicionado");
		}

		lista.add(contato);
		System.out.println("Contato adicionado com sucesso");
		System.out.println(contato);
	}

	private static String leInformacao(String msg, Scanner sc) {
		System.out.println(msg);
		String entrada = sc.nextLine();

		return entrada;
	}


	private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {

		Contato contato;
		for (int i = 1; i <= quantidade; i++) {
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("11111111 " + i);
			contato.setEmail("contato" + i + "@email.com");

			lista.add(contato);
		}
	}

}
