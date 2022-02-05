package com.bibs.estruturadados.labs;

import java.util.Scanner;

import com.bibs.estruturadados.List;
import com.bibs.estruturadados.teste.Contato;

public class Ex06 {

	public static void main(String[] args) {

		// criação de variáveis
		Scanner sc = new Scanner(System.in);

		// criar vetor com 20 de capacidade
		List<Contato> lista = new List<Contato>(20);

		// criar e adicionar contatos
		//		criarContatosDinamicamente(5, lista);

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
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;
			case 9:
				
				break;
			case 10:
				
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
		}
		System.out.println("Usuário digitou 0, programa terminado9");
	}
	
	private static void obtemContato(Scanner sc, List<Contato> lista) {
		int pos = leInformacaoInt("Entre com a posição", sc);
		try {
			Contato contato = lista.busca(pos);
			System.out.println("Contato existe, seguem dados");
			System.out.println(contato);
			System.out.println("Fazendo pesquisa do contato encontrado: ");
			pos = lista.busca(contato);
			
			System.out.println("Contato encontrado na posição " + pos);
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void obtemContatoPosicao(Scanner sc, List<Contato> lista) {
		int pos = leInformacaoInt("Entre com a posição", sc);
		try {
			Contato contato = lista.busca(pos);
			System.out.println("Contato existe, seguem dados");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void adicionarContatoFinal(Scanner sc, List<Contato> lista) {
		System.out.println("Criando um contato. Insira as informações: ");
		String nome = leInformacao("Digite o nome, sc", sc);
		String telefone = leInformacao("Digite o telefone", sc);
		String email = leInformacao("Digite o email", sc);

		Contato contato = new Contato(nome, telefone, email);

		lista.adiciona(contato);
		System.out.println("Contato adicionado com sucesso");
		System.out.println(contato);
	}

	private static void adicionarContatoPosicao(Scanner sc, List<Contato> lista) {
		System.out.println("Criando um contato. Insira as informações: ");
		String nome = leInformacao("Digite o nome, sc", sc);
		String telefone = leInformacao("Digite o telefone", sc);
		String email = leInformacao("Digite o email", sc);

		Contato contato = new Contato(nome, telefone, email);

		int pos = leInformacaoInt("Entre com a posição a adicionar o contato", sc);

		try {
			lista.adiciona(pos, contato);
			System.out.println("Contato adicionado com sucesso");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida, contato não adicionado");
		}

		lista.adiciona(contato);
		System.out.println("Contato adicionado com sucesso");
		System.out.println(contato);
	}

	private static String leInformacao(String msg, Scanner sc) {
		System.out.println(msg);
		String entrada = sc.nextLine();

		return entrada;
	}

	private static int leInformacaoInt(String msg, Scanner sc) {

		boolean entradaValida = false;
		int num = 0;

		while (!entradaValida) {
			try {
				System.out.println(msg);
				String entrada = sc.nextLine();

				num = Integer.parseInt(entrada);

				entradaValida = true;

			} catch (Exception e){
				System.out.println("Entrada inválida, digite novamente");
			}

		}

		return num;
	}

	private static int obterOpcaoMenu(Scanner sc) {

		boolean entradaValida = false;
		int opcao = 0;
		String entrada;

		while (!entradaValida) {
			System.out.println("Digite a opção desejada: ");
			System.out.println("1: Adiciona contato no final do vetor");
			System.out.println("2: Adiciona contato em uma posição específica");
			System.out.println("3: Obtém contato de uma posição específica");
			System.out.println("4: Consulta contato");
			System.out.println("5: Consulta último índice do conteto");
			System.out.println("6: Verifica se o contato existe");
			System.out.println("7: Excluir contato por posição");
			System.out.println("8: Excluir contao");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Exclui todos os contatos do vetor");
			System.out.println("11: Imprime vetor");
			System.out.println("0: Sair");

			try {
				entrada = sc.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao >= 0 && opcao <= 11) {
					entradaValida = true;
				} else {
					throw new Exception();
				}

			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente\n\n");
			}

		}


		return opcao;
	}

	// criar contatos
	private static void criarContatosDinamicamente(int quantidade, List<Contato> lista) {

		Contato contato;
		for (int i = 1; i <= quantidade; i++) {
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("11111111 " + i);
			contato.setEmail("contato" + i + "@email.com");

			lista.adiciona(contato);
		}
	}
}