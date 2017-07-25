package br.com.estruturadados.loiane.labs;

import java.util.Scanner;

import br.com.estruturadados.loiane.classes.Contato;
import br.com.estruturadados.loiane.classes.Lista;

public class Exer6 {

	public static void main(String[] args) {

		// criação das variáveis
		Scanner scan = new Scanner(System.in);

		// criar vetor com 20 de capacidade
		Lista<Contato> lista = new Lista<Contato>(20);

		// criar e adicionar X contatos
		// criarContatosDinamicamente(5, lista);
		
		//criar um menu para que o usuário escolha a opção
		int opcao = 1;
		
		while (opcao != 0) {
			opcao = obterOpcaoMenu(scan);
			
			switch (opcao) {
			case 1:
				adicionarContatoFinal(scan, lista);
				break;
			case 2:
				
				break;

			default:
				break;
			}
		}
		
		System.out.println("Usuario digitou 0, programa terminado.");
	}

	
	//Função entranda de dados
	protected static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista){
		
		System.out.println("Criando um contato, entre com as informaçoes: ");
		String nome = leInformacao("Entre com um nome", scan);
		String telefone = leInformacao("Entre com um telefone", scan);
		String email = leInformacao("Entre com um email", scan);
		
		Contato contato = new Contato(nome, telefone, email);
		
		lista.adiciona(contato);
		
		System.out.println("Contato adicionado com Sucesso!");
		
	}
	
	protected static String leInformacao(String msg, Scanner scan){
		
		System.out.println(msg);
		String entrada = scan.nextLine();
		
		return entrada;
	}
	
	
	protected static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 0;
		String entrada;

		while (!entradaValida) {

			System.out.println("Digite a opção desejada:");
			System.out.println("1: Adiciona contato no final do vetor");
			System.out.println("2: Adiciona contato em uma posição específica");
			System.out.println("3: Obtém contato de uma posição específica");
			System.out.println("4: Consulta contato");
			System.out.println("5: Consulta último índide do contato");
			System.out.println("6: Verifica se contato existe");
			System.out.println("7: Excluir por posição");
			System.out.println("8: Excluir contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Excluir todos os contatos do vetor");
			System.out.println("11: Imprime vetor");
			System.out.println("0: Sair");

			try {

				entrada = scan.nextLine();
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

	public static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {

		Contato contato;

		for (int i = 1; i <= quantidade; i++) {

			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("1111111" + i);
			contato.setEmail("contato" + i + "@email.com");

			lista.adiciona(contato);
		}
	}

}
