package br.edu.infnet.appsdim.aula01;

import java.util.ArrayList;
import java.util.List;

public class ExemploTeste {
	public static void main(String[] args) {
		
		String[] nomes = {"Matheus", "maria", "larissa", "joao"};
		String[] emails = {"matheus@matheus.com", "maria@maria.com", "larissa@larissa.com", "joao@joao.com"};

		List<Aluno> alunos = new ArrayList<Aluno>();		
		
		//Criar objetos: populando a colecao
		for (int i = 0; i < nomes.length; i++) {
			Aluno aluno = new Aluno();
			aluno.setId(i+1);
			aluno.setNome(nomes[i]);
			aluno.setEmail(emails[i]);
			alunos.add(aluno);
		}
		
		//Leitura da colecao
		for (Aluno item : alunos) {
			System.out.println(item);
		}
	}
}
