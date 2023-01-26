package escola;

import java.util.Date;

public class Aluno {
	private int matricula;
	private Genero genero;
	private String nome;
	private Date dataDeNascimento;

	public Aluno(int matricula, Genero genero, String nome, Date dataDeNascimento) {
		this.matricula = matricula;
		this.genero = genero;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		
	}
}
