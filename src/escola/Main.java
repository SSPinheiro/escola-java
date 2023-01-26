package escola;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bem vindo ao programa Escola");
		Aluno cleto = new Aluno(1138,Genero.MASCULINO,"Cleto",new Date(1992,11,13));
		Aluno samuel = new Aluno(1139,Genero.MASCULINO,"Samuel", new Date(2002,05,31));
		System.out.println(cleto);
		System.out.println(samuel);
	}

}
