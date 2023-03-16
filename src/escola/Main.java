package escola;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Repositorio repositorio = new Repositorio();
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
				incluir(repositorio);
				break;
			case 2:
				listar(repositorio);
				break;
			}

		} while (opcaoNumero > 0 && opcaoNumero < 4);
		System.out.println("Até logo! Tenha um bom dia.");

	}

	public static void incluir(Repositorio repositorio) {
		System.out.println("Iniciando inclusão do aluno");
		Aluno aluno = new Aluno(123, Genero.MASCULINO, "Sam", Date.valueOf("2002-10-02"));
		repositorio.incluir(aluno);

	}

	public static void listar(Repositorio repositorio) {
		System.out.println("Iniciando a listagem de alunos");
		List<Aluno> alunos = repositorio.getAlunos();
		for (Aluno aluno : alunos) {
			System.out.println("- " + aluno.getNome() + " " + aluno.getMatricula());
		}
		if (alunos.isEmpty() == true) {
			System.out.println("A lista está vazia");

		}

	}

}