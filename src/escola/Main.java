package escola;

import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bem vindo ao programa Escola");
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
		
		System.out.println(opcao);
		
		Aluno cleto = new Aluno(1138, Genero.MASCULINO, "Cleto", new Date(1992, 11, 13));
		Aluno samuel = new Aluno(1139, Genero.MASCULINO, "Samuel", new Date(2002, 05, 31));
		Aluno jose = new Aluno(1129, Genero.MASCULINO, "José", new Date(1980, 07, 15));
		System.out.println("Os alunos cadastrados são: ");
		System.out.println(cleto);
		System.out.println(samuel);
		System.out.println(jose);
	}

}
