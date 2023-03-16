package escola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Repositorio {
	private List<Aluno> alunos = new ArrayList<>();

	public List<Aluno> getAlunos() {
		return Collections.unmodifiableList(this.alunos);
	}

	public void incluir(Aluno aluno) {
		this.alunos.add(aluno);
	}
}
