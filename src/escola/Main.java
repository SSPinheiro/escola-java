package escola;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcaoNumero = 0;
		System.out.println("Bem vindo ao programa Escola");
		do {
			System.out.println("");
			System.out.println("########## Menu #########");
			System.out.println("[1] - Incluir Aluno");
			System.out.println("[2] - Listar Alunos");
			System.out.println("[3] - Excluir Aluno");
			System.out.println("[4] - Sair");
			System.out.println("");
			System.out.println("Digite a opção desejada:");

			Scanner scanner = new Scanner(System.in);
			String opcao = scanner.nextLine();
			try {
				opcaoNumero = Integer.parseInt(opcao);
			} catch (NumberFormatException e) {
				System.out.println("Opção de menu inválida.");
			}
			switch (opcaoNumero) {
			case 1:
				incluirAluno();
				break;
			case 2:
				System.out.println("Abrindo listagem");
				break;
			}

		} while (opcaoNumero > 0 && opcaoNumero < 4);
		System.out.println("Até logo! Tenha um bom dia.");

	}
	public static void incluirAluno() {
		System.out.println("Iniciando inclusão do aluno");
		
	}
}
