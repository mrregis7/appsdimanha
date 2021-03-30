package br.edu.infnet.appsdim.aula01;

public class ExemploTeste {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setId(1);
		aluno.setNome("Matheus");
		aluno.setEmail("matheus@gmail.com");
		System.out.println(aluno);
	}
}
