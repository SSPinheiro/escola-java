package escola;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bem vindo ao programa Escola");
		Aluno cleto = new Aluno(1138,Genero.MASCULINO,"Cleto",new Date(1992,11,13));
		Aluno samuel = new Aluno(1139,Genero.MASCULINO,"Samuel", new Date(2002,05,31));
		Aluno jose = new Aluno(1129,Genero.MASCULINO,"José", new Date(1980,07,15));
		System.out.println(cleto);
		System.out.println(samuel);
		System.out.println(jose);
	}

}
